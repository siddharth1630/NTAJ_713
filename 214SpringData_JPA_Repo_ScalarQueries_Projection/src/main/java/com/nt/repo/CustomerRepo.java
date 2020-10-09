 package com.nt.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.nt.entity.Customer;

public interface CustomerRepo extends JpaRepository<Customer, Integer>{
	interface ResultView1 extends View {
		Integer getcNo();
		String getcName();
	}
	// scalar projection
	public List<ResultView1> findBycAdd(String addr);
	
	interface ResultView2 extends View{
		String getcName();
		Double getbillAmntt();
	}
//	public List<ResultView2> findBycNoBetween(int min,int max);
	
	// dynamic projection
	// design the method with generics
//	<T>List<T> findBycAdd(String addr,Class<T> clazz);
	
	interface View{}
	<T extends View> List<T> findBycAdd(String addr,Class<T> clazz);
}
