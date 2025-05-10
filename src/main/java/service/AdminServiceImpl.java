package service;

import dao.AdminDAO;
import model.AdminModel;

public class AdminServiceImpl {
    private AdminDAO dao = new AdminDAO();

    public AdminModel login(String username, String password) {
        return dao.validateLogin(username, password);
    }
}