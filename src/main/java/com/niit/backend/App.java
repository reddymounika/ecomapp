package com.niit.backend;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.niit.configuration.ApplicationConfig;


/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
      AnnotationConfigApplicationContext annotationConfigApplicationContext= new AnnotationConfigApplicationContext(ApplicationConfig.class);
    }
}
