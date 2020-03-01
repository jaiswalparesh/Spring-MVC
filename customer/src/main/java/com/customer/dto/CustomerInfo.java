package com.customer.dto;

import java.io.Serializable;

import javax.validation.constraints.NotNull;

public class CustomerInfo implements Serializable {

	private static final long serialVersionUID = 1L;

	@NotNull(message = "Please provide id")
	private int id;
	
	@NotNull(message = "Please provide first name")
	private String firstName;

	@NotNull(message = "please provide last name")
	private String lastName;

	@NotNull(message = "please provide email in standard format")
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

	public static long getSerialversionuid() {
		return serialVersionUID;
	}
}
