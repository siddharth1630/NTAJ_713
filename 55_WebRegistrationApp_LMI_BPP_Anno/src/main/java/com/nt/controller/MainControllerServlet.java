package com.nt.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.nt.dto.EmployeeDTO;
import com.nt.dto.StudentDTO;
import com.nt.service.CollegeMngmnt;


@WebServlet(value="/controller" , loadOnStartup = 1)
public class MainControllerServlet extends HttpServlet {
	ApplicationContext ctx=null;
	
    public MainControllerServlet() {
    	System.out.println("MainControllerServlet.MainControllerServlet()");
    }
    
	public void init(ServletConfig config) throws ServletException {
		ctx=new ClassPathXmlApplicationContext("com/nt/cnfgs/applicationContext.xml");
	}	
	public void destroy() {
		((AbstractApplicationContext) ctx).close();
	}
	
	protected void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		String type=null;
		StudentDTO sdto=null;
		EmployeeDTO edto=null;
		String result=null;
		CollegeMngmnt service=null;
		String targetPage=null;
		RequestDispatcher rd=null;
		
		// get servcie object
		service=ctx.getBean("service",CollegeMngmnt.class);
		
		type=req.getParameter("type");
		if(type.equalsIgnoreCase("registerStudent")) {
			// get dto object
			sdto=ctx.getBean("sdto",StudentDTO.class);
			
			// read form data and store in dto object
			sdto.setId(Integer.parseInt(req.getParameter("id")));
			sdto.setName(req.getParameter("name"));
			sdto.setSadd(req.getParameter("sadd"));
			sdto.setCourse(req.getParameter("course"));
			sdto.setM1(Integer.parseInt(req.getParameter("m1")));
			sdto.setM2(Integer.parseInt(req.getParameter("m2")));
			sdto.setM3(Integer.parseInt(req.getParameter("m3")));
			
			try {
				// use service method
				result=service.enrollStudent(sdto);
				// set req scope
				req.setAttribute("resultMsg", result);
				targetPage="/show_result.jsp";
			}
			catch(Exception e) {
				targetPage="/error.jsp";
				e.printStackTrace();
			}
		}
		else {
			edto=ctx.getBean("edto",EmployeeDTO.class);
			
			// read form data and store in dto object
			edto.setId(Integer.parseInt(req.getParameter("id")));
			edto.setName(req.getParameter("name"));
			edto.setCompany(req.getParameter("company"));
			edto.setSalary(Float.parseFloat(req.getParameter("salary")));
			
			try {
				// use service method
				result=service.enrollEmpoyee(edto);
				// set req scope
				req.setAttribute("resultMsg", result);
				targetPage="/show_result.jsp";
			}
			catch(Exception e) {
				targetPage="/error.jsp";
				e.printStackTrace();
			}
		}
		// forward req. to target page
		rd=req.getRequestDispatcher(targetPage);
		rd.forward(req,res);
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		doGet(request, response);
	}

}
