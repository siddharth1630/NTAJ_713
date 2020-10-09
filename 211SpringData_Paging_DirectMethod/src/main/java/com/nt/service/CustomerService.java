package com.nt.service;
import com.nt.dto.CustomerDTO;

public interface CustomerService {
	// sort by single entity
	public Iterable<CustomerDTO> fetchAllRecordFetchByProperty(String property,boolean asc);
	// sort by multiple entity
	public Iterable<CustomerDTO> fetchAllRecordFetchByProperties(boolean asc,String... property);
	public Iterable<CustomerDTO> fetchAllRecordPageNoAndPageSize(int pageNo,int pageSize);
	// this method we write only for getting the feeling of UI
	public void fetchRecordByPagination(int pageSize);
}
