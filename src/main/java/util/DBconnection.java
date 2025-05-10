package util;

import java.sql.Connection;
import java.sql.DriverManager;

public class DBconnection {

    private static final String URL = "jdbc:mysql://localhost:3306/vehiclespareparts";
    private static final String USERNAME = "root";
    private static final String PASSWORD = "Chethaka123#"; // ⚠️ Move to env/config in real projects

    public static Connection getConnection() {
        Connection connection = null;
        try {
            Class.forName("com.mysql.jdbc.Driver"); // Use com.mysql.cj.jdbc.Driver if newer version
            connection = DriverManager.getConnection(URL, USERNAME, PASSWORD);
        } catch (Exception e) {
            System.err.println("Database connection failed: " + e.getMessage());
        }
        return connection;
    }
}



