package com.umang.lucientinnovationinterview.customer;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CustomerDTO {
	
	private Integer id;
	
	private String name;

	private String gender;
	
	private String emailAddress;
	
	private String mobileNo;
	
	private String address1;
	
	private String address2;
	
	private String city;
	
	private String state;
	
	private String zipcode;
	
	private String country;
	
	
}
