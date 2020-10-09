 package com.nt.repo;

import java.util.Collection;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.nt.entity.Customer;

public interface CustomerRepo extends JpaRepository<Customer, Integer>{
	List<Customer> findBycAdd(String adres);
	List<Customer> findBycName(String name);
	List<Customer> findByBillAmntGreaterThan(Double bill);
	List<Customer> findBycNameLike(String chars);
	List<Customer> findBycNameStartingWith(String chars);
	List<Customer> findBycNameEndingWith(String chars);
	List<Customer> findBycNameContaining(String chars);
	
	List<Customer> findBycNameIsNotNull();
	List<Customer> findBycNameIsNull();
	List<Customer> findBycNameAndBillAmnt(String name,Double amount);
	List<Customer> findByBillAmntGreaterThanAndBillAmntLessThan(double min,Double max);
	List<Customer> findByBillAmntBetween(Double min,Double max);
	List<Customer> findBycNameOrBillAmnt(String name,Double amnt);
//	List<Customer> findByBillAmntBetweenOrderByCName(Double amnt,Double amnt1);
	List<Customer> findBycNameNot(String name);
	
	Iterable<Customer> findBycAddIn(Collection<String> city);
}
