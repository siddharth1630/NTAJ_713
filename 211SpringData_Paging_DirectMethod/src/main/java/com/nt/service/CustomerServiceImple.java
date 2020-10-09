package com.nt.service;

import java.util.ArrayList;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
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
	public Iterable<CustomerDTO> fetchAllRecordFetchByProperty(String property, boolean asc) {
		Iterable<Customer> entity=null;
		Iterable<CustomerDTO> itDto=new ArrayList<CustomerDTO>();
		entity=repo.findAll(Sort.by(asc?Direction.ASC:Direction.DESC, property));
		// convert entity to dto
		entity.forEach(e->{
			CustomerDTO dto=new CustomerDTO();
			BeanUtils.copyProperties(e, dto);
			((ArrayList<CustomerDTO>) itDto).add(dto);
		});
		return itDto;
	}

	@Override
	public Iterable<CustomerDTO> fetchAllRecordFetchByProperties(boolean asc, String... property) {
		Iterable<Customer> entity=null;
		Iterable<CustomerDTO> itDto=new ArrayList<CustomerDTO>();
		entity=repo.findAll(Sort.by(asc?Direction.ASC:Direction.DESC, property));
		// convert entity to dto
		entity.forEach(e->{
			CustomerDTO dto=new CustomerDTO();
			BeanUtils.copyProperties(e, dto);
			((ArrayList<CustomerDTO>) itDto).add(dto);
		});
		return itDto;
	}

	@Override
	public Iterable<CustomerDTO> fetchAllRecordPageNoAndPageSize(int pageNo, int pageSize) {
		Pageable pageable=null;
	//	Page<Customer> page=null;	// page is heave it contain all the info which is present in 
		Slice<Customer> slice=null;	// slice and also have some extra method like display total page
		Iterable<CustomerDTO> itDto=new ArrayList<CustomerDTO>();
		Iterable<Customer> itEntity=null;
		
		// create pageable object
		pageable=PageRequest.of(pageNo, pageSize);
		// get page request
	//	page=repo.findAll(pageable);
		slice=repo.findAll(pageable);
		// convert page object to iterable object
//		itEntity=page.getContent();
		itEntity=slice.getContent();
		
		// just seeing the method function
		/*		System.out.println(page.getNumber()+" "+page.getNumberOfElements()+" "+page.getSize()+" "
						+page.getTotalElements()+" "+page.getTotalPages());
		*/		
		System.out.println(slice.getNumber()+" "+slice.getNumberOfElements()+" "+slice.getSize()+" "
				+slice.isFirst());

		// convert entity to dto
		itEntity.forEach(e->{
			CustomerDTO dto=new CustomerDTO();
			BeanUtils.copyProperties(e, dto);
			((ArrayList<CustomerDTO>) itDto).add(dto);
		});
		return itDto;
	}

	@Override
	public void fetchRecordByPagination(int pageSize) {
		long recordsCount=0;
		long pagesCount=0;
		Pageable pageable=null;
		Page<Customer> page=null;
		// get total no. of records
		recordsCount=repo.count();
		pagesCount=recordsCount/pageSize;
		pagesCount=recordsCount%pageSize==0?pagesCount:++pagesCount;
		
		// dispaly record through with pagination
		for(int i=0;i<pagesCount;i++) {
			pageable=PageRequest.of(i, pageSize);
			page=repo.findAll(pageable);
			page.getContent().forEach(System.out::println);
			System.out.println("page"+(i+1)+" of "+page.getTotalPages());
		}	
	}
}
