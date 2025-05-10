package dao;

import java.sql.*;
import model.AdminModel;
import util.DBconnection;

public class AdminDAO {
    public AdminModel validateLogin(String username, String password) {
        AdminModel admin = null;
        try (Connection con = DBconnection.getConnection();
             PreparedStatement ps = con.prepareStatement("SELECT * FROM admin WHERE adminusername = ? AND adminpassword = ?")) {
            ps.setString(1, username);
            ps.setString(2, password);
            ResultSet rs = ps.executeQuery();

            if (rs.next()) {
                admin = new AdminModel(
                    rs.getInt("adminid"),
                    rs.getString("adminname"),
                    rs.getString("adminemail"),
                    rs.getString("adminusername"),
                    rs.getString("adminpassword")
                );
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return admin;
    }
}
