package com.customer.service;

import java.util.List;

import com.customer.dto.CustomerInfo;
import com.customer.entity.Customer;

public interface CustomerService {

	public List<Customer> getCustomer();

	public void addCustomer(CustomerInfo info) throws Exception;

	public Customer getCustomer(int id) throws Exception;

	public void updateCustomer(CustomerInfo info) throws Exception;

	public void deleteCustomer(int id) throws Exception;
}
