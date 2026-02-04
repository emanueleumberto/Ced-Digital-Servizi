<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>

<html lang="it">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Register User</title>
</head>
<body>
    <header>
        <h1>Register User</h1>
    </header>

    <main>
    <% out.print("Sono una scriptlet"); %>
        <form action="<%= request.getContextPath() + "/SaveUser" %>" method="POST">
            <input type="text" name="firstname" placeholder="Inserisci nome" /><br />
            <input type="text" name="lastname" placeholder="Inserisci cognome" /><br />
            <input type="text" name="email" placeholder="Inserisci email" /><br />
            <input type="text" name="username" placeholder="Inserisci username" /><br />
            <input type="password" name="password" placeholder="Inserisci password" /><br />
            <button type="submit">Register</button>
        </form>
    </main>

    <footer>
        <p>Web application Java</p>
    </footer>
</body>
</html>