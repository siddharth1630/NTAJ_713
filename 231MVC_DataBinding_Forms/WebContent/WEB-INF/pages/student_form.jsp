<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib  uri="http://www.springframework.org/tags/form" prefix="frm" %>

<h1 style="color:red;text-align:center">Student registration form page</h1>

<frm:form action="register" methods="POST" modelAttribute="stfrm">
	<table bgcolor="cyan">
		<tr>
			<td>Student number::</td><td><frm:input path="sno"/></td>
		</tr>
		<tr>
			<td>Student name::</td><td><frm:input path="sname"/></td>
		</tr>
		<tr>
			<td>Student Addrs::</td><td><frm:input path="sadd"/></td>
		</tr>
		<tr>
			<td>Student marks avg::</td><td><frm:input path="avg"/></td>
		</tr>
		
		
		<tr><td colspan="2"><input type="submit" value="register student"></td></tr>
		
		
	</table>


</frm:form>
