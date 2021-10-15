package org.apache.jsp.Views.Carrito;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class Factura_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE html>\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html lang=\"en\" >\n");
      out.write("<head>\n");
      out.write("  <meta charset=\"UTF-8\">\n");
      out.write("  <title>Factura</title>\n");
      out.write("  <link rel='stylesheet' href='https://cdnjs.cloudflare.com/ajax/libs/twitter-bootstrap/4.1.3/css/bootstrap.min.css'><link rel=\"stylesheet\" href=\"./style.css\">\n");
      out.write("\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("</div><div id=\"app\" class=\"col-11\">\n");
      out.write("\n");
      out.write("    <h2>Factura</h2>\n");
      out.write("\n");
      out.write("    <div class=\"row my-3\">\n");
      out.write("      <div class=\"col-10\">\n");
      out.write("        <h1>Mil Pasos</h1>\n");
      out.write("        <p>Av. Winston Churchill</p>\n");
      out.write("        <p>Plaza Orleans 3er. nivel</p>\n");
      out.write("        <p>local 312</p>\n");
      out.write("      </div>\n");
      out.write("      <div class=\"col-2\">\n");
      out.write("        <img src=\"~/images/Mil-Pasos_Negro.png\" />\n");
      out.write("      </div>\n");
      out.write("    </div>\n");
      out.write("  \n");
      out.write("    <hr />\n");
      out.write("  \n");
      out.write("    <div class=\"row fact-info mt-3\">\n");
      out.write("      <div class=\"col-3\">\n");
      out.write("        <h5>Facturar a</h5>\n");
      out.write("        <p>\n");
      out.write("          silkinharbur7\n");
      out.write("        </p>\n");
      out.write("      </div>\n");
      out.write("      <div class=\"col-3\">\n");
      out.write("        <h5>Enviar a</h5>\n");
      out.write("        <p>\n");
      out.write("          skliport\n");
      out.write("          Santa Fe, #19\n");
      out.write("          aaaaaaaaa@gmail.com\n");
      out.write("        </p>\n");
      out.write("      </div>\n");
      out.write("      <div class=\"col-3\">\n");
      out.write("        <h5>N° de factura</h5>\n");
      out.write("        <h5>Fecha</h5>\n");
      out.write("        <h5>Fecha de vencimiento</h5>\n");
      out.write("      </div>\n");
      out.write("      <div class=\"col-3\">\n");
      out.write("        <h5>103</h5>\n");
      out.write("        <p>09/05/2019</p>\n");
      out.write("        <p>09/05/2019</p>\n");
      out.write("      </div>\n");
      out.write("    </div>\n");
      out.write("  \n");
      out.write("    <div class=\"row my-5\">\n");
      out.write("      <table class=\"table table-borderless factura\">\n");
      out.write("        <thead>\n");
      out.write("          <tr>\n");
      out.write("            <th>Cant.</th>\n");
      out.write("            <th>Descripcion</th>\n");
      out.write("            <th>Precio Unitario</th>\n");
      out.write("            <th>Importe</th>\n");
      out.write("          </tr>\n");
      out.write("        </thead>\n");
      out.write("        <tbody>\n");
      out.write("          <tr>\n");
      out.write("            <td>1</td>\n");
      out.write("            <td>Clases de Cha-Cha-Cha</td>\n");
      out.write("            <td>3,000.00</td>\n");
      out.write("            <td>3,000.00</td>\n");
      out.write("          </tr>\n");
      out.write("          <tr>\n");
      out.write("            <td>3</td>\n");
      out.write("            <td>Clases de Salsa</td>\n");
      out.write("            <td>4,000.00</td>\n");
      out.write("            <td>12,000.00</td>\n");
      out.write("          </tr>\n");
      out.write("        </tbody>\n");
      out.write("        <tfoot>\n");
      out.write("          <tr>\n");
      out.write("            <th></th>\n");
      out.write("            <th></th>\n");
      out.write("            <th>Total Factura</th>\n");
      out.write("            <th>RD$15,000.00</th>\n");
      out.write("          </tr>\n");
      out.write("        </tfoot>\n");
      out.write("      </table>\n");
      out.write("    </div>\n");
      out.write("  \n");
      out.write("    <div class=\"cond row\">\n");
      out.write("      <div class=\"col-12 mt-3\">\n");
      out.write("        <h4>Condiciones y formas de pago</h4>\n");
      out.write("        <p>EEl Pago debe ser procesado pronto</p>\n");
      out.write("        <p>\n");
      out.write("          Banco Banreserva\n");
      out.write("          <br />\n");
      out.write("          IBAN: DO XX 0075 XXXX XX XX XXXX XXXX\n");
      out.write("          <br />\n");
      out.write("          Código SWIFT: PITOCHICOXXXXX\n");
      out.write("        </p>\n");
      out.write("      </div>\n");
      out.write("    </div>\n");
      out.write("</div>\n");
      out.write("  \n");
      out.write("</body>\n");
      out.write("</html>\n");
      out.write("\n");
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
