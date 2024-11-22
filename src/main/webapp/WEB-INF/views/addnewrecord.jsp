<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
 <!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Add new window</title>
<link href="<c:url value="/resources/style.css"/>" rel="stylesheet">
</head>
<body>
<jsp:include page="master.jsp"/>
<form name="frm-1" action="save" method= "post">
<input type="text" name="name" value="" placeholder="enater name"><br><br>
<input type="text" name="email" value="" placeholder="enater email"><br><br>
<input type="text" name="contact" value="" placeholder="enater contact"><br><br>
<input type="submit" name="s" value="Add new Student">
	${msg}
<form>
</body>
</html>