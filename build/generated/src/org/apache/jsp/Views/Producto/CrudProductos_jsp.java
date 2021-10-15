package org.apache.jsp.Views.Producto;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import Model.Producto;
import Model.Categoria;
import Model.Proveedores;
import java.util.ArrayList;

public final class CrudProductos_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");

    ArrayList<Proveedores> proveedores = Proveedores.GetAll();
    ArrayList<Categoria> categorias = Categoria.GetAll();
    ArrayList<Producto> productos = Producto.GetAll();

      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("        <link href=\"https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css\" rel=\"stylesheet\" integrity=\"sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3\" crossorigin=\"anonymous\">\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <nav class=\"navbar navbar-expand-lg navbar-light bg-light\">\n");
      out.write("            <div class=\"container-fluid\">\n");
      out.write("                <a class=\"navbar-brand\" href=\"#\"> JSP</a>\n");
      out.write("                <button class=\"navbar-toggler\" type=\"button\" data-bs-toggle=\"collapse\" data-bs-target=\"#navbarSupportedContent\" aria-controls=\"navbarSupportedContent\" aria-expanded=\"false\" aria-label=\"Toggle navigation\">\n");
      out.write("                    <span class=\"navbar-toggler-icon\"></span>\n");
      out.write("                </button>\n");
      out.write("                <div class=\"collapse navbar-collapse\" id=\"navbarSupportedContent\">\n");
      out.write("                    <ul class=\"navbar-nav me-auto mb-2 mb-lg-0\">\n");
      out.write("                        <li class=\"nav-item\">\n");
      out.write("                            <a href=\"/Parcial/Views/index.jsp\" class=\"nav-link active\" aria-current=\"page\" href=\"#\">Inicio</a>\n");
      out.write("                        </li>\n");
      out.write("                        <li class=\"nav-item\">\n");
      out.write("                            <a href=\"/Parcial/Views/Clientes/CRUDClientes.jsp\" class=\"nav-link\" href=\"#\">Clientes</a>\n");
      out.write("                        </li>\n");
      out.write("                        <li class=\"nav-item\">\n");
      out.write("                            <a href=\"/Parcial/Views/Producto/CrudProductos.jsp\" class=\"nav-link\">Productos</a>\n");
      out.write("                        </li>\n");
      out.write("                        <li class=\"nav-item\">\n");
      out.write("                            <a href=\"/Parcial/Views/Carrito/ListCarrito.jsp\" class=\"nav-link btn btn-primary text-white\">Carrito</a>\n");
      out.write("                        </li>\n");
      out.write("                    </ul>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </nav>\n");
      out.write("        <div class=\"container\">\n");
      out.write("            <h1>Productos</h1>\n");
      out.write("            <form action=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/CRUDProductos\" enctype=\"multipart/form-data\" method=\"POST\">\n");
      out.write("                <div class=\"mb-3\">\n");
      out.write("                    <label for=\"exampleInputEmail1\" class=\"form-label\">Categoria</label>\n");
      out.write("                    <select class=\"form-select\" name=\"txtCategoria\">\n");
      out.write("                        ");

                            for (int i = 0; i < categorias.size(); i++) {
                                out.println("<option value=\"" + categorias.get(i).idcategoria + "\">" + categorias.get(i).nombre_categoria + "</option>");
                            }
                        
      out.write("\n");
      out.write("                    </select>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"mb-3\">\n");
      out.write("                    <label for=\"exampleInputEmail1\" class=\"form-label\">Proveedor</label>\n");
      out.write("                    <select class=\"form-select\" name=\"txtProveedor\">\n");
      out.write("                        ");

                            for (int i = 0; i < proveedores.size(); i++) {
                                out.println("<option value=\"" + proveedores.get(i).idproveedor + "\">" + proveedores.get(i).nombre_proveedor + "</option>");
                            }
                        
      out.write("\n");
      out.write("                    </select></div>\n");
      out.write("                <div class=\"mb-3\">\n");
      out.write("                    <label for=\"exampleInputEmail1\" class=\"form-label\">Nombre del producto</label>\n");
      out.write("                    <input type=\"text\" name=\"txtNombreProd\" class=\"form-control\" id=\"exampleInputEmail1\" aria-describedby=\"emailHelp\">\n");
      out.write("                </div>\n");
      out.write("                <div class=\"mb-3\">\n");
      out.write("                    <label for=\"exampleInputEmail1\" class=\"form-label\">Precio normal</label>\n");
      out.write("                    <input type=\"number\" name=\"txtPrecioN\" class=\"form-control\" id=\"exampleInputEmail1\" aria-describedby=\"emailHelp\">\n");
      out.write("                </div>\n");
      out.write("                <div class=\"mb-3\">\n");
      out.write("                    <label for=\"exampleInputEmail1\" class=\"form-label\">Ofertado</label>\n");
      out.write("                    <input type=\"text\" name=\"txtOfertado\" class=\"form-control\" id=\"exampleInputEmail1\" aria-describedby=\"emailHelp\">\n");
      out.write("                </div>\n");
      out.write("                <div class=\"mb-3\">\n");
      out.write("                    <label for=\"exampleInputEmail1\" class=\"form-label\">Precio oferta</label>\n");
      out.write("                    <input type=\"number\" name=\"txtPrecioO\" class=\"form-control\" id=\"exampleInputEmail1\" aria-describedby=\"emailHelp\">\n");
      out.write("                </div>\n");
      out.write("                <div class=\"mb-3\">\n");
      out.write("                    <label for=\"exampleInputEmail1\" class=\"form-label\">Existencias</label>\n");
      out.write("                    <input type=\"number\" name=\"txtExistencias\" class=\"form-control\" id=\"exampleInputEmail1\" aria-describedby=\"emailHelp\">\n");
      out.write("                </div>\n");
      out.write("                <div class=\"mb-3\">\n");
      out.write("                    <label for=\"exampleInputPassword1\" class=\"form-label\">Descripcion</label>\n");
      out.write("                    <input type=\"text\" name=\"txtDescripcion\" class=\"form-control\" id=\"exampleInputPassword1\">\n");
      out.write("                </div>\n");
      out.write("                <div class=\"mb-3\">\n");
      out.write("                    <label for=\"exampleInputEmail1\" class=\"form-label\">Imagen</label>\n");
      out.write("                    <input type=\"file\" name=\"file\" class=\"form-control\" id=\"exampleInputEmail1\" aria-describedby=\"emailHelp\">\n");
      out.write("                </div>\n");
      out.write("                <button type=\"submit\"  name=\"btnAction\" value=\"1-0\" class=\"btn btn-primary\">Registrar</button>\n");
      out.write("            </form>   \n");
      out.write("            <form action=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/CRUDProductos\" method=\"POST\">\n");
      out.write("                <table class=\"table\">\n");
      out.write("                    <thead>\n");
      out.write("                        <tr>\n");
      out.write("                            <th>Nombre Producto</th>\n");
      out.write("                            <th>Precio Normal</th>\n");
      out.write("                            <th>Ofertado</th>\n");
      out.write("                            <th>Existencias</th>\n");
      out.write("                            <th>Descripcion</th>\n");
      out.write("                            <th></th>\n");
      out.write("                            <th></th>\n");
      out.write("                        </tr>\n");
      out.write("                    </thead>\n");
      out.write("                    <tbody>\n");
      out.write("                        ");

                            for (int i = 0; i < productos.size(); i++) {
                                out.println("<tr>");
                                out.println("<td>" + productos.get(i).nombre_producto + "</td>");
                                out.println("<td>" + productos.get(i).precio_normal + "</td>");
                                out.println("<td>" + productos.get(i).ofertado + "</td>");
                                out.println("<td>" + productos.get(i).precio_oferta + "</td>");
                                out.println("<td>" + productos.get(i).descripcion + "</td>");
                                out.println("<td>");
                                out.println("<button type=\"submit\" name=\"btnAction\" value=\"2-" + productos.get(i).idproducto + "\" class=\"btn btn-danger\">Eliminar</button>");
                                out.println("<button type=\"submit\" name=\"btnAction\" value=\"3-" + productos.get(i).idproducto + "\" class=\"btn btn-info\">Editar</button>");
                                out.println("</td>");
                                out.println("</tr>");
                            }
                        
      out.write("\n");
      out.write("                    </tbody>\n");
      out.write("                </table>\n");
      out.write("            </form>\n");
      out.write("        </div>\n");
      out.write("        <script src=\"https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.bundle.min.js\" integrity=\"sha384-ka7Sk0Gln4gmtz2MlQnikT1wXgYsOg+OMhuP+IlRH9sENBO0LRn5q+8nbTov4+1p\" crossorigin=\"anonymous\"></script>\n");
      out.write("    </body>\n");
      out.write("</html>\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
