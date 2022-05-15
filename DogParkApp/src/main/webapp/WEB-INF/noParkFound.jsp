<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link rel=“stylesheet” href=“style.css”>
<title>No Park Found</title>
</head>
<body>
	<h1>No Parks found with that ID</h1>
	<a> Please try again.</a>
	<br>
	<br>
	<form action="getPark.do" method="GET">
		Park ID: <input type="text" name="pid" /> <input type="submit"
			value="Show Park" />
	</form>
	<br>
<a href="list.do">Show all Dog Parks<br>
<br>
	<a href="home.do">Return to main page</a>
</body>
</html>