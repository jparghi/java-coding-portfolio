package com.jparghi.conepts;

import org.springframework.util.StringUtils;
import org.springframework.web.servlet.LocaleResolver;
import org.springframework.web.servlet.i18n.LocaleChangeInterceptor;
import org.springframework.web.servlet.support.RequestContextUtils;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.Locale;

public class CustomLocaleChangeInterceptor extends LocaleChangeInterceptor {

   public CustomLocaleChangeInterceptor() {
    setParamName("lanauge");
  }


  @Override
  public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)
    throws ServletException {

    String newLocale = request.getParameter(getParamName());
    if (newLocale != null) {
      // Custom logic to modify the locale value
      String modifiedLocale = modifyLocale(newLocale);

      LocaleResolver localeResolver = RequestContextUtils.getLocaleResolver(request);
      if (localeResolver == null) {
        throw new IllegalStateException("No LocaleResolver found: not in a DispatcherServlet request?");
      }
      localeResolver.setLocale(request, response, StringUtils.parseLocaleString(modifiedLocale));
    }
    return true;
  }

  // Custom logic to modify the locale value (example)
  private String modifyLocale(String locale) {
    // Example: Convert to uppercase
    return locale.toUpperCase();
  }
}
