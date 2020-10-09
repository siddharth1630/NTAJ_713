package com.nt.service;
import java.util.List;

import com.nt.dto.CustomerDTO;

public interface CustomerService {
	public List<CustomerDTO> fetchAllRecordsByGivenExampleDTO(CustomerDTO dto);
	public String removeAllCustomer();
	
}
