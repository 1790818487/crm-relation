package com.dlm.web;

import org.springframework.stereotype.Component;
import org.springframework.ui.ModelMap;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.context.request.WebRequestInterceptor;

@Component
public class WebServletInterceptor implements WebRequestInterceptor {

    @Override
    public void preHandle(WebRequest webRequest) throws Exception {
        System.out.println(webRequest.getRemoteUser());
        System.out.println(webRequest.getContextPath());
    }

    @Override
    public void postHandle(WebRequest webRequest, ModelMap modelMap) throws Exception {

    }

    @Override
    public void afterCompletion(WebRequest webRequest, Exception e) throws Exception {

    }
}
