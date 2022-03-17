<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	 <form action="Servlet" method="post">
        <label for="usernamelbl">Enter employeeID</label>
        <input type="text" name="emp_id" required><br>
        <label for="passlbl">Enter password</label>
        <input type="password" name="pwd" required><br>
        <input type="submit" value="login">
        <input type="reset">
        <a href="SignUp.jsp">SignUp</a>
    </form>
</body>
</html>