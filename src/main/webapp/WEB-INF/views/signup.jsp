<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<div align="center">
  <h1>Employee Signup Form</h1>
  <form action="/employeeServlet" method="post">
   <table style="with: 80%">
    <tr>
     <td>Employee ID</td>
     <td><input type="text" name="emp_id" /></td>
    </tr>
    <tr>
     <td>First Name</td>
     <td><input type="text" name="firstname" /></td>
    </tr>
    <tr>
     <td>Last Name</td>
     <td><input type="text" name="lastname" /></td>
    </tr>
    <tr>
     <td>DOB</td>
     <td><input type="text" name="DOB" /></td>
    </tr>
    <tr>
     <td>Contact </td>
     <td><input type="password" name="contact" /></td>
    </tr>
    
   
   </table>
   <input type="submit" value="Submit" />
  </form>
 </div>
</body>
</html>