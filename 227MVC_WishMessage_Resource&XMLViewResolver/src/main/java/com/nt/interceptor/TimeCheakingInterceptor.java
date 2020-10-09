package com.nt.interceptor;

import java.time.LocalDate;
import java.time.LocalDateTime;

import javax.servlet.RequestDispatcher;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.format.datetime.joda.LocalDateTimeParser;
import org.springframework.web.servlet.HandlerInterceptor;

public class TimeCheakingInterceptor implements HandlerInterceptor {

		@Override
		public boolean preHandle(HttpServletRequest req, HttpServletResponse res, Object handler)
				throws Exception {
			RequestDispatcher rd=null;
			int hour=LocalDateTime.now().getHour();
			
			if(hour>21) {
				rd=req.getRequestDispatcher("timeout.jsp");
				rd.forward(req, res);
				return false;
			}
			else
				return true;
		}
}
