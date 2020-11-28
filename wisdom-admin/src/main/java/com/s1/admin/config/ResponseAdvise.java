package com.s1.admin.config;

import com.s1.common.response.ResponseData;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.MethodParameter;
import org.springframework.http.MediaType;
import org.springframework.http.converter.HttpMessageConverter;
import org.springframework.http.server.ServerHttpRequest;
import org.springframework.http.server.ServerHttpResponse;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.mvc.method.annotation.ResponseBodyAdvice;

/**
 * 自定义advise ，对restful请求响应体进行统一规范
 */
@EnableWebMvc
@Configuration
@RestControllerAdvice(basePackages = "com.s1.admin.controller")
public class ResponseAdvise implements ResponseBodyAdvice<Object> {
    @Override
    public boolean supports(MethodParameter returnType, Class<? extends HttpMessageConverter<?>> converterType) {
        return true;
    }

    @Override
    public Object beforeBodyWrite(Object object, MethodParameter returnType, MediaType selectedContentType, Class<? extends HttpMessageConverter<?>> selectedConverterType, ServerHttpRequest request, ServerHttpResponse response) {

        if (object instanceof ResponseData) {
            return object;
        }
//        return ResponseData.of().setData(object);
        ResponseData responseData = new ResponseData();
        responseData.setData(object);
        return responseData;
    }
}