package com.umang.lucientinnovationinterview.customer;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CustomerService {

	@Autowired
	CustomerRepository customerRepository;

	public List<Customer> getAllCustomers() {

		return customerRepository.findAll();

	}

	public Optional<Customer> findById(Integer customerId) {
		return customerRepository.findById(customerId);

	}
	
	public void deleteCustomer(Integer customerId) {

		customerRepository.deleteById(customerId);

	}
	
	 public CustomerDTO editCustomer(Integer customerId) {
		 Customer customer = customerRepository.getOne(customerId);
          return convertModelToDTO(customer);
    }

	public Customer createOrUpdateCustomer(CustomerDTO customerDTO) {
		Customer customer = convertDtoToModel(customerDTO);
		return customerRepository.save(customer);
	}

	private Customer convertDtoToModel(CustomerDTO customerDTO) {
		Customer customer = new Customer();
		if (customerDTO.getId() != null) {
			customer.setId(customerDTO.getId());
		}
		customer.setName(customerDTO.getName());
		customer.setGender(customerDTO.getGender());
		customer.setEmailAddress(customerDTO.getEmailAddress());
		customer.setMobileNo(customerDTO.getMobileNo());
		customer.setAddress1(customerDTO.getAddress1());
		customer.setAddress2(customerDTO.getAddress2());
		customer.setState(customerDTO.getState());
		customer.setCity(customerDTO.getCity());
		customer.setZipcode(customerDTO.getZipcode());
		customer.setCountry(customerDTO.getCountry());
		return customer;
	}

	private CustomerDTO convertModelToDTO(Customer customer) {
		CustomerDTO customerDTO = new CustomerDTO();
		customerDTO.setId(customer.getId());
		customerDTO.setName(customer.getName());
		customerDTO.setGender(customer.getGender());
		customerDTO.setEmailAddress(customer.getEmailAddress());
		customerDTO.setMobileNo(customer.getMobileNo());
		customerDTO.setAddress1(customer.getAddress1());
		customerDTO.setAddress2(customer.getAddress2());
		customerDTO.setState(customer.getState());
		customerDTO.setCity(customer.getCity());
		customerDTO.setZipcode(customer.getZipcode());
		customerDTO.setCountry(customer.getCountry());

		return customerDTO;
	}

}

