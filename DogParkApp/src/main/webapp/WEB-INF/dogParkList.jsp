<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
   <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>List of Dog Parks</title>
</head>
<jsp:include page="bootstrapHead.jsp"></jsp:include>
<body>
<ul class="nav nav-tabs justify-content-center">
  <li class="nav-item">
    <a class="nav-link" href="home.do">Home</a>
  </li>
  <li class="nav-item">
    <a class="nav-link active" aria-current="page" href="list.do">List All Dog Parks</a>
  </li>
  <li class="nav-item">
    <a class="nav-link" href="createDogPark.do">Create New Dog Park</a>
  </li>

</ul>
<table class="table table-hover">
  <thead>
    <tr>
      <th scope="col">ID</th>
      <th scope="col">Park Name</th>
      <th scope="col">City</th>
      <th scope="col">State</th>
    </tr>
  </thead>
  <tbody>
  <c:forEach items="${dogparks}" var="dogpark">
    <tr>
      <th scope="row">${dogpark.id }</th>
      <td><a href="getPark.do?pid=${dogpark.id}">${dogpark.name}</a></td>
      <td>${dogpark.city}</td>
      <td>${dogpark.state}</td>
    </tr>
    </c:forEach>
    <tr>
  </tbody>
</table>

</body>
</html>