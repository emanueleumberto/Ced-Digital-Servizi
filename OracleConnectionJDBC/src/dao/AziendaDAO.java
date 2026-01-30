package dao;

import classes.Azienda;
import classes.Utente;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class AziendaDAO {

    public static void createCompany(Azienda a) throws SQLException {
        String sql = "INSERT INTO azienda (company_name, company_address) VALUES (?, ?)";
        PreparedStatement st = DBConnSingleton.getInstance().getConn().prepareStatement(sql);

        st.setString(1, a.getComapnyName());
        st.setString(2, a.getCompanyAddress());

        if(st.executeUpdate() > 0) {
            System.out.println("A row has been inserted!");
        }

        st.close();
    }

    public static Azienda findCompany(int id) throws SQLException {
        String sql = "SELECT * FROM azienda WHERE company_id = ?";
        PreparedStatement st = DBConnSingleton.getInstance().getConn().prepareStatement(sql);
        st.setLong(1, id);

        ResultSet rs = st.executeQuery(); // null | Obj
        if(rs.next()) {
            int id_company = rs.getInt("company_id");
            String name = rs.getString("company_name");
            String address = rs.getString("company_address");

            st.close();
            // System.out.println(u);
            return new Azienda(id_company, name, address);
        }
        st.close();
        return null;
    }

    public static void updateCompany(Azienda a) throws SQLException {
        String sql = "UPDATE azienda SET company_name = ?, company_address = ? WHERE company_id = ?";
        PreparedStatement st = DBConnSingleton.getInstance().getConn().prepareStatement(sql);
        st.setString(1, a.getComapnyName());
        st.setString(2, a.getCompanyAddress());
        st.setLong(3, a.getCompany_id());

        if(st.executeUpdate() > 0) {
            System.out.println("A row has been modified!");
        }

        st.close();
    }

    public static void removeCompany(Azienda a) throws SQLException {
        String sql = "DELETE FROM azienda WHERE company_id = ?";
        PreparedStatement st = DBConnSingleton.getInstance().getConn().prepareStatement(sql);
        st.setLong(1, a.getCompany_id());

        if(st.executeUpdate() > 0) {
            System.out.println("A row has been deleted!");
        }

        st.close();
    }

    public static List<Azienda> findAllCompany() throws SQLException {
        String sql = "SELECT * FROM azienda";
        PreparedStatement st = DBConnSingleton.getInstance().getConn().prepareStatement(sql);

        List<Azienda> lista = new ArrayList<>();

        ResultSet rs = st.executeQuery(); // [] | [...]
        while(rs.next()) {
            int id_company = rs.getInt("company_id");
            String name = rs.getString("company_name");
            String address = rs.getString("company_address");

            lista.add(new Azienda(id_company, name, address));
        }
        st.close();
        return lista;
    }


}
