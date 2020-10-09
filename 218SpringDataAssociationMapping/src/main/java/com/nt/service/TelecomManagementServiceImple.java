package com.nt.service;

import java.util.HashSet;
import java.util.Set;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nt.dto.PhoneNumberDTO;
import com.nt.dto.UserDTO;
import com.nt.entity.PhoneNumber;
import com.nt.entity.User;
import com.nt.repo.PhoneNumberRepo;
import com.nt.repo.UserRepo;

@Service("teleService")
public class TelecomManagementServiceImple implements TelecomManagementService {

	@Autowired
	private UserRepo userRepo;
	@Autowired
	private PhoneNumberRepo phoneNumberRepo;
	@Override
	public String registerCustomer(UserDTO userDto) {
		User userEntity=null;
		Set<PhoneNumber> childEntities=new HashSet<PhoneNumber>();
		Set<PhoneNumberDTO> childDto=null;
		// convert DTO to entity
		userEntity=new User();
		userEntity.setName(userDto.getName());
		userEntity.setAddrs(userDto.getAddrs());
		
		// get the collection of phones and store in dto collection
		childDto=userDto.getPhones();	// we can't direclty set the collection in user thats'y
		// iterate one collection and store in entity
		childDto.forEach(phDto->{		// we can take set collecction to copy the one collection 
			PhoneNumber phEntity=new PhoneNumber();	//to another collection manually
			BeanUtils.copyProperties(phDto, phEntity);
			childEntities.add(phEntity);
		});
		// after storing it then set the values
		userEntity.setPhones(childEntities);

		// save object
		return "Customer is saved with id-> "+userRepo.save(userEntity).getUserId();
	}

}
