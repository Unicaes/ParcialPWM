<%-- 
    Document   : ListCarrito
    Created on : Oct 15, 2021, 8:38:04 AM
    Author     : bryan
--%>

<%@page import="Model.clsCarrito"%>
<%@page import="java.util.Map"%>
<%@page import="Model.Producto"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%
    Map<Integer, Producto> productos = clsCarrito.GetInstance().carrito;
    double subtotal=0;
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
            <form method="POST" action="${pageContext.request.contextPath}/CarritoServlet">
                <table class="table">
                    <thead>
                        <tr>
                            <td>Nombre producto</td>
                            <td>Precio</td>
                            <td>Cantidad</td>
                            <td></td>
                            <td></td>
                        </tr>
                    </thead>
                    <tbody>
                        <%
                            if (productos.size() <= 0) {
                                out.println("<h1>No se han agregado productos al carrito</h1>");
                            } else {
                                for (Map.Entry<Integer, Producto> entry : productos.entrySet()) {
                                    out.println("<tr>");
                                    out.println("<td>");
                                    out.println(entry.getValue().nombre_producto);
                                    out.println("</td>");
                                    out.println("<td>");
                                    out.println(entry.getValue().precio_normal);
                                    out.println("</td>");
                                    out.println("<td>");
                                    out.println(entry.getValue().cantCarrito);
                                    out.println("</td>");
                                    out.println("<td>");
                                    out.println("<button type=\"submit\" name=\"btnAction\" value=\"2-" + entry.getKey() + "\">-</button>");
                                    out.println("</td>");
                                    out.println("<td>");
                                    out.println("<button type=\"submit\" name=\"btnAction\" value=\"1-" + entry.getKey() + "\">+</button>");
                                    out.println("</td>");
                                    out.println("</tr>");
                                    subtotal+=(entry.getValue().existencias*entry.getValue().precio_normal);
                                }
                            }
                        %>
                    </tbody>
                </table>
                        <h3>Subtotal: <% out.println(subtotal); %></h3>
                        <button class="btn btn-success" type="submit" name="btnAction" value="4-0">Pagar</button>
            </form>
        </div>
        <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.bundle.min.js" integrity="sha384-ka7Sk0Gln4gmtz2MlQnikT1wXgYsOg+OMhuP+IlRH9sENBO0LRn5q+8nbTov4+1p" crossorigin="anonymous"></script>
    </body>
</html>
