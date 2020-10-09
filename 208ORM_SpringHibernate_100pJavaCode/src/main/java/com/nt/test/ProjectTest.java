package com.nt.test;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.dao.DataAccessException;
import org.springframework.stereotype.Service;

import com.nt.dto.ProjectDTO;
import com.nt.service.ProjectMgmntService;

public class ProjectTest {
	public static void main(String[] args) {
		ApplicationContext ctx=null;
		ProjectMgmntService proj=null;
		ProjectDTO dto=null;
		
		// create IOC container
		ctx=new AnnotationConfigApplicationContext(com.nt.cnfgs.ApplicationContext.class);
		// get service classs object
		proj=ctx.getBean("projService",ProjectMgmntService.class);
		
		try {
			// create DTO
			dto=new ProjectDTO();
			dto.setCompanyName("tiktok");
			dto.setCost(94333);
			dto.setLocation("pune");
			dto.setpName("siddharth gupta");
			dto.setTeamSize(7);
			
			// use service
			System.out.println(proj.registerProject(dto));
			
		//	System.out.println(proj.fetchProjectById(4));
		//	System.out.println(proj.updateProjectById(4, 10, 30000));
		//	System.out.println(proj.fetchProjectById(4));
		//	System.out.println(proj.removeProjectById(4));
		//	System.out.println(proj.fetchProjectById(4));
			
			List<ProjectDTO> listDto=proj.fetchProjectByCostRange(20000, 3000000);
			
			listDto.forEach(dto1->{		// for each
				System.out.println(dto1);
			});
			System.out.println("===================================");
			listDto.forEach(System.out::println); // method reference
			System.out.println("===================================");
			System.out.println(listDto);// toString
			System.out.println("===================================");
			listDto.stream().forEach(System.out::println); // stream api
		}
		catch (DataAccessException e) {
			e.printStackTrace();
		}
		((AbstractApplicationContext) ctx).close();
	}

}
