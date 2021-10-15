<%-- 
    Document   : index
    Created on : Oct 14, 2021, 9:43:02 PM
    Author     : bryan
--%>

<%@page import="Model.Producto"%>
<%@page import="java.util.ArrayList"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%
    ArrayList<Producto> productos = Producto.GetAll();
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
                            <a href="/Parcial/Views/Carrito/ListCarrito.jsp" class="nav-link btn btn-primary text-white">Carrito</a>
                        </li>
                    </ul>
                </div>
            </div>
        </nav>
        <div class="container p-3">
            <h1>Productos</h1>
            <form method="POST" action="${pageContext.request.contextPath}/ProductoServlet">
                <div class="row">
                    <%
                        for (int i = 0; i < productos.size(); i++) {
                            out.println("<div class=\"col-4 pb-5\">");
                            out.println("<div class=\"card\" style=\"width: 18rem;\">");
                            out.println("<img src=\"data:image/png;base64,"+productos.get(i).imagen+"\" class=\"card-img-top\" alt=\"...\">");
                            out.println("<div class=\"card-body\">");
                            out.println("<h5 class=\"card-title\">" + productos.get(i).nombre_producto + "</h5>");
                            out.println("<p class=\"card-text\">" + productos.get(i).descripcion + "</p>");
                            out.println("<p class=\"card-text\">$" + productos.get(i).precio_normal + "</p>");
                            out.println("<button href=\"#\" type=submit name=\"btnProducto\" value=\"" + productos.get(i).idproducto + "\" class=\"btn btn-primary\">Agregar al carrito</button>");
                            out.println("</div>");
                            out.println("</div>");
                            out.println("</div>");
                        }
                    %>
                </div>
            </form>
                <input type="hidden" value=""/>
        </div>
        <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.bundle.min.js" integrity="sha384-ka7Sk0Gln4gmtz2MlQnikT1wXgYsOg+OMhuP+IlRH9sENBO0LRn5q+8nbTov4+1p" crossorigin="anonymous"></script>
    </body>
</html>
