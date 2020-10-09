package com.nt.service;

import java.util.List;
import java.util.Optional;

import com.nt.dto.CustomerDTO;

public interface CustomerService {
	public String registerCustomer(CustomerDTO dto);
	public String registerCustomerGroups(List<CustomerDTO> dto);
	public String removeCustomerById(int id);
	public String removeGivenCustomer(Iterable<CustomerDTO> iterDto);
	public long fetchCustomerCount();
	public Iterable<CustomerDTO> fetchAllCustomers();
	public Optional<CustomerDTO> fetchCustomerById(int id);
}
