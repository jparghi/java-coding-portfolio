package com.jparghi.conepts;

import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {

  @Bean
  public FilterRegistrationBean<LocaleValidationFilter> localeValidationFilter() {
    FilterRegistrationBean<LocaleValidationFilter> registrationBean = new FilterRegistrationBean<>();
    registrationBean.setFilter(new LocaleValidationFilter());
    registrationBean.addUrlPatterns("/login"); // Apply to the relevant URL pattern
    registrationBean.setOrder(1); // Set the order if you have other filters
    return registrationBean;
  }
}
