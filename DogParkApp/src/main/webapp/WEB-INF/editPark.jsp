<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Edit Dog Park</title>
</head>
<jsp:include page="bootstrapHead.jsp"></jsp:include>
<body>
	<p>
		<div>
			<h1>Update Dog Park information.</h1>
<form action="editDogPark.do" method="POST">
<fieldset>
<table>
		<tr>
			<td>
				<div class="form-floating mb-3">
		<input type="number" value="${dogpark.id }" hidden="true" name="editId" id="editId">
				 <input type="text" class="form-control" name="name" value="${dogpark.name }"id="name" min="1" max="50" placeholder="Name"> 
				<label for="name">Enter dog park name:</label>
				</div>
			</td>
		</tr>
			<tr>
			<td>
				<div class="form-floating mb-3">
				 <input type="text"  class="form-control" name="address" value="${dogpark.address }"id="address" min="1" max="500" placeholder="Address"> 
				<label for="address">Enter address:</label>
				</div>
			</td>
		</tr>
		<tr>
			<td>
				<div class="form-floating mb-3">
				<input type="text"  class="form-control" name="city" value="${dogpark.city }"id="city" min="1" max="50" placeholder="City ">
				<label for="city">Enter city:</label>	
				</div>
			</td>
		</tr>	
<tr>
			<td>
				<div class="form-floating mb-3">
		<input list="state"  value="${dogpark.state }" class="form-control" name="state" size="4" placeholder="ST">
		<label for="state">Enter state:</label>
  	<datalist id="state">
    <option value="AL"><option value="AK"><option value="AZ"><option value="AR">
    <option value="AS"><option value="CA"><option value="CO"><option value="CT">
    <option value="DE"><option value="DC"><option value="FL"><option value="GA">
    <option value="GU"><option value="HI"><option value="ID"><option value="IL">
    <option value="IN"><option value="IA"><option value="KS"><option value="KY">
    <option value="LA"><option value="ME"><option value="MD"><option value="MA">
    <option value="MI"><option value="MN"><option value="MS"><option value="MO">
    <option value="MT"><option value="NE"><option value="NV"><option value="NH">
    <option value="NJ"><option value="NM"><option value="NY"><option value="NC">
    <option value="ND"><option value="CM"><option value="OH"><option value="OK">
    <option value="OR"><option value="PA"><option value="PR"><option value="RI">
    <option value="SC"><option value="SD"><option value="TN"><option value="TX">
    <option value="UT"><option value="VT"><option value="VA"><option value="VI">
    <option value="WA"><option value="WV"><option value="WI"><option value="WY">
  </datalist>
  </div>
			</td>
		</tr>
				<%--  <input type="text" name="state" value="${dogpark.state }"id="state" min="2" max="2">  --%>
		<tr>
			<td>
				<div class="form-floating mb-3">
				 <input type="number"  class="form-control" name="size" value="${dogpark.size }"id="size" min="1" max="500" size="3" placeholder=" "> 
				<label for="size">Dog park size in acres:</label>
				</div>
			</td>
		</tr>
		</table>
		<button type="submit" class="btn btn-primary" value="Submit">Submit</button>
</fieldset>
</form>
<br><br>
	<a href="home.do">Return to main page</a>

</body>
</html>