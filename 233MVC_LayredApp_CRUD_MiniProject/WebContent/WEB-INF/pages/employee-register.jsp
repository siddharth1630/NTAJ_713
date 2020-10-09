<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
 <%@taglib uri="http://www.springframework.org/tags/form" prefix="frm" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Register employee</title>
</head>
<body>
<h1> Employee Registration page</h1>
	<frm:form	modelAttribute="empFrm">
		<table>
			<tr>
				<td>Employee Name</td>
				<td><frm:input path="ename"/></td>
			<tr>
			<tr>
				<td>Employee designation</td>
				<td><frm:input path="job"/></td>
			<tr>
			<tr>
				<td>Employee salary</td>
				<td><frm:input path="sal"/></td>
			<tr>
			<tr>
				<td>Dept number</td>
				<td>	
					<!--  FIRST WAY HARD CODING IN JSP -->
					<%-- <frm:select path="deptno">
						<frm:option value="10"/>
						<frm:option value="20"/>
						<frm:option value="30"/>
					</frm:select> --%>
					
					<!--  SECOND WAY HARD CODING IN CONTROLLER CLASS -->
					<frm:select path="deptno">
						<frm:options items="${ deptNos}"/>
					</frm:select>
				</td>
			<tr>
			<tr>
				<td colspan="2"><input type="submit" value="register"/></td>
			</tr>
		</table>
	</frm:form>

</body>
</html>