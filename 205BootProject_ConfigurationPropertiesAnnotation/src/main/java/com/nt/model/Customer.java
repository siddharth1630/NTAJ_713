package com.nt.model;

import java.util.Arrays;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Component;

@Component
@ConfigurationProperties(prefix = "cust.info")
public class Customer {
	private String cname;
	private Integer cno;
	private String[] address;
	private List<String> nickNames;
	private Map<String,Long> phones;
	
	@Autowired
	Environment env;
	
	
	public String getCname() {
		return cname;
	}


	public void setCname(String cname) {
		this.cname = cname;
	}


	public Integer getCno() {
		return cno;
	}


	public void setCno(Integer cno) {
		this.cno = cno;
	}


	public String[] getAddress() {
		return address;
	}


	public void setAddress(String[] address) {
		this.address = address;
	}


	public List<String> getNickNames() {
		return nickNames;
	}


	public void setNickNames(List<String> nickNames) {
		this.nickNames = nickNames;
	}


	public Map<String, Long> getPhones() {
		return phones;
	}


	public void setPhones(Map<String, Long> phones) {
		this.phones = phones;
	}


	@Override
	public String toString() {
		return "Customer [cname=" + cname + ", cno=" + cno + ", address=" + Arrays.toString(address) + ", nickNames="
				+ nickNames + ", phones=" + phones + "]";
	}
	
	public void print() {
		System.out.println(env);
		System.out.println(env.getProperty("cust.info.cno")+" "+env.getProperty("cust.info.address[0]"));
		System.out.println(env.getClass().getName());
		System.out.println(env.getRequiredProperty("os.name"));
	}
	
	

}
