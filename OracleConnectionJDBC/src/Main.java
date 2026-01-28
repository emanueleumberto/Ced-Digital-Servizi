import classes.Utente;
import dao.UtenteDAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Main {
    public static void main(String[] args) {
//        String url = "jdbc:oracle:thin:@localhost:1522:xe";
//        String user = "system";
//        String pass = "root";
//
//        try {
//            Connection conn = DriverManager.getConnection(url, user, pass);
//            Statement st = conn.createStatement();
//            System.out.println("Connected to Oracle Database!");
//
//            st.close();
//            conn.close();
//        } catch (SQLException e) {
//            System.out.println("Connection failed!!!");
//            System.out.println(e.getMessage());
//        }

        Utente u = new Utente("Mara", "Viola", "Cagliari", "m.viola@example,com");


        try {
            UtenteDAO.createUser(u);
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }

}