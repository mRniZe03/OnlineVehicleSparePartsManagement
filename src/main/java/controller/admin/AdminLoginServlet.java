package controller;

import model.AdminModel;
import service.AdminServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
import java.io.IOException;

@WebServlet("/AdminLoginServlet")
public class AdminLoginServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        String adminusername = request.getParameter("adminusername");
        String adminpassword = request.getParameter("adminpassword");

        AdminServiceImpl service = new AdminServiceImpl();
        AdminModel admin = service.login(adminusername, adminpassword);

        if (admin != null) {
            HttpSession session = request.getSession();
            session.setAttribute("admin", admin);
            session.setMaxInactiveInterval(30 * 60); // optional: 30 mins
            response.sendRedirect("AdminDashboardSidebar.jsp");
        } else {
            response.getWriter().println("<script>alert('Invalid Username or Password.');window.location.href='AdminLogin.jsp';</script>");
        }
    }
}
