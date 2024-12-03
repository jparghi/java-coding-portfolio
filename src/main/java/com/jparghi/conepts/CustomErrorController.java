package com.jparghi.conepts;


import org.springframework.boot.web.servlet.error.ErrorController;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.RequestDispatcher;
import javax.servlet.http.HttpServletRequest;

@Controller
public class CustomErrorController implements ErrorController {

  @RequestMapping("/error")
  public String handleError(HttpServletRequest request, Model model) {
    Object status = request.getAttribute(RequestDispatcher.ERROR_STATUS_CODE);

    if (status != null) {
      Integer statusCode = Integer.valueOf(status.toString());

      if (statusCode == HttpStatus.NOT_FOUND.value()) {
        model.addAttribute("errorCode", 404);
        model.addAttribute("errorMessage", "Page Not Found");
        return "error/error";
      } else if (statusCode == HttpStatus.INTERNAL_SERVER_ERROR.value()) {
        model.addAttribute("errorCode", 500);
        model.addAttribute("errorMessage", "Internal Server Error");
        return "error/error";
      }
    }
    model.addAttribute("errorCode", "Unknown");
    model.addAttribute("errorMessage", "An unexpected error occurred");
    return "error/error";
  }
}
