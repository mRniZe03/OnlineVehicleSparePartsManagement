<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head><title>Forgot Password</title></head>
<body>
<h2>Forgot Password</h2>
<form action="AdminProfileForgotPasswordServlet" method="post">
    <label>Enter Your Email:</label>
    <input type="email" name="adminemail" required>
    <button type="submit">Submit</button>
</form>
</body>
</html>