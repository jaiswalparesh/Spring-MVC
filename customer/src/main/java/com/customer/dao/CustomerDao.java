package com.customer.dao;

import java.util.List;

import com.customer.entity.Customer;

public interface CustomerDao {

	public List<Customer> getCustomer();

	public void addCustomer(Customer customer) throws Exception;
}
