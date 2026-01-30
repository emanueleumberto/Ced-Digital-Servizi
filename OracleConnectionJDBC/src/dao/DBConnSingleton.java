package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnSingleton {

    private static String url = "jdbc:oracle:thin:@localhost:1522:xe";
    private static String user = "system";
    private static String pass = "root";
    private static DBConnSingleton db;
    private static Connection conn;

    private DBConnSingleton() throws SQLException {
        conn = DriverManager.getConnection(url, user, pass);
    }

    public static DBConnSingleton getInstance() throws SQLException {
        if(db == null) {
            db = new DBConnSingleton();
        }
        return db;
    }

    public Connection getConn() {
        return conn;
    }
}
