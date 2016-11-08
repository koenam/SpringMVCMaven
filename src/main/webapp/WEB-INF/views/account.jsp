<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Account Details</title>
<link href="webjars/bootstrap/3.3.6/css/bootstrap.min.css" rel="stylesheet">
</head>
<body>
<div class="container">
<div class="form-group form">
	<form>
	<h4>Account number : ${account.accountNumber}</h4>
	<div>Contact Information</div>
		<table class="table table-striped">
			<thead>
			<tr>
			<th>First Name</th>
			<th>Last Name</th>
			<th>Email</th>
			<th>Opening Balance</th>
			<th>Closing Balance</th>
			<th>Invoice Due Date</th>
			</tr>
			</thead>
			<tbody>
			<tr>
			<td>${contact.firstName}</td>
			<td>${contact.lastName}</td>
			<td>${contact.email}</td>
			<td>${invoice.openingBalance}</td>
			<td>${invoice.closingBalance}</td>
			<td>${invoice.invoiceDueDate}</td>
			</tr>
			</tbody>
		</table>
		
	  <div>Itemized Information</div>
		<table class="table table-striped">
			<thead>
			<tr>
			<th>Call Date</th>
			<th>Call Time</th>
			<th>Call Type</th>
			<th>Call Cost</th>
			</tr>
			</thead>
			<tbody>
			<c:forEach items="${itemised}" var="item">
			<tr>
			<td>${item.callDate.toString()}</td>
			<td>${item.callTime}</td>
			<td>${item.callType}</td>
			<td>${item.callCost}</td>
			</tr>
			</c:forEach>
			</tbody>
		</table>
	</form>
</div>
</div>
<script src="webjars/bootstrap/3.3.6/css/bootstrap.min.css"></script>
<script src="webjars/jquery/1.9.1/jquery.min.js"></script>
</body>
</html>