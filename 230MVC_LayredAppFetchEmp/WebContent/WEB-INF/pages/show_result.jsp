<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html>
<head>
	<title>Result</title>
</head>
<body>
<c:choose>
	<c:when test="${empInfo ne null && !empty empInfo }">
		<table>
			<tr>
				<th>SerialNo</th>
				<th>EmpNO</th>
				<th>EmpName</th>
				<th>Desigantion</th>
				<th>Salary</th>
				<th>Gross Salary</th>
				<th>Net Salary</th>
				<th>Dept NO</th>
				<th>Operations</th>
			</tr>
			<c:forEach var="dto" items="${empInfo }">
				<tr>
					<td>${dto.serialNo}</td>
					<td>${dto.eno}</td>
					<td>${dto.ename}</td>
					<td>${dto.job}</td>
					<td>${dto.sal}</td>
					<td>${dto.grossSalary}</td>
					<td>${dto.netSalary}</td>
					<td>${dto.deptno}</td>
					<td><a href="edit?eno=${dto.eno }"><img src="images/Edit.ico"/></a>
					<td><a href="delete?eno=${dto.eno }"><img src="images/Delete"/></a>
				</tr>
			</c:forEach>
		</table>
	</c:when>
	<c:otherwise>
		<h1>Record not found</h1>
	</c:otherwise>
</c:choose>
<h1><a href="saveEmp"><img src="images/add.ico"/></a></h1>
<h1><a href="welcome"><img src="images/Home.ico"/></a></h1>
<h1><a href="javaScript:doPrint()"><img src="images/printer.ico"/></a></a></h1>

<script lang="javaScript">
	function doPrint(){
		frames.focus();
		frames.print();
	}
</script>
</body>
</html>
