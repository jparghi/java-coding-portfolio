package com.jparghi.conepts.spring;

import org.springframework.boot.web.servlet.error.ErrorController;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.context.request.WebRequest;

import javax.servlet.RequestDispatcher;
import javax.servlet.http.HttpServletRequest;
import java.io.PrintWriter;
import java.io.StringWriter;

@Controller
public class ErrorController_ReadError implements ErrorController {

  @RequestMapping("/error")
  public ResponseEntity<ErrorMessage> handleError(HttpServletRequest request, WebRequest webRequest) {
    Object status = request.getAttribute(RequestDispatcher.ERROR_STATUS_CODE);
    HttpStatus httpStatus = HttpStatus.INTERNAL_SERVER_ERROR; // Default to 500

    if (status != null) {
      try {
        httpStatus = HttpStatus.valueOf(Integer.parseInt(status.toString()));
      } catch (Exception ex) {
        // Ignore if unable to parse status code
      }
    }

    Throwable throwable = (Throwable) request.getAttribute(RequestDispatcher.ERROR_EXCEPTION);
    String stackTrace = getStackTrace(throwable);

    ErrorMessage errorMessage = new ErrorMessage(httpStatus.value(), httpStatus.getReasonPhrase(), stackTrace);
    return new ResponseEntity<>(errorMessage, httpStatus);
  }

  private String getStackTrace(Throwable throwable) {
    if (throwable == null) {
      return "";
    }
    StringWriter sw = new StringWriter();
    PrintWriter pw = new PrintWriter(sw);
    throwable.printStackTrace(pw);
    return sw.toString();
  }

  // Simple ErrorMessage class to hold the error information
  public static class ErrorMessage {
    private int status;
    private String error;
    private String stackTrace;

    public ErrorMessage(int status, String error, String stackTrace) {
      this.status = status;
      this.error = error;
      this.stackTrace = stackTrace;
    }

    // Getters for status, error, and stackTrace
    public int getStatus() {
      return status;
    }

    public String getError() {
      return error;
    }

    public String getStackTrace() {
      return stackTrace;
    }
  }
}
