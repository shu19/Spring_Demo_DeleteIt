package com.cg.app;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.cg.app.model.Customer;
import com.cg.app.service.CustomerService;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        ApplicationContext context =new AnnotationConfigApplicationContext(AppConfig.class);
        CustomerService customerService=context.getBean("customerService",CustomerService.class);
        System.out.println(customerService.findAll().get(0));
    }
}
