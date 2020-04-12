package com.umang.lucientinnovationinterview.customer;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.umang.lucientinnovationinterview.utils.Constants;
import com.umang.lucientinnovationinterview.utils.CustomResponse;
import com.umang.lucientinnovationinterview.utils.CustomStatusCodes;


@RestController
@RequestMapping("/customer")
public class CustomerControllerREST {

	@Autowired
	CustomerService patientDemoService;


	//get all customers 
	@GetMapping("/getAll")
	public CustomResponse getAllCustomer() {
		try {

			List<Customer> patientDemos =  this.patientDemoService.getAllCustomers();
			
			if (patientDemos !=null && patientDemos.size()>0) {
				return CustomResponse.builder().status(true).data(patientDemos).build();
			}
			else {
				return CustomResponse.builder().status(false).message(Constants.NO_CUSTOMER_EXIST)
						.code(CustomStatusCodes.NO_CUSTOMER_FOUND).data(patientDemos).build();
			}

		} catch (Exception e) {
		
			return CustomResponse.builder().status(false).message(Constants.SOME_THING_WRONG)
					.code(CustomStatusCodes.SOME_THING_WENT_WRONG).data(null).build();
		}

	}
	
	//add Customer
	@PostMapping("/add")
	public CustomResponse addCustomer(@RequestBody CustomerDTO customerDTO) {
		try {
			
				
			Customer savedCustomerDemo = this.patientDemoService.createOrUpdateCustomer(customerDTO);
			
			return CustomResponse.builder().status(true).message(Constants.CUSTOMER_ADDED)
						.data(savedCustomerDemo).code(CustomStatusCodes.CUSTOMER_ADDED).build();
			

		} catch (Exception e) {
			return CustomResponse.builder().status(false).message(Constants.FAILED_TO_ADD_CUSTOMER)
					.code(CustomStatusCodes.FAILED_TO_ADD_CUSTOMER).data(null).build();
		}
	}
	
	//update Customer
	@PutMapping("/update/{customerId}")
	public CustomResponse updateCustomer(@PathVariable Integer customerId,@RequestBody CustomerDTO customerDTO) {
		try {
			
			if(!patientDemoService.findById(customerId).isPresent()) {
				return CustomResponse.builder().status(false).message(Constants.NO_CUSTOMER_EXIST)
						.data(null).code(CustomStatusCodes.NO_CUSTOMER_FOUND).build();
			}
			else {
			Customer savedCustomerDemo = this.patientDemoService.createOrUpdateCustomer(customerDTO);
			
			return CustomResponse.builder().status(true).message(Constants.CUSTOMER_UPDATED)
						.data(savedCustomerDemo).code(CustomStatusCodes.CUSTOMER_UPDATED).build();
			
			}
		} catch (Exception e) {
			return CustomResponse.builder().status(false).message(Constants.FAILED_TO_UPDATE_CUSTOMER)
					.code(CustomStatusCodes.FAILED_TO_UPDATE_CUSTOMER).data(null).build();
		}
	}
	

	//delete Customer by ID
	@DeleteMapping("/delete/{customerId}")
	public CustomResponse addChildData(@PathVariable Integer customerId)
	{
		try {
			
			if(!patientDemoService.findById(customerId).isPresent()) {
				return CustomResponse.builder().status(false).message(Constants.NO_CUSTOMER_EXIST)
						.data(null).code(CustomStatusCodes.NO_CUSTOMER_FOUND).build();
			}
			
			patientDemoService.deleteCustomer(customerId);
			
			return CustomResponse.builder().status(true).message(Constants.CUSTOMER_DELETED)
					.code(CustomStatusCodes.CUSTOMER_DELETED).build();
			
		}catch(Exception e)
		{
			return CustomResponse.builder().status(false).message(Constants.FAILED_TO_DELETE_CUSTOMER)
					.code(CustomStatusCodes.FAILED_TO_DELETE_CUSTOMER).data(null).build();
		}
	}
	
}

