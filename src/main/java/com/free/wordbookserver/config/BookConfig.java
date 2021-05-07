package com.free.wordbookserver.config;


import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class BookConfig implements WebMvcConfigurer {


    @Value("${file-save-path}")
    private String fileSavePath;


    @Override
    public void addResourceHandlers(ResourceHandlerRegistry registry) {
        registry.addResourceHandler("/book/file/**").addResourceLocations("file:" + fileSavePath);
    }
}
