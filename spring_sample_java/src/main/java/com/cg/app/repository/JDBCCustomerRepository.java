package com.cg.app.repository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.cg.app.model.Customer;


@Repository
public class JDBCCustomerRepository implements CustomerRepository{

	@Override
	public List<Customer> findAll() {
		
		List<Customer> customers=new ArrayList<Customer>();
		Customer customer=new Customer();
		customer.setFirstName("Rohan");
		customer.setLastName("Bhosale");
		customers.add(customer);
		
		return customers;
	}

	
	
}
