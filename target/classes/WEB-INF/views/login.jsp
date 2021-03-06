<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Login</title>
<link href="webjars/bootstrap/3.3.6/css/bootstrap.min.css" rel="stylesheet">
</head>
<body>
<div class="container">
${loginError}
<div class="form-group form">
	<form action='login' method="post">
	
	<div>
		<label>User name</label>
		<input type="text" id="userId" name="userId" placeholder="user name" class="form-control"/>
	</div>
	<div>
		<label>Password</label>
		<input type="password" id="password" name="password" placeholder="password" class="form-control"/>
	</div>
	<button id="loginButton" class="btn btn-primary">Login</button>
	</form>
</div>
</div>
<script src="webjars/bootstrap/3.3.6/css/bootstrap.min.css"></script>
<script src="webjars/jquery/1.9.1/jquery.min.js"></script>
</body>
</html>