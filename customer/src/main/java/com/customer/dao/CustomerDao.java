package com.customer.dao;

import java.util.List;

import com.customer.entity.Customer;

public interface CustomerDao {

	public List<Customer> getCustomer();

	public void addCustomer(Customer customer) throws Exception;

	public Customer getCustomer(int id) throws Exception;

	public void updateCustomer(Customer customer) throws Exception;

	public void deleteCustomer(Customer customer) throws Exception;
}
