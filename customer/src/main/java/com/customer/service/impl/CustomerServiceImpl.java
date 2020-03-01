package com.customer.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.customer.dao.CustomerDao;
import com.customer.entity.Customer;
import com.customer.service.CustomerService;

@Service
public class CustomerServiceImpl implements CustomerService {
	@Autowired
	CustomerDao customerDao;

	@Override
	public List<Customer> getCustomer() {
		return customerDao.getCustomer();
	}

}
