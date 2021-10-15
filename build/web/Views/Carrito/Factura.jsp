<%-- 
    Document   : Factura.jsp
    Created on : Oct 15, 2021, 3:56:07 PM
    Author     : bryan
--%>

<%@page import="Model.Clientes"%>
<%@page import="Model.clsCarrito"%>
<%@page import="java.util.Map"%>
<%@page import="Model.Producto"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%
Map<Integer, Producto> productos = clsCarrito.GetInstance().carrito;
    double subtotal=0;
    Clientes item = Clientes.item;
%>
<!DOCTYPE html>

<!DOCTYPE html>
<html lang="en" >
<head>
  <meta charset="UTF-8">
  <title>Factura</title>
  <link rel='stylesheet' href='https://cdnjs.cloudflare.com/ajax/libs/twitter-bootstrap/4.1.3/css/bootstrap.min.css'><link rel="stylesheet" href="./style.css">
</head>
<body>
</div><div id="app" class="col-11">

    <h2>Factura</h2>

    <div class="row my-3">
      <div class="col-10">
        <h1>Mil Pasos</h1>
        <p>Av. Winston Churchill</p>
        <p>Plaza Orleans 3er. nivel</p>
        <p>local 312</p>
      </div>
      <div class="col-2">
        <img src="~/images/Mil-Pasos_Negro.png" />
      </div>
    </div>
  
    <hr />
  
    <div class="row fact-info mt-3">
      <div class="col-3">
        <h5>Facturar a</h5>
        <p>
          Bryan Palma
        </p>
      </div>
      <div class="col-3">
        <h5>Enviar a</h5>
        <p>
          René Francisco
          Santa Fe, #19
          aaaaaaaaa@gmail.com
        </p>
      </div>
      <div class="col-3">
        <h5>N° de factura</h5>
        <h5>Fecha</h5>
        <h5>Fecha de vencimiento</h5>
      </div>
      <div class="col-3">
        <h5>103</h5>
        <p>09/05/2019</p>
        <p>09/05/2019</p>
      </div>
    </div>
  
    <div class="row my-5">
      <table class="table table-borderless factura">
        <thead>
          <tr>
            <th>Cant.</th>
            <th>Descripcion</th>
            <th>Precio Unitario</th>
            <th>Importe</th>
          </tr>
        </thead>
        <tbody>
            <%
            for (Map.Entry<Integer, Producto> entry : productos.entrySet()) {
                                    out.println("<tr>");
                                    out.println("<td>");
                                    out.println(entry.getValue().cantCarrito);
                                    out.println("</td>");
                                    out.println("<td>");
                                    out.println(entry.getValue().descripcion);
                                    out.println("</td>");
                                    out.println("<td>");
                                    out.println(entry.getValue().precio_normal);
                                    out.println("</td>");
                                    out.println("<td>");
                                    out.println(entry.getValue().precio_normal*1.13);
                                    out.println("</td>");
                                    out.println("</tr>");
                                    subtotal+=(entry.getValue().existencias*entry.getValue().precio_normal);
            subtotal+=(entry.getValue().existencias*entry.getValue().precio_normal*1.13);                    
            }
            %>
          
        </tbody>
        <tfoot>
          <tr>
            <th></th>
            <th></th>
            <th>Total Factura</th>
            <th>$<% out.print(subtotal); %></th>
          </tr>
        </tfoot>
      </table>
    </div>
  
    <div class="cond row">
      <div class="col-12 mt-3">
        <h4>Condiciones y formas de pago</h4>
        <p>EEl Pago debe ser procesado pronto</p>
        <p>
          Banco Banreserva
          <br />
          IBAN: DO XX 0075 XXXX XX XX XXXX XXXX
          <br />
          Código SWIFT: PITOCHICOXXXXX
        </p>
      </div>
    </div>
</div>
  
</body>
</html>

