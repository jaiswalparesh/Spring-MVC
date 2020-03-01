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

}
