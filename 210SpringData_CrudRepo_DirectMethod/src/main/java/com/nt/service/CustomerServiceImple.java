package com.nt.service;

import java.beans.Beans;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nt.dto.CustomerDTO;
import com.nt.entity.Customer;
import com.nt.repo.CustomerRepo;

@Service("custService")
public class CustomerServiceImple implements CustomerService {
	
	@Autowired
	private CustomerRepo repo;

	@Override
	public String registerCustomer(CustomerDTO dto) {
		Customer cust=null;
		System.out.println(repo.getClass()+" "+Arrays.toString(repo.getClass().getInterfaces()));
		// convert dto to entity
		cust=new Customer();
		BeanUtils.copyProperties(dto, cust);
		// use repo
		cust=repo.save(cust);
		return cust!=null?"insertion is succefull  "+cust.getCNo():"insertion failed";
	}

	@Override
	public String registerCustomerGroups(List<CustomerDTO> listDto) {
		List<Customer> listEnties=new ArrayList<Customer>();
		List<Customer> listEnties1=null;
		String ids="";
	
		//convert listDto to list Entites
		listDto.forEach(dto->{
			Customer entity=new Customer();
			BeanUtils.copyProperties(dto, entity);
			listEnties.add(entity);
		});
		// use repo
		listEnties1=(List<Customer>) repo.saveAll(listEnties);
		
		/*for(Customer e:listEnties1) {			// old way
			ids += e.getCNo()+",";
		}*/
		ids=listEnties1.stream().map(e->e.getCNo()).collect(Collectors.toList()).toString();
		return listEnties1!=null?"Batch insertion is done with id "+ids:"insertion failed";
	}

	@Override
	public String removeCustomerById(int id) {
		boolean flag=false;
		flag=repo.existsById(id);
		if(flag)
			repo.deleteById(id);
		return flag==true?"succeffully delete the record whose id is "+ id:" id not found";
	}

	@Override
	public String removeGivenCustomer(Iterable<CustomerDTO> iterDto) {
		Iterable<Customer> itr=new ArrayList<Customer>();
		iterDto.forEach(dto->{
			Customer entity=new Customer();
			BeanUtils.copyProperties(dto, entity);
			((List<Customer>) itr).add(entity);
		});
		repo.deleteAll(itr);
		
		return "Bulk deletion succesfull";
	}

	@Override
	public long fetchCustomerCount() {
		return repo.count();
	}

	@Override
	public Iterable<CustomerDTO> fetchAllCustomers() {
		Iterable<Customer> itrEntity=null;
		Iterable<CustomerDTO> itrDto=new ArrayList<CustomerDTO>();
		// user repo
		itrEntity=repo.findAll();
		// convert list entity to list dto
		itrEntity.forEach(entity->{
			CustomerDTO dto=new CustomerDTO();
			BeanUtils.copyProperties(entity, dto);
			((List<CustomerDTO>) itrDto).add(dto);
		});
		return itrDto;
	}

	@Override
	public Optional<CustomerDTO> fetchCustomerById(int id) {
		Optional<Customer> opt=null;
		Optional<CustomerDTO> dto=null;
		
		opt=repo.findById(id);
		if(opt.isPresent()) {
			dto=Optional.of(new CustomerDTO());
			BeanUtils.copyProperties(opt.get(), dto.get());
		}
		else {
			dto=dto.empty();
		}
		return dto;
	}

}
