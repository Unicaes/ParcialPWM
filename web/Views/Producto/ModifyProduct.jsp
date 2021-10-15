<%-- 
    Document   : ModifyProduct
    Created on : Oct 15, 2021, 12:14:18 PM
    Author     : bryan
--%>

<%@page import="Model.Categoria"%>
<%@page import="Model.Proveedores"%>
<%@page import="java.util.ArrayList"%>
<%@page import="Model.Producto"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%
    int id = Integer.parseInt(request.getParameter("id"));
    Producto item = Producto.GetById(id);
    ArrayList<Proveedores> proveedores = Proveedores.GetAll();
    ArrayList<Categoria> categorias = Categoria.GetAll();
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
        <div class="container pb-5">
            <h1>Modificar producto</h1>
            <form action="${pageContext.request.contextPath}/CRUDProductos" enctype="multipart/form-data" method="POST">
                <div class="mb-3">
                    <label for="exampleInputEmail1" class="form-label">Categoria</label>
                    <select class="form-select" name="txtCategoria">
                        <%
                            for (int i = 0; i < categorias.size(); i++) {
                                out.println("<option value=\"" + categorias.get(i).idcategoria + "\">" + categorias.get(i).nombre_categoria + "</option>");
                            }
                        %>
                    </select>
                </div>
                <div class="mb-3">
                    <label for="exampleInputEmail1" class="form-label">Proveedor</label>
                    <select class="form-select" name="txtProveedor">
                        <%
                            for (int i = 0; i < proveedores.size(); i++) {
                                out.println("<option value=\"" + proveedores.get(i).idproveedor + "\">" + proveedores.get(i).nombre_proveedor + "</option>");
                            }
                        %>
                    </select></div>
                <div class="mb-3">
                    <label for="exampleInputEmail1" class="form-label">Nombre del producto</label>
                    <input type="text" value=<% out.println(item.nombre_producto); %> name="txtNombreProd" class="form-control" id="exampleInputEmail1" aria-describedby="emailHelp">
                </div>
                <div class="mb-3">
                    <label for="exampleInputEmail1" class="form-label">Precio normal</label>
                    <input type="number" value=<% out.println(item.precio_normal); %> name="txtPrecioN" class="form-control" id="exampleInputEmail1" aria-describedby="emailHelp">
                </div>
                <div class="mb-3">
                    <label for="exampleInputEmail1" class="form-label">Ofertado</label>
                    <input type="text" value=<% out.println(item.ofertado); %> name="txtOfertado" class="form-control" id="exampleInputEmail1" aria-describedby="emailHelp">
                </div>
                <div class="mb-3">
                    <label for="exampleInputEmail1" class="form-label">Precio oferta</label>
                    <input type="number" value=<% out.println(item.precio_oferta); %> name="txtPrecioO" class="form-control" id="exampleInputEmail1" aria-describedby="emailHelp">
                </div>
                <div class="mb-3">
                    <label for="exampleInputEmail1" class="form-label">Existencias</label>
                    <input type="number" value=<% out.println(item.existencias); %> name="txtExistencias" class="form-control" id="exampleInputEmail1" aria-describedby="emailHelp">
                </div>
                <div class="mb-3">
                    <label for="exampleInputPassword1" class="form-label">Descripcion</label>
                    <input type="text" value=<% out.println(item.descripcion); %> name="txtDescripcion" class="form-control" id="exampleInputPassword1">
                </div>
                <div class="mb-3">
                    <label for="exampleInputEmail1" class="form-label">Imagen</label>
                    <input type="file" name="file" class="form-control" id="exampleInputEmail1" aria-describedby="emailHelp">
                </div>
                <%
                    out.println("<button type=\"submit\" name=\"btnAction\" value=\"5-" + id + "\" class=\"btn btn-primary\">Actualizar</button>");
                %>
            </form>     
        </div>

        <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.bundle.min.js" integrity="sha384-ka7Sk0Gln4gmtz2MlQnikT1wXgYsOg+OMhuP+IlRH9sENBO0LRn5q+8nbTov4+1p" crossorigin="anonymous"></script>
    </body>
</html>
