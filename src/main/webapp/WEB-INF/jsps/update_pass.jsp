<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
     <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>  
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Update Pass</title>
<link rel="stylesheet" href="style.css">
<style type="text/css">
body{
 background-color:skyblue;
}



</style>
</head>
<body>
<h2>Update Pass</h2>
<form action="updatepassdata"  method="post">
<pre>

     <input type="hidden" name="id" value="${pass1.id}"/>


		First Name      :<input type="text" name="fname" value="${pass1.fname}"/>


		Last Name       :<input type="text" name="lname" value="${pass1.lname}"/>

		Email           :<input type="text" name="email" value="${pass1.email}"/>

		Contact         :<input type="text" name="contact" value="${pass1.contact}"/>

		Depart          :<input type="text" name="depart" value="${pass1.depart}"/>

		Destination     :<input type="text" name="destination" value="${pass1.destination}"/>

                           <input type="Submit" value="Update passenger"/>


</pre>
</form>
</body>
</html>