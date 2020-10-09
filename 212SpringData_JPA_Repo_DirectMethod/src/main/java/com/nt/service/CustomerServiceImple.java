package com.nt.service;

import java.beans.Beans;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Slice;
import org.springframework.data.domain.Sort;
import org.springframework.data.domain.Sort.Direction;
import org.springframework.stereotype.Service;

import com.nt.dto.CustomerDTO;
import com.nt.entity.Customer;
import com.nt.repo.CustomerRepo;

@Service("custService")
public class CustomerServiceImple implements CustomerService {
	
	@Autowired
	private CustomerRepo repo;

	@Override
	public List<CustomerDTO> fetchAllRecordsByGivenExampleDTO(CustomerDTO dto) {
		Customer entity=null;
		Example<Customer> example=null;
		List<Customer> itrEntity=null;
		List<CustomerDTO> itrDto=new ArrayList<CustomerDTO>();
		// convert dto to entity
		entity=new Customer();
		BeanUtils.copyProperties(dto, entity);
		// prepare Example Object (Wrappers around entity object)
		example=Example.of(entity);
		// use repo
		itrEntity = repo.findAll(example);
		// convert itrEntity to itrDto
		itrEntity.forEach(ent->{
			CustomerDTO dto1=new CustomerDTO();
			BeanUtils.copyProperties(ent, dto1);
			itrDto.add(dto1);
		});
		return itrDto;
	}

	@Override
	public String removeAllCustomer() {
		boolean flag=false;
		if(repo.count()>=1) {
			repo.deleteAll();
			flag=true;
		}
		return flag?"All customer are deleted":"no customer is there";
	}

	
}
