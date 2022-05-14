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

<div>

 <h5>${dogpark.name}</h5>
  <p><a href="https://maps.google.com/?q=${dogpark.address}, ${dogpark.city}">${dogpark.address}</a></p>
  <p>${dogpark.city}, ${dogpark.state}</p>
  <p>${dogpark.size} Acre</p>
  
</div>

</body>
</html>