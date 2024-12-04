package com.jparghi.conepts.spring;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class ErrorController {

  @GetMapping("/error")
  public String showErrorPage(Model model) {
    model.addAttribute("errorForm", new ErrorForm());
    return "error";
  }

  @PostMapping("/submit-error")
  public String submitError(@ModelAttribute("errorForm") ErrorForm errorForm) {
    // Process the errorForm data (e.g., save to database)
    System.out.println("Name: " + errorForm.getName());
    System.out.println("Phone Number: " + errorForm.getPhoneNumber());
    System.out.println("Error Details: " + errorForm.getErrorDetails());
    return "redirect:/"; // Redirect to home page or another appropriate page
  }
}
