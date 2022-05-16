<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Dog Park </title>
</head>
<jsp:include page="bootstrapHead.jsp"></jsp:include>
<body>
<ul class="nav nav-tabs justify-content-center">
  <li class="nav-item">
    <a class="nav-link active" aria-current="page" href="home.do">Home</a>
  </li>
  <li class="nav-item">
    <a class="nav-link" href="list.do">List All Dog Parks</a>
  </li>
  <li class="nav-item">
    <a class="nav-link" href="createDogPark.do">Create New Dog Park</a>
  </li>

</ul>

<h1>Welcome to the Dog Park database </h1>
<!-- ${DEBUG } TESTING, DELETE LATER -->

<form action="getPark.do" method="GET">
		Park ID: <input type="text" name="pid" /> <input type="submit"
			value="Show Park" />
	</form>
<br>
<span class="label img">
<img src="https://cdn.pixabay.com/photo/2016/10/30/02/35/el-salvador-1782203_1280.jpg" alt="Two dogs greeting eachother at dog park." />
</span>
</body>
</html>