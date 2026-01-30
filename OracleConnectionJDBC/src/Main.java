import classes.Azienda;
import classes.Utente;
import dao.AziendaDAO;
import dao.DBConnSingleton;
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

        try {
            // Utente u = new Utente("Mario", "Rossi", "Roma", "m.rossi@example.com");
            // Utente u = new Utente("Mara", "Viola", "Cagliari", "m.viola@example,com");
            // u.setCompany(AziendaDAO.findCompany(1));
            // Utente u = new Utente("Luigi", "Neri", "Padova", "l.neri@example.com");
            // Utente u = new Utente("Giuseppe", "Verdi", "Milano", "g.verdi@example.com");
            // u.setCompany(AziendaDAO.findCompany(2));
            // Utente u = new Utente("Francesca", "Bianchi", "Napoli", "f.bianchi@example.com");
            // u.setCompany(AziendaDAO.findCompany(3));

            // UtenteDAO.createUser(u);
            // Utente ut = UtenteDAO.findUser(30);
            // System.out.println(ut);
            // ut.setEmail("a.bianchi@example.com");
            // UtenteDAO.updateUser(ut);
            // UtenteDAO.removeUser(ut);

            UtenteDAO.findAllUsers().forEach(System.out::println);

            // Azienda a = new Azienda("Apple", "Via Marconi 1");
            // Azienda a = new Azienda("Samsung", "Via Vittoria 9");
            // Azienda a = new Azienda("Fiat", "Via Agnelli 51");
            // AziendaDAO.createCompany(a);

            // Azienda az = AziendaDAO.findCompany(2);
            // az.setCompanyAddress("Via Vittoria 90");
            // AziendaDAO.updateCompany(az);
            // AziendaDAO.removeCompany(az);

            // AziendaDAO.findAllCompany().forEach(System.out::println);

        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }

}