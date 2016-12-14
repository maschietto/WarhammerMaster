package com.warhammer.master;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.config.annotation.DefaultServletHandlerConfigurer;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

/**
 * Created by Maschietto on 12/13/16.
 */
@Configuration
@EnableWebMvc
public class ApplicationContext  extends WebMvcConfigurerAdapter{



        @Bean
        public ViewResolver getViewResolver() {

            InternalResourceViewResolver resolver = new InternalResourceViewResolver();
            resolver.setPrefix("/");
            resolver.setSuffix(".jsp");
            return resolver;
        }

        @Override
        public void configureDefaultServletHandling(
                DefaultServletHandlerConfigurer configurer) {
            configurer.enable();
        }
    }



