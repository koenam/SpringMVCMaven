<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Search Account</title>
<link href="webjars/bootstrap/3.3.6/css/bootstrap.min.css" rel="stylesheet">
</head>
<body>
<div class="container">
<div class="form-group form">
	<form action='searchAccount' method="post">
	<div>${accountError}</div>
	<div class="form-group">
                <label for="accountNumber">Account Number</label>
                <input type="text" class="form-control" id="accountNumber" name="accountNumber" placeholder="Account Number" required>
           </div>
	<button id="search" class="btn btn-primary">SearchAccount</button>
	</form>
</div>
</div>
<script src="webjars/bootstrap/3.3.6/css/bootstrap.min.css"></script>
<script src="webjars/jquery/1.9.1/jquery.min.js"></script>
</body>
</html>