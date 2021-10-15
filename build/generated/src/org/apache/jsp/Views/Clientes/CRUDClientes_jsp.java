package org.apache.jsp.Views.Clientes;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import Model.Clientes;
import java.util.ArrayList;

public final class CRUDClientes_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
 ArrayList<Clientes> clientes = Clientes.GetAll(); 
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("    <head>\r\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\r\n");
      out.write("        <title>JSP Page</title>\r\n");
      out.write("        <link href=\"https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css\" rel=\"stylesheet\" integrity=\"sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3\" crossorigin=\"anonymous\">\r\n");
      out.write("    </head>\r\n");
      out.write("    <body>\r\n");
      out.write("        <nav class=\"navbar navbar-expand-lg navbar-light bg-light\">\r\n");
      out.write("            <div class=\"container-fluid\">\r\n");
      out.write("                <a class=\"navbar-brand\" href=\"#\"> JSP</a>\r\n");
      out.write("                <button class=\"navbar-toggler\" type=\"button\" data-bs-toggle=\"collapse\" data-bs-target=\"#navbarSupportedContent\" aria-controls=\"navbarSupportedContent\" aria-expanded=\"false\" aria-label=\"Toggle navigation\">\r\n");
      out.write("                    <span class=\"navbar-toggler-icon\"></span>\r\n");
      out.write("                </button>\r\n");
      out.write("                <div class=\"collapse navbar-collapse\" id=\"navbarSupportedContent\">\r\n");
      out.write("                    <ul class=\"navbar-nav me-auto mb-2 mb-lg-0\">\r\n");
      out.write("                        <li class=\"nav-item\">\r\n");
      out.write("                            <a href=\"/Parcial/Views/index.jsp\" class=\"nav-link active\" aria-current=\"page\" href=\"#\">Inicio</a>\r\n");
      out.write("                        </li>\r\n");
      out.write("                        <li class=\"nav-item\">\r\n");
      out.write("                            <a href=\"/Parcial/Views/Clientes/CRUDClientes.jsp\" class=\"nav-link\" href=\"#\">Clientes</a>\r\n");
      out.write("                        </li>\r\n");
      out.write("                        <li class=\"nav-item\">\r\n");
      out.write("                            <a href=\"/Parcial/Views/Producto/CrudProductos.jsp\" class=\"nav-link\">Productos</a>\r\n");
      out.write("                        </li>\r\n");
      out.write("                        <li class=\"nav-item\">\r\n");
      out.write("                            <a href=\"/Parcial/Views/Categoria/CRUDCategoria.jsp\" class=\"nav-link\">Categoria</a>\r\n");
      out.write("                        </li>\r\n");
      out.write("                        <li class=\"nav-item\">\r\n");
      out.write("                            <a href=\"/Parcial/Views/Proveedor/CRUDProveedor.jsp\" class=\"nav-link\">Proveedores</a>\r\n");
      out.write("                        </li>\r\n");
      out.write("                        <li class=\"nav-item\">\r\n");
      out.write("                            <a href=\"/Parcial/Views/Carrito/ListCarrito.jsp\" class=\"nav-link btn btn-primary text-white\">Carrito</a>\r\n");
      out.write("                        </li>\r\n");
      out.write("                    </ul>\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("        </nav>\r\n");
      out.write("        <div class=\"container\">\r\n");
      out.write("            <h1>Clientes</h1>\r\n");
      out.write("            <form action=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/ClientesServlet\" method=\"POST\">\r\n");
      out.write("                <div class=\"mb-3\">\r\n");
      out.write("                    <label for=\"exampleInputEmail1\" class=\"form-label\">Nombres</label>\r\n");
      out.write("                    <input type=\"text\" name=\"txtNombres\" class=\"form-control\" id=\"exampleInputEmail1\" aria-describedby=\"emailHelp\">\r\n");
      out.write("                </div>\r\n");
      out.write("                <div class=\"mb-3\">\r\n");
      out.write("                    <label for=\"exampleInputEmail1\" class=\"form-label\">Apellidos</label>\r\n");
      out.write("                    <input type=\"text\" name=\"txtApellidos\" class=\"form-control\" id=\"exampleInputEmail1\" aria-describedby=\"emailHelp\">\r\n");
      out.write("                </div>\r\n");
      out.write("                <div class=\"mb-3\">\r\n");
      out.write("                    <label for=\"exampleInputEmail1\" class=\"form-label\">Direccion</label>\r\n");
      out.write("                    <input type=\"text\" name=\"txtDireccion\" class=\"form-control\" id=\"exampleInputEmail1\" aria-describedby=\"emailHelp\">\r\n");
      out.write("                </div>\r\n");
      out.write("                <div class=\"mb-3\">\r\n");
      out.write("                    <label for=\"exampleInputEmail1\" class=\"form-label\">Telefono</label>\r\n");
      out.write("                    <input type=\"text\" name=\"txtTelefono\" class=\"form-control\" id=\"exampleInputEmail1\" aria-describedby=\"emailHelp\">\r\n");
      out.write("                </div>\r\n");
      out.write("                <div class=\"mb-3\">\r\n");
      out.write("                    <label for=\"exampleInputEmail1\" class=\"form-label\">Sexo</label>\r\n");
      out.write("                    <select name=\"txtSexo\">\r\n");
      out.write("                        <option value=\"M\">Masculino</option>\r\n");
      out.write("                        <option value=\"F\">Femenino</option>\r\n");
      out.write("                    </select>\r\n");
      out.write("                </div>\r\n");
      out.write("                <div class=\"mb-3\">\r\n");
      out.write("                    <label for=\"exampleInputPassword1\" class=\"form-label\">Clave</label>\r\n");
      out.write("                    <input type=\"password\" name=\"txtClave\" class=\"form-control\" id=\"exampleInputPassword1\">\r\n");
      out.write("                </div>\r\n");
      out.write("                <div class=\"mb-3\">\r\n");
      out.write("                    <label for=\"exampleInputEmail1\" class=\"form-label\">Correo</label>\r\n");
      out.write("                    <input type=\"email\" name=\"txtMail\" class=\"form-control\" id=\"exampleInputEmail1\" aria-describedby=\"emailHelp\">\r\n");
      out.write("                    <div id=\"emailHelp\" class=\"form-text\">We'll never share your email with anyone else.</div>\r\n");
      out.write("                </div>\r\n");
      out.write("                <button type=\"submit\"  name=\"btnAction\" value=\"1-0\" class=\"btn btn-primary\">Registrar</button>\r\n");
      out.write("            </form>   \r\n");
      out.write("            <form action=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/ClientesServlet\" method=\"POST\">\r\n");
      out.write("                <table class=\"table\">\r\n");
      out.write("                    <thead>\r\n");
      out.write("                        <tr>\r\n");
      out.write("                            <th>Nombres</th>\r\n");
      out.write("                            <th>Apellidos</th>\r\n");
      out.write("                            <th>Direccion</th>\r\n");
      out.write("                            <th>Telefono</th>\r\n");
      out.write("                            <th>Sexo</th>\r\n");
      out.write("                            <th>Correo</th>\r\n");
      out.write("                        </tr>\r\n");
      out.write("                    </thead>\r\n");
      out.write("                    <tbody>\r\n");
      out.write("                        ");

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
                        
      out.write("\r\n");
      out.write("                    </tbody>\r\n");
      out.write("                </table>\r\n");
      out.write("            </form>\r\n");
      out.write("        </div>\r\n");
      out.write("        <script src=\"https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.bundle.min.js\" integrity=\"sha384-ka7Sk0Gln4gmtz2MlQnikT1wXgYsOg+OMhuP+IlRH9sENBO0LRn5q+8nbTov4+1p\" crossorigin=\"anonymous\"></script>\r\n");
      out.write("    </body>\r\n");
      out.write("</html>\r\n");
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
