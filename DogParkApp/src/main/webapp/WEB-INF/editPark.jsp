<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Edit Dog Park</title>
</head>
<body>
	<p>
		<div>
			<h1>Update Dog Park information.</h1>
<form action="editDogPark.do" method="POST">
<fieldset>
		<input type="number" value="${dogpark.id }" hidden="true" name="editId" id="editId">
				<label for="name">Enter dog park name:</label>
				 <input type="text" name="name" value="${dogpark.name }"id="name" min="1" max="50"> 
			<br>	 
				<label for="address">Enter address:</label>
				 <input type="text" name="address" value="${dogpark.address }"id="address" min="1" max="500"> 
		<br>
				<label for="city">Enter city:</label>		
<input type="text" name="city" value="${dogpark.city }"id="city" min="1" max="50">
<br>
<label for="state">Enter state:</label>
				 <input type="text" name="state" value="${dogpark.state }"id="state" min="2" max="2"> 
		<br>
		<label for="size">Enter dog park size in acres:</label>
				 <input type="number" name="size" value="${dogpark.size }"id="size" min="1" max="500"> 
		<br>
<input type="submit" value="Submit">
<br><br>
	<a href="home.do">Return to main page</a>

</body>
</html>