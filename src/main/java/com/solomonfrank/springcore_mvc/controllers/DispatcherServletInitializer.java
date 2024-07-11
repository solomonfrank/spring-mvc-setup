package com.solomonfrank.springcore_mvc.controllers;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

public class DispatcherServletInitializer extends AbstractAnnotationConfigDispatcherServletInitializer  {

    @Override
    protected Class<?>[] getRootConfigClasses() {
        // TODO Auto-generated method stub
    	
        return null;
    }

    @Override
    protected Class<?>[] getServletConfigClasses() {
        return new Class<?>[] { MyConfiguration.class };
    	 
        
    }

    @Override
    protected String[] getServletMappings() {
        return new String[] { "/student.com/*" };
    }

}
