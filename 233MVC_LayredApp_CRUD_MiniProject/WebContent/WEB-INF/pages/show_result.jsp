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
					<td><a href="edit.htm?eno=${dto.eno }"><img src="images/Edit.ico" height="50" width="50" /></a>
					<td><a href="delete.htm?eno=${dto.eno }"><img src="images/Delete.ico" height="50" width="50"/></a>
				</tr>
			</c:forEach>
		</table>
	</c:when>
	<c:otherwise>
		<h1>Record not found</h1>
	</c:otherwise>
</c:choose>

<marquee direction="right"><h1>${registerMsg }</h1></marquee>

<h1><a href="saveEmp.htm"><img src="images/add.ico" height="50" width="50"/></a></h1>
<h1><a href="welcome.htm"><img src="images/Home.ico" height="50" width="50"/></a></h1>
<h1><a href="javaScript:doPrint()"><img src="images/printer.ico" height="50" width="50"/></a></a></h1>

<script lang="javaScript">
	function doPrint(){
		frames.focus();
		frames.print();
	}
</script>
</body>
</html>
