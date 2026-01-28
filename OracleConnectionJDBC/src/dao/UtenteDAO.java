package dao;

import classes.Utente;

import java.sql.*;

public class UtenteDAO {

    private static String url = "jdbc:oracle:thin:@localhost:1522:xe";
    private static String user = "system";
    private static String pass = "root";

    public static void createUser(Utente u) throws SQLException {
        Connection conn = DriverManager.getConnection(url, user, pass);

        // Statement st = conn.createStatement();
        // String sql = "INSERT INTO utenti (firstname, lastname, city, email)" +
        //             " VALUES ('"+u.getFirstName()+"', '"+u.getLastName()+"', " +
        //                        "'"+u.getCity()+"', '"+u.getEmail()+"')";

        String sql = "INSERT INTO utenti (firstname, lastname, city, email) VALUES (?, ?, ?, ?)";
        PreparedStatement st = conn.prepareStatement(sql);
        st.setString(1, u.getFirstName());
        st.setString(2, u.getLastName());
        st.setString(3, u.getCity());
        st.setString(4, u.getEmail());

        if(st.executeUpdate() > 0) {
            System.out.println("A row has been inserted!");
        }

        st.close();
        conn.close();
    }

}
