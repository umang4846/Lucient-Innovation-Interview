package com.umang.lucientinnovationinterview.customer;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Table(name="customers")
@Data
public class Customer {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	
	@Column(name="name")
	private String name;

	@Column(name="gender")
	private String gender;
	
	@Column(name="email_address")
	private String emailAddress;
	
	@Column(name="mobile_no")
	private String mobileNo;
	
	@Column(name="address1")
	private String address1;
	
	@Column(name="address2")
	private String address2;
	
	@Column(name ="city")
	private String city;
	
	@Column(name ="state")
	private String state;
	
	@Column(name ="zip_code")
	private String zipcode;
	
	@Column(name="country")
	private String country;

	
	
	
	
}

