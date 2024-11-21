package com.jparghi.conepts;


import org.springframework.web.filter.OncePerRequestFilter;

import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class LocaleValidationFilter extends OncePerRequestFilter {

  @Override
  protected void doFilterInternal(HttpServletRequest request, HttpServletResponse response, FilterChain filterChain) throws ServletException, IOException {
    String languageParam = request.getParameter("language");
    if (languageParam != null && !isValidLocale(languageParam)) {
      // Handle invalid locale, e.g., set a default locale or send an error response
      response.sendError(HttpServletResponse.SC_BAD_REQUEST, "Invalid language parameter");
      return;
    }
    filterChain.doFilter(request, response);
  }

  private boolean isValidLocale(String locale) {
    // Implement your locale validation logic here
    // You can use regular expressions or other validation methods
    // to ensure the locale string contains only valid characters
    return locale.matches("[a-zA-Z]{2,3}");
  }
}
