package com.cb.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Controller;

import com.cb.service.ICrickBuzzScoreMgmtService;

@WebServlet(value = "/controller",loadOnStartup = 1)
public class MainControllerServlet extends HttpServlet {
	
	private ApplicationContext ctx;
	
	@Override
	public void init() throws ServletException {
		ctx=new ClassPathXmlApplicationContext("com/cb/cnfg/applicationContext.xml");
	}
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		int mid=0;
		ICrickBuzzScoreMgmtService service=null;
		String score=null;
		RequestDispatcher rd=null;
		
		// read addtitional req param value
		mid=Integer.parseInt(req.getParameter("mid"));
		// get local service class obj
		service=ctx.getBean("cbService",ICrickBuzzScoreMgmtService.class);
		// use local service
		score=service.fetchScore(mid);
		// keep socre in req. scope
		req.setAttribute("scoreInfo", score);// attr name,value
		// forward to result.jsp
		rd=req.getRequestDispatcher("/result.jsp");
		rd.forward(req, res);
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		doGet(req, resp);
	}
	
	@Override
	public void destroy() {
		((AbstractApplicationContext) ctx).close();
	}
}
