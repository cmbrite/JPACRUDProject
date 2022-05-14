<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
   <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>List of Dog Parks</title>
</head>
<body>

<table>
		<thead>
			<tr>
				<th>ID</th>
				<th>Park Name</th>
				<th>City</th>
			</tr>
		</thead>

		<c:forEach items="${dogparks}" var="dogpark">
			<tr>
				<td>${dogpark.id }</td>
				<td><a href="getPark.do?pid=${dogpark.id}">${dogpark.name}<br>
				</a></td>
				<td>${dogpark.city}</td>
			</tr>
		</c:forEach>
	</table>

</body>
</html>