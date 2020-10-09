<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false" %>
<%@taglib prefix="frm" uri="http://www.springframework.org/tags/form" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>



    <h1 style="color:red;text-align:center">Login</h1>
    
    <frm:form modelAttribute="user">
    	<table border="1" bgcolor="cyan" algin="center">
    		<tr>
    			<td>User Name::</td>
    			<td><frm:input path="username"/></td>
    		</tr>
    		<tr>
    			<td>Password::</td>
    			<td><frm:input path="pass"/></td>
    		</tr>
    		<tr>
    			<td colspan="2"><input type="submit" value="login"></td>
    		</tr>
    	</table>
    </frm:form>
    <br>
<c:if test="${result ne null && !empty result }">
 <h1>${result }</h1>
</c:if>