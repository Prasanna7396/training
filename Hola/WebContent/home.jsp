<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Home Page</title>
</head>
<body bgcolor="grey">
<jsp:include page="banner.jsp" />
<form action="User.hola">
<label>Email &nbsp<input type="text" name="email" required/><br>
<br>
<label>Password &nbsp<input type="password" name="password"required/><br>
<br>
<input type="submit" name="submit" value="submit">
<br><br>
<a href="forget.jsp">forgot password?</a><br>
<a> New user?</a>
<a href="register.jsp">Register</a>
</form>
<%@ include file="footer.html" %>
</body>
</html>