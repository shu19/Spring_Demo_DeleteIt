package com.cg.app;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.cg.app.repository.CustomerRepository;
import com.cg.app.repository.HibernateCustomerRepository;
import com.cg.app.service.CustomerService;
import com.cg.app.service.CustomerServiceImpl;

@Configuration
@ComponentScan({"com.cg.app"})
public class AppConfig {
	/*
	 * @Bean (name="customerService") public CustomerService getCustomerService() {
	 * 
	 * CustomerServiceImpl service=new CustomerServiceImpl();
	 * 
	 * 
	 * // CustomerServiceImpl service=new
	 * CustomerServiceImpl(getCustomerRepository()); //Constructor Injection //
	 * service.setCustomerRepository(getCustomerRepository()); //Setter Injection
	 * return service; }
	 * 
	 * public CustomerRepository getCustomerRepository() { return new
	 * HibernateCustomerRepository(); }
	 */
}
