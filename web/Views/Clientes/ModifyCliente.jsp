<%-- 
    Document   : ModifyCliente
    Created on : Oct 15, 2021, 1:25:48 PM
    Author     : bryan
--%>

<%@page import="Model.Clientes"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%
int id = Integer.parseInt(request.getParameter("id"));
Clientes item = Clientes.GetById(id);
%>
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
                <a class="navbar-brand" href="#"> JSP</a>
                <button class="navbar-toggler" type="button" data-bs-toggle="collapse" data-bs-target="#navbarSupportedContent" aria-controls="navbarSupportedContent" aria-expanded="false" aria-label="Toggle navigation">
                    <span class="navbar-toggler-icon"></span>
                </button>
                <div class="collapse navbar-collapse" id="navbarSupportedContent">
                    <ul class="navbar-nav me-auto mb-2 mb-lg-0">
                        <li class="nav-item">
                            <a href="/Parcial/Views/index.jsp" class="nav-link active" aria-current="page" href="#">Inicio</a>
                        </li>
                        <li class="nav-item">
                            <a href="/Parcial/Views/Clientes/CRUDClientes.jsp" class="nav-link" href="#">Clientes</a>
                        </li>
                        <li class="nav-item">
                            <a href="/Parcial/Views/Producto/CrudProductos.jsp" class="nav-link">Productos</a>
                        </li>
                        <li class="nav-item">
                            <a href="/Parcial/Views/Categoria/CRUDCategoria.jsp" class="nav-link">Categoria</a>
                        </li>
                        <li class="nav-item">
                            <a href="/Parcial/Views/Proveedor/CRUDProveedor.jsp" class="nav-link">Proveedores</a>
                        </li>
                        <li class="nav-item">
                            <a href="/Parcial/Views/Carrito/ListCarrito.jsp" class="nav-link btn btn-primary text-white">Carrito</a>
                        </li>
                    </ul>
                </div>
            </div>
        </nav>
        <div class="container">
            <h1>Modificar cliente</h1>
            <form action="${pageContext.request.contextPath}/ClientesServlet" method="POST">
                <div class="mb-3">
                    <label for="exampleInputEmail1" class="form-label">Nombres</label>
                    <input type="text" value=<% out.println(item.nombres); %> name="txtNombres" class="form-control" id="exampleInputEmail1" aria-describedby="emailHelp">
                </div>
                <div class="mb-3">
                    <label for="exampleInputEmail1" class="form-label">Apellidos</label>
                    <input type="text" value=<% out.println(item.apellidos); %> name="txtApellidos" class="form-control" id="exampleInputEmail1" aria-describedby="emailHelp">
                </div>
                <div class="mb-3">
                    <label for="exampleInputEmail1" class="form-label">Direccion</label>
                    <input type="text" value=<% out.println(item.direccion); %> name="txtDireccion" class="form-control" id="exampleInputEmail1" aria-describedby="emailHelp">
                </div>
                <div class="mb-3">
                    <label for="exampleInputEmail1" class="form-label">Telefono</label>
                    <input type="text" value=<% out.println(item.telefono); %> name="txtTelefono" class="form-control" id="exampleInputEmail1" aria-describedby="emailHelp">
                </div>
                <div class="mb-3">
                    <label for="exampleInputEmail1" class="form-label">Sexo</label>
                    <select class="form-select" name="txtSexo">
                        <option value="M">Masculino</option>
                        <option value="F">Femenino</option>
                    </select>
                </div>
                <div class="mb-3">
                    <label for="exampleInputPassword1" class="form-label">Clave</label>
                    <input type="password" value=<% out.println(item.clave); %> name="txtClave" class="form-control" id="exampleInputPassword1">
                </div>
                <div class="mb-3">
                    <label for="exampleInputEmail1" class="form-label">Correo</label>
                    <input type="email" value=<% out.println(item.correo); %> name="txtMail" class="form-control" id="exampleInputEmail1" aria-describedby="emailHelp">
                    <div id="emailHelp" class="form-text">We'll never share your email with anyone else.</div>
                </div>
                    <%
                    out.println("<button type=\"submit\" name=\"btnAction\" value=\"5-" + id + "\" class=\"btn btn-primary\">Actualizar</button>");
                %>
                </form>
        </div>
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.bundle.min.js" integrity="sha384-ka7Sk0Gln4gmtz2MlQnikT1wXgYsOg+OMhuP+IlRH9sENBO0LRn5q+8nbTov4+1p" crossorigin="anonymous"></script>
    </body>
</html>
