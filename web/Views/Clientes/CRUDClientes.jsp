<%-- 
    Document   : CRUDClientes
    Created on : Oct 12, 2021, 11:12:58 PM
    Author     : bryan
--%>

<%@page import="Model.Clientes"%>
<%@page import="java.util.ArrayList"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<% ArrayList<Clientes> clientes = Clientes.GetAll(); %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3" crossorigin="anonymous">
    </head>
    <body>
        <nav class="navbar navbar-expand-lg navbar-light bg-light">
            <div class="container-fluid">
                <a class="navbar-brand" href="#"> Bryan Palma</a>
                <button class="navbar-toggler" type="button" data-bs-toggle="collapse" data-bs-target="#navbarSupportedContent" aria-controls="navbarSupportedContent" aria-expanded="false" aria-label="Toggle navigation">
                    <span class="navbar-toggler-icon"></span>
                </button>
                <div class="collapse navbar-collapse" id="navbarSupportedContent">
                    <ul class="navbar-nav me-auto mb-2 mb-lg-0">
                        <li class="nav-item">
                            <a class="nav-link active" aria-current="page" href="#">Inicio</a>
                        </li>
                        <li class="nav-item">
                            <a class="nav-link" href="#">Clientes</a>
                        </li>
                        <li class="nav-item">
                            <a class="nav-link disabled">Productos</a>
                        </li>
                    </ul>
                </div>
            </div>
        </nav>
        <div class="container">
            <h1>Clientes</h1>
            <form action="${pageContext.request.contextPath}/ClientesServlet" method="POST">
                <div class="mb-3">
                    <label for="exampleInputEmail1" class="form-label">Nombres</label>
                    <input type="text" class="form-control" id="exampleInputEmail1" aria-describedby="emailHelp">
                </div>
                <div class="mb-3">
                    <label for="exampleInputEmail1" class="form-label">Apellidos</label>
                    <input type="text" class="form-control" id="exampleInputEmail1" aria-describedby="emailHelp">
                </div>
                <div class="mb-3">
                    <label for="exampleInputEmail1" class="form-label">Direccion</label>
                    <input type="text" class="form-control" id="exampleInputEmail1" aria-describedby="emailHelp">
                </div>
                <div class="mb-3">
                    <label for="exampleInputEmail1" class="form-label">Telefono</label>
                    <input type="text" class="form-control" id="exampleInputEmail1" aria-describedby="emailHelp">
                </div>
                <div class="mb-3">
                    <label for="exampleInputEmail1" class="form-label">Sexo</label>
                    <input type="email" class="form-control" id="exampleInputEmail1" aria-describedby="emailHelp">
                </div>
                <div class="mb-3">
                    <label for="exampleInputPassword1" class="form-label">Clave</label>
                    <input type="password" class="form-control" id="exampleInputPassword1">
                </div>
                <div class="mb-3">
                    <label for="exampleInputEmail1" class="form-label">Correo</label>
                    <input type="email" class="form-control" id="exampleInputEmail1" aria-describedby="emailHelp">
                    <div id="emailHelp" class="form-text">We'll never share your email with anyone else.</div>
                </div>
                <button type="submit"  name="btnAction" value="1-0" class="btn btn-primary">Registrar</button>
            </form>   
            <form action="${pageContext.request.contextPath}/ClientesServlet" method="POST">
                <table class="table">
                    <thead>
                        <tr>
                            <th>Nombres</th>
                            <th>Apellidos</th>
                            <th>Direccion</th>
                            <th>Telefono</th>
                            <th>Sexo</th>
                            <th>Correo</th>
                        </tr>
                    </thead>
                    <tbody>
                        <%
                            for (int i = 0; i < clientes.size(); i++) {
                                out.println("<tr>");
                                out.println("<td>");
                                out.println(clientes.get(i).nombres);
                                out.println("</td>");
                                out.println("<td>");
                                out.println(clientes.get(i).apellidos);
                                out.println("</td>");
                                out.println("<td>");
                                out.println(clientes.get(i).direccion);
                                out.println("</td>");
                                out.println("<td>");
                                out.println(clientes.get(i).telefono);
                                out.println("</td>");
                                out.println("<td>");
                                out.println(clientes.get(i).sexo);
                                out.println("</td>");
                                out.println("<td>");
                                out.println(clientes.get(i).correo);
                                out.println("</td>");
                                out.println("<td>");
                                out.println("<button type=\"submit\" name=\"btnAction\" value=\"2-" + clientes.get(i).idcliente + "\" class=\"btn btn-danger\">Eliminar</button>");
                                out.println("<button type=\"submit\" name=\"btnAction\" value=\"3-" + clientes.get(i).idcliente + "\" class=\"btn btn-info\">Editar</button>");
                                out.println("</td>");
                                out.println("</tr>");
                            }
                        %>
                    </tbody>
                </table>
            </form>
        </div>
        <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.bundle.min.js" integrity="sha384-ka7Sk0Gln4gmtz2MlQnikT1wXgYsOg+OMhuP+IlRH9sENBO0LRn5q+8nbTov4+1p" crossorigin="anonymous"></script>
    </body>
</html>
