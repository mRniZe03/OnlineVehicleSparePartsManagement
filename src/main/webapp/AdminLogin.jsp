<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <title>Admin Login</title>
    <script>
        function validateForm() {
            const username = document.forms["loginForm"]["adminusername"].value.trim();
            const password = document.forms["loginForm"]["adminpassword"].value.trim();
            if (username === "" || password === "") {
                alert("All fields are required!");
                return false;
            }
            return true;
        }
    </script>
</head>
<body>
    <h2>Admin Login</h2>
    <form name="loginForm" action="AdminLoginServlet" method="post" onsubmit="return validateForm()">
        <label>Username:</label>
        <input type="text" name="adminusername" required><br>
        <label>Password:</label>
        <input type="password" name="adminpassword" required><br>
        <button type="submit">Login</button>
    </form>
    <a href="AdminProfileForgotPassword.jsp">Forgot Password?</a>
</body>
</html>
