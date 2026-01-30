package dao;

import classes.Azienda;
import classes.Utente;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class UtenteDAO {

    // Utilizzo la classe Singleton dao.DBConnSingleton
//    private static String url = "jdbc:oracle:thin:@localhost:1522:xe";
//    private static String user = "system";
//    private static String pass = "root";

    public static void createUser(Utente u) throws SQLException {

        // Utilizzo la classe Singleton dao.DBConnSingleton
//        Connection conn = DriverManager.getConnection(url, user, pass);

        // Attenzione -> Problemi di SQL Injection
//         Statement st = conn.createStatement();
//         String sql = "INSERT INTO utenti (firstname, lastname, city, email)" +
//                     " VALUES ('"+u.getFirstName()+"', '"+u.getLastName()+"', " +
//                                "'"+u.getCity()+"', '"+u.getEmail()+"')";

        // PreparedStatement -> Risolve Problemi di SQL Injection
        String sql;
        if(u.getCompany() != null) {
            sql = "INSERT INTO utenti (firstname, lastname, city, email, company) VALUES (?, ?, ?, ?, ?)";
        } else {
            sql = "INSERT INTO utenti (firstname, lastname, city, email) VALUES (?, ?, ?, ?)";
        }
//        Connection conn = DBConnSingleton.getInstance().getConn();
//        PreparedStatement st = conn.prepareStatement(sql);

        PreparedStatement st = DBConnSingleton.getInstance().getConn().prepareStatement(sql);

        st.setString(1, u.getFirstName());
        st.setString(2, u.getLastName());
        st.setString(3, u.getCity());
        st.setString(4, u.getEmail());
        if(u.getCompany() != null){
            st.setInt(5, u.getCompany().getCompany_id());
        }

        if(st.executeUpdate() > 0) {
            System.out.println("A row has been inserted!");
        }

        st.close();
    }

    public static Utente findUser(int id) throws SQLException {
        // Statement st = DBConnSingleton.getInstance().getConn().createStatement();
        //String sql = "SELECT * FROM utenti WHERE user_id = " + id;

        String sql = "SELECT * FROM utenti WHERE user_id = ?";
        PreparedStatement st = DBConnSingleton.getInstance().getConn().prepareStatement(sql);
        st.setLong(1, id);

        ResultSet rs = st.executeQuery(); // null | Obj
        if(rs.next()) {
            Long id_user = rs.getLong("user_id");
            String name = rs.getString("firstname");
            String lastname = rs.getString("lastname");
            String city = rs.getString("city");
            String email = rs.getString("email");

            Azienda a = AziendaDAO.findCompany(rs.getInt("company"));

            Utente u = new Utente(id_user,name, lastname,city,email);
            u.setCompany(a);


            st.close();
            // System.out.println(u);
            return u;
        }

        st.close();
        return null;

    }

    public static void updateUser(Utente u) throws SQLException {
        String sql = "UPDATE utenti SET firstname = ?, lastname = ?, city = ?, email = ? WHERE user_id = ?";
        PreparedStatement st = DBConnSingleton.getInstance().getConn().prepareStatement(sql);
        st.setString(1, u.getFirstName());
        st.setString(2, u.getLastName());
        st.setString(3, u.getCity());
        st.setString(4, u.getEmail());
        st.setLong(5, u.getUser_id());

        if(st.executeUpdate() > 0) {
            System.out.println("A row has been modified!");
        }

        st.close();
    }

    public static void removeUser(Utente u) throws SQLException {
        String sql = "DELETE FROM utenti WHERE user_id = ?";
        PreparedStatement st = DBConnSingleton.getInstance().getConn().prepareStatement(sql);
        st.setLong(1, u.getUser_id());

        if(st.executeUpdate() > 0) {
            System.out.println("A row has been deleted!");
        }

        st.close();
    }

    public static List<Utente> findAllUsers() throws SQLException {
        List<Utente> lista = new ArrayList<>();
        String sql = "SELECT * FROM utenti";
        PreparedStatement st = DBConnSingleton.getInstance().getConn().prepareStatement(sql);
        ResultSet rs = st.executeQuery(); // [] | [...]
        while (rs.next()) {
            Long id_user = rs.getLong("user_id");
            String name = rs.getString("firstname");
            String lastname = rs.getString("lastname");
            String city = rs.getString("city");
            String email = rs.getString("email");
            Azienda a = AziendaDAO.findCompany(rs.getInt("company"));
            Utente u = new Utente(id_user,name, lastname,city,email);
            u.setCompany(a);
            lista.add(u);
        }
        st.close();
        return lista;
    }
}
