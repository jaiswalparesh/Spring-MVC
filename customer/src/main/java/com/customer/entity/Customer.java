package com.customer.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import com.customer.dto.CustomerInfo;

@Entity
@Table(name = "customer")
public class Customer implements Serializable {

	private static final long serialVersionUID = 1L;

	public Customer() {
	}

	public Customer(CustomerInfo info) {
		this.id = info.getId();
		this.firstName = info.getFirstName();
		this.lastName = info.getLastName();
		this.email = info.getEmail();
	}

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO, generator = "customer_seq")
	@SequenceGenerator(sequenceName = "customer_seq", allocationSize = 1, name = "customer_seq")
	private int id;

	@Column(name = "first_name")
	private String firstName;

	@Column(name = "last_name")
	private String lastName;

	@Column
	private String email;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
}
