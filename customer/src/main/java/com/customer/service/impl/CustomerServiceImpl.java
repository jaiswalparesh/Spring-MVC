package com.customer.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.customer.dao.CustomerDao;
import com.customer.dto.CustomerInfo;
import com.customer.entity.Customer;
import com.customer.service.CustomerService;

@Service
public class CustomerServiceImpl implements CustomerService {
	@Autowired
	CustomerDao customerDao;

	@Override
	@Transactional
	public List<Customer> getCustomer() {
		return customerDao.getCustomer();
	}

	@Override
	@Transactional
	public void addCustomer(CustomerInfo info) throws Exception {
		customerDao.addCustomer(new Customer(info));
	}

	@Override
	@Transactional
	public Customer getCustomer(int id) throws Exception {
		return customerDao.getCustomer(id);
	}

	@Override
	@Transactional
	public void updateCustomer(CustomerInfo info) throws Exception {
		Customer customer = customerDao.getCustomer(info.getId());
		customer.setFirstName(info.getFirstName());
		customer.setLastName(info.getLastName());
		customer.setEmail(info.getEmail());
		customerDao.updateCustomer(customer);
	}

	@Override
	@Transactional
	public void deleteCustomer(int id) throws Exception {
		customerDao.deleteCustomer(customerDao.getCustomer(id));
	}

}
