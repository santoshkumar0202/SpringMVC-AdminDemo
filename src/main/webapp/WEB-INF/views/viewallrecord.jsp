<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
        <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>View Records</title>
<link href="<c:url value="/resources/style.css"/>" rel="stylesheet">

</head>
<body>
<jsp:include page="master.jsp"/>

<h1> You are on view all page !</h1>

<table>
	<tr>
	 <th> Name</th>
	 <th> Email</th>
	 <th> Contact</th>
	 <th> Delete</th>
	 <th> Update</th>
	</tr>

<c:forEach var="s" items="${studentrecord}">
<tr>
<td> ${s.getName()} </td> 
<td> ${s.getEmail()} </td> 
<td> ${s.getContact()} </td> 
<td> <a href ="del?userid=${s.getId()}">Delete</a> </td>
<td> <a href ="">Update</a> </td>
</tr>
</c:forEach>
</table>

</body>
</html>