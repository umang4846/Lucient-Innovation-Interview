package com.umang.lucientinnovationinterview.customer;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;


@Controller
public class CustomerControllerController {

	@Autowired
	CustomerService customerService;

	@GetMapping("/registration")
	public String reg(Map<String, Object> model) {
		model.put("customer", new CustomerDTO());
		return "Registration";
	}

	@PostMapping("/home")
	public String createCustomer(@ModelAttribute("customer") CustomerDTO customerDTO) {
		if (customerDTO != null) {
			customerService.createOrUpdateCustomer(customerDTO);
		}
		return "redirect:/list";

	}

	@GetMapping("/list")
	public String listOfEmployee(Model model) {
		List<Customer> customerList = customerService.getAllCustomers();
		model.addAttribute("customerList", customerList);
		return "CustomerList";
	}

	@PostMapping("/delete")
	public String deleteEmployee(@RequestParam("customerId") String customerId) {
		customerService.deleteCustomer(Integer.valueOf(customerId));
		return "redirect:/list";
	}

	@GetMapping("/edit")
	public String editEmployee(@RequestParam("customerId") String customerId, Map<String, Object> model) {
		CustomerDTO customerDTO = customerService.editCustomer(Integer.valueOf(customerId));
		model.put("customer", customerDTO);
		return "Registration";
	}

}

