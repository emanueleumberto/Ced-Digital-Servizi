import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.util.Objects;

@WebServlet("/hello")
public class HelloServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        // super.doGet(req, resp);
        // resp.getWriter().println("Hello World!!!!");
//        resp.getWriter().append("Server at: ").append(req.getContextPath()).append(" - ");
//        resp.getWriter().append("Method: ").append(req.getMethod());
//        resp.getWriter().append(" Locale: ").append(req.getLocale().toString());
//        resp.getWriter().append(" Host: ").append(req.getHeader("Host"));
//        resp.getWriter().append(" Query String: ").append(req.getQueryString());
//        resp.getWriter().append(" Firstname: ").append(req.getParameter("firstname"));

        String nome = req.getParameter("firstname");
        String cognome = req.getParameter("lastname");

        if(!Objects.equals(nome, "") || !Objects.equals(cognome, "")) {
            resp.getWriter().println("<h1>Il nome inserito: " + nome + "</h1>");
            resp.getWriter().println("<h1>Il cognome inserito: " + cognome + "</h1>");
        } else {
            resp.getWriter().println("<h1>Valori errati</h1>");
        }
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        // resp.getWriter().append("Sono il metodo doPost: ");
        // resp.getWriter().append("Method: ").append(req.getMethod());
        doGet(req, resp);
    }
}
