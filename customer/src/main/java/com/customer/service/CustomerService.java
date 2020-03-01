package com.customer.service;

import java.util.List;

import com.customer.dto.CustomerInfo;
import com.customer.entity.Customer;

public interface CustomerService {

	public List<Customer> getCustomer();

	public void addCustomer(CustomerInfo info) throws Exception;
}
