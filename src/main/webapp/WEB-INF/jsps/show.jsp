<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>

<%@include file="menu.jsp" %>
<html>
<head>
<meta charset="ISO-8859-1">
<title>JET BLUE AIRLINES</title>

<link rel="stylesheet" href="style.css">




</head>
<body>
<h2>Passenger Booking Trip</h2>
<form action="savepass"  method="post">
<pre>


        

		First Name      :<input type="text" name="fname">


		Last Name       :<input type="text" name="lname">

		Email           :<input type="text" name="email">

		Contact         :<input type="text" name="contact">

		Depart          :<input type="text" name="depart">

		Destination     :<input type="text" name="destination">

                           <input type="Submit" value="Book"/>


</pre>
</form>
</body>
</html>