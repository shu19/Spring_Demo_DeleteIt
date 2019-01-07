package com.cg.app;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.cg.app.repository.CustomerRepository;
import com.cg.app.repository.HibernateCustomerRepository;
import com.cg.app.service.CustomerService;
import com.cg.app.service.CustomerServiceImpl;

@Configuration
public class AppConfig {

	@Bean (name="customerService")
	public CustomerService getCustomerService() {
		CustomerServiceImpl service=new CustomerServiceImpl();
		service.setCustomerRepository(getCustomerRepository());
		return service;
	}
	
	public CustomerRepository getCustomerRepository() {
		return new HibernateCustomerRepository();
	}
}
