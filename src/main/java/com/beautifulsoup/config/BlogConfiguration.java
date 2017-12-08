package com.beautifulsoup.config;

import com.beautifulsoup.interceptor.BlogUserQueryInterceptor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;
import org.springframework.web.servlet.view.InternalResourceViewResolver;
import org.springframework.web.servlet.view.JstlView;

/**
 * Created by BeautifulSoup on 2017/11/9.
 */
@Configuration
public class BlogConfiguration extends WebMvcConfigurerAdapter{

 /*   @Autowired
    private BlogUserQueryInterceptor userQueryInterceptor;


    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(userQueryInterceptor);
    }*/
}
