package com.nt.beans;

import java.util.Date;
import java.util.Set;

public class ContactsSet {
	private Set<Long> phoneNumber;	// it internally use LinkedHashSet for preserving the insertion order
	private Set<Date> dates;		// Set doesn't take duplicate if there it neglect it
	
	public ContactsSet(Set<Long> phoneNumber, Set<Date> dates) {
		System.out.println(phoneNumber.getClass());
		this.phoneNumber = phoneNumber;
		this.dates = dates;
	}

	@Override
	public String toString() {
		return "ContactsSet [phoneNumber=" + phoneNumber + ", dates=" + dates + "]";
	}
	
	
	
	

}
