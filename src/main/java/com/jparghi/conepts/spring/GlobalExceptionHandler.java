package com.jparghi.conepts.spring;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class GlobalExceptionHandler {

  @ExceptionHandler(Exception.class)
  public void handleException(HttpServletRequest request, HttpServletResponse response, Exception ex) throws Exception {
    request.setAttribute("originalUri", request.getRequestURI());
    request.getRequestDispatcher("/error").forward(request, response);
  }
}
