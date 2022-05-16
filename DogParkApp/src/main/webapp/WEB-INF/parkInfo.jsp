<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Park Details</title>
</head>
<jsp:include page="bootstrapHead.jsp"></jsp:include>
<body>

<ul class="nav nav-tabs justify-content-center">
  <li class="nav-item">
    <a class="nav-link"  href="home.do">Home</a>
  </li>
  <li class="nav-item">
    <a class="nav-link" href="list.do">List All Dog Parks</a>
  </li>
  <li class="nav-item">
    <a class="nav-link" href="createDogPark.do">Create New Dog Park</a>
  </li>

</ul>

<div>

 <h5>${dogpark.name}</h5>
 
 <table class="table">
  <thead>
    <tr>
      <th scope="col">ID</th>
      <th scope="col">Address</th>
      <th scope="col">City</th>
      <th scope="col">State</th>
      <th scope="col">Acres</th>
      <th scope="col">Open</th>
      <th scope="col">Closed</th>
    </tr>
  </thead>
  <tbody>
    <tr>
      <th scope="row">${dogpark.id }</th>
      <td><a href="https://maps.google.com/?q=${dogpark.address}, ${dogpark.city}">${dogpark.address}</a></td>
      <td>${dogpark.city}</td>
      <td>${dogpark.state}</td>
      <td>${dogpark.size}</td>
      <td>${dogpark.open}</td>
      <td>${dogpark.close}</td>
    </tr>
    <tr>
  </tbody>
</table>
  <br>
  <form action="deletePark.do" method="POST">
				<input type="text" hidden="true" value="${dogpark.id }" name="deleteId" /> 
				<input type="submit" value="Delete">
				</form></td>
				
				<td><form action="startEditPark.do" method="POST">
				<input type="text" hidden="true" value="${dogpark.id }" name="editId" /> 
				<input type="submit" value="Edit">
				</form>
</div>

</body>
</html>