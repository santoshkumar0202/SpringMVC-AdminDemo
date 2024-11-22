<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
   "http://www.w3.org/TR/html4/loose.dtd">
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Home</title>
<link href="<c:url value="/resources/style.css"/>" rel="stylesheet">
</head>
<body>
	<form name="frm" action="validate" method="POST">
		<div class="form-container">
			<p>This is the homepage!</p>
			<h1>Hello Use your login details to login!</h1>
			<br> <br> <input type="text" name="name" value=""
				placeholder=" enter name" class="control" /> <br> <br> <input
				type="password" name="pass" value="" placeholder=" enter password "
				class="control" /> <br> <br> <input type="submit" name="s"
				value=" Login Here" class="control" />
		</div>
	</form>
</body>
</html>
