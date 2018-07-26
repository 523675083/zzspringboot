package com.example.zzspringboot.config;

import com.example.zzspringboot.controller.interceptor.OneInterceptor;
import com.example.zzspringboot.controller.interceptor.TwoInterceptor;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;
@Configuration
public class WebMvcConfigurer extends WebMvcConfigurerAdapter{
    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(new OneInterceptor()).addPathPatterns("/*/**");
        registry.addInterceptor(new TwoInterceptor()).addPathPatterns("/two/**");
        super.addInterceptors(registry);
    }
}
