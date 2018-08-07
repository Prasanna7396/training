<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>RegisterPage</title>
</head>
<body bgcolor="grey">
<jsp:include page="banner.jsp" />
<form action="User.hola" method="get">
<label>Name: <input type="text" name="name" required><br><br>
<label>E-mail: <input type="email" name="email" required><br><br>
<label>Password: <input type="password" name="password"  title="Eight or more characters " minlength=8 maxlength=16 required><br><br>
<label>Age: <input type="number" name="age"  required><br><br>
<label>Gender: <input type="radio" name="gender" value="Male" checked/> Male<br>
  <input type="radio" name="gender" value="Female"/> Female
  <input type="radio" name="gender" value="Other"/> Other<br><br>
<label>City: <input type="text" name="city" required><br><br>
<label>Favourite Movie: <input type="text" name="movie" required><br><br>
<label>Photo: <input type="file" id="myFile" name="photo"><br><br>
    <input type="submit" value="submit">
</form>

<%@ include file="footer.html" %>
</body>
</html>