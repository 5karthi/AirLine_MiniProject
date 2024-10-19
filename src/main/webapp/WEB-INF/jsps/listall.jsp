<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>  
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>List All Passenger</title>
<style>

body{
background-color:lightgreen;

}
table{

}
</style>
</head>
<body>
<h2>List All Passenger</h2>
<hr>

<table border=2>
<tr>
<th>id</th>
<th>First Name </th>
<th>Last  Name </th>
<th>Email </th>
<th>Mobile </th>
<th>Depart </th>
<th>Destination </th>
<th>Delete </th>
<th>Update </th>

</tr>

<c:forEach var="passdata" items="${passdata}">
<tr>
<td>${passdata.id}</td>
<td>${passdata.fname}</td>
<td>${passdata.lname}</td>
<td>${passdata.email}</td>
<td>${passdata.contact}</td>
<td>${passdata.depart}</td>
<td>${passdata.destination}</td>
<td><a href="deletepass?id=${passdata.id}">Delete</a></td>
<td><a href="updatepass?id=${passdata.id}">Update</a></td>




</tr>
</c:forEach>

</table>

</body>
</html>