package com.customer.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;

import com.customer.dto.CustomerInfo;
import com.customer.entity.Customer;
import com.customer.service.CustomerService;

@Controller
public class CustomerContoller {

	@Autowired
	private CustomerService service;

	@GetMapping(value = "/list", produces = MediaType.APPLICATION_JSON_VALUE)
	public @ResponseBody List<Customer> customerList() {
		return service.getCustomer();
	}

	@PostMapping(value = "/add/customer", consumes = MediaType.APPLICATION_JSON_VALUE)
	public @ResponseBody String addCustomer(@Valid @RequestBody CustomerInfo info) throws Exception {
		service.addCustomer(info);
		return "success";
	}

	@GetMapping(value = "/list/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
	public @ResponseBody Customer getCustomer(@PathVariable int id) throws Exception {
		return service.getCustomer(id);
	}

	@PostMapping(value = "/update")
	public @ResponseBody String updateCustomer(@Valid @RequestBody CustomerInfo info) throws Exception {
		service.updateCustomer(info);
		return "success";
	}

	@DeleteMapping(value = "/delete/{id}")
	public @ResponseBody String deleteCustomer(@PathVariable int id) throws Exception {
		service.deleteCustomer(id);
		return "success"; 
	}
}
