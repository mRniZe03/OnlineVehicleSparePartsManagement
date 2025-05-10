<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%
    String email = request.getParameter("adminemail");
%>
<!DOCTYPE html>
<html>
<head><title>Reset Password</title></head>
<body>
<h2>Reset Password</h2>
<form action="AdminProfileResetPasswordServlet" method="post">
    <input type="hidden" name="adminemail" value="<%= email %>">
    <label>New Password:</label>
    <input type="password" name="newpassword" required><br>
    <label>Confirm Password:</label>
    <input type="password" name="confirmpassword" required><br>
    <button type="submit">Reset Password</button>
</form>
</body>
</html>