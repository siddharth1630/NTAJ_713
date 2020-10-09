<%@ page isELIgnored="false" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<h1 style="color:red;text-align:center">All ${operation } info </h1>

<c:choose>
	<c:when test="${listInfo ne null && !empty listInfo }">
		<table align="center" bgcolor="pink">
			<c:forEach var="details" items="${listInfo }">
				<tr>
					<td style="color:blue">${details }</td>
				</tr>
			</c:forEach>
		</table>
	</c:when>
	<c:otherwise>
		<h1 style="color:red;text-align:center;">No countries found</h1>
	</c:otherwise>
</c:choose>
<h1> Total ${operation} is -->${count }</h1>
<br>
<br>
<a href="welcome">home</a>