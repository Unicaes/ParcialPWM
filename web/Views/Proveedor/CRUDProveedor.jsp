<%@page import="Model.Producto"%>
<%@page import="Model.Categoria"%>
<%@page import="Model.Proveedores"%>
<%@page import="java.util.ArrayList"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%
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
            <h1>Proveedores</h1>
            <form action="${pageContext.request.contextPath}/ProveedorServlet" method="POST">
                <div class="mb-3">
                    <label for="exampleInputEmail1" class="form-label">Nombre del Proveedor</label>
                    <input type="text" name="txtNombreProv" class="form-control" id="exampleInputEmail1" aria-describedby="emailHelp">
                </div>
                <div class="mb-3">
                    <label for="exampleInputEmail1" class="form-label">Telefono</label>
                    <input type="number" name="txtMobile" class="form-control" id="exampleInputEmail1" aria-describedby="emailHelp">
                </div>
                <div class="mb-3">
                    <label for="exampleInputEmail1" class="form-label">contacto</label>
                    <input type="text" name="txtContact" class="form-control" id="exampleInputEmail1" aria-describedby="emailHelp">
                </div>
                <button type="submit"  name="btnAction" value="1" class="btn btn-primary">Registrar</button>
            </form>   
     
        </div>
        <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.bundle.min.js" integrity="sha384-ka7Sk0Gln4gmtz2MlQnikT1wXgYsOg+OMhuP+IlRH9sENBO0LRn5q+8nbTov4+1p" crossorigin="anonymous"></script>
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.bundle.min.js" integrity="sha384-ka7Sk0Gln4gmtz2MlQnikT1wXgYsOg+OMhuP+IlRH9sENBO0LRn5q+8nbTov4+1p" crossorigin="anonymous"></script>
    </body>
</html>