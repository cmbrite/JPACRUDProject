<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Dog Park </title>
</head>
<body>

<h1>Welcome to the Dog Park database </h1>
<!-- ${DEBUG } TESTING, DELETE LATER -->

<form action="getPark.do" method="GET">
		Park ID: <input type="text" name="pid" /> <input type="submit"
			value="Show Park" />
	</form>
<br>
<a href="list.do">Show all Dog Parks<br>


</body>
</html>