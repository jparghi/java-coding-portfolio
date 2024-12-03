package com.jparghi.conepts;

import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.filter.OncePerRequestFilter;

import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@Configuration
public class ErrorPageFilterConfig {

  @Bean
  public FilterRegistrationBean<ErrorPageFilter> errorPageFilter() {
    FilterRegistrationBean<ErrorPageFilter> registrationBean = new FilterRegistrationBean<>();
    registrationBean.setFilter(new ErrorPageFilter());
    registrationBean.addUrlPatterns("/*"); // Apply to all requests
    // This is important! Make sure it runs before the Spring error page filter
    registrationBean.setOrder(Integer.MIN_VALUE + 1);
    return registrationBean;
  }

  public static class ErrorPageFilter extends OncePerRequestFilter {

    @Override
    protected void doFilterInternal(HttpServletRequest request, HttpServletResponse response, FilterChain filterChain)
      throws ServletException, IOException {

      try {
        filterChain.doFilter(request, response);
      } catch (Exception ex) {
        // Your custom error handling logic here
        System.err.println("Exception caught in ErrorPageFilter: " + ex.getMessage());

        // Optionally, forward to a custom error page or modify the response
        // request.getRequestDispatcher("/your-custom-error-page").forward(request, response);
      }
    }
  }
}
