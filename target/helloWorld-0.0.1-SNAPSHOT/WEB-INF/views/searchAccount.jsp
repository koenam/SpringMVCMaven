<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Search Account</title>
</head>
<body>
<div class="container">
<div class="form-group form">
	<form action='searchAccount' method="post">
	<div>
		<label>Account number</label>
		<input type="text" id="accountNumber" name="accountNumber" placeholder="Account Number" class="form-control"/>
	</div>
	<button id="search" class-"form-control">SearchAccount</button>
	</form>
</div>
</div>
</body>
</html>