/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servlets;

import Model.Producto;
import java.io.IOException;
import java.io.InputStream;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.Part;
import org.apache.tomcat.util.codec.binary.Base64;

/**
 *
 * @author bryan
 */
@WebServlet(name = "CRUDProductos", urlPatterns = {"/CRUDProductos"})
@MultipartConfig(fileSizeThreshold = 1024 * 1024 * 2, maxFileSize = 1024 * 1024 * 10, maxRequestSize = 1024 * 1024 * 50)
public class CRUDProductos extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException, ClassNotFoundException, InstantiationException, IllegalAccessException, SQLException {
        response.setContentType("text/html;charset=UTF-8");
        String[] values = request.getParameter("btnAction").split("-");
        int action = Integer.parseInt(values[0]);
        int id = Integer.parseInt(values[1]);
        switch (action) {
            case 1:
                Part fileImage = request.getPart("file");
                String name = fileImage.getName();
                InputStream fileContent = fileImage.getInputStream();
                byte[] imageBytes = new byte[(int) fileImage.getSize()];
                fileContent.read(imageBytes, 0, imageBytes.length);
                fileContent.close();
                String imageStr = Base64.encodeBase64String(imageBytes);
                Producto item = new Producto();
                item.imagen = imageStr;
                item.idcategoria = Integer.parseInt(request.getParameter("txtCategoria"));
                item.idproveedor = Integer.parseInt(request.getParameter("txtProveedor"));
                item.descripcion = request.getParameter("txtDescripcion");
                item.nombre_producto = request.getParameter("txtNombreProd");
                item.precio_normal = Double.parseDouble(request.getParameter("txtPrecioN"));
                item.ofertado = Integer.parseInt(request.getParameter("txtOfertado"));
                item.precio_oferta = Double.parseDouble(request.getParameter("txtPrecioO"));
                item.existencias = Integer.parseInt(request.getParameter("txtExistencias"));
                Producto.Insert(item);
                response.sendRedirect("/Parcial/Views/index.jsp");
                break;
            case 2:
                Producto.remove(id);
                response.sendRedirect("/Parcial/Views/Producto/CrudProductos.jsp");
                break;
            case 3:
                response.sendRedirect("/Parcial/Views/Producto/ModifyProduct.jsp?id="+id);
                break;
            case 5:
                Part fileImage2 = request.getPart("file");
                String name2 = fileImage2.getName();
                InputStream fileContent2 = fileImage2.getInputStream();
                byte[] imageBytes2 = new byte[(int) fileImage2.getSize()];
                fileContent2.read(imageBytes2, 0, imageBytes2.length);
                fileContent2.close();
                String imageStr2 = Base64.encodeBase64String(imageBytes2);
                Producto item2 = new Producto();
                item2.idproducto=id;
                item2.imagen = imageStr2;
                item2.idcategoria = Integer.parseInt(request.getParameter("txtCategoria"));
                item2.idproveedor = Integer.parseInt(request.getParameter("txtProveedor"));
                item2.descripcion = request.getParameter("txtDescripcion");
                item2.nombre_producto = request.getParameter("txtNombreProd");
                item2.precio_normal = Double.parseDouble(request.getParameter("txtPrecioN"));
                item2.ofertado = Integer.parseInt(request.getParameter("txtOfertado"));
                item2.precio_oferta = Double.parseDouble(request.getParameter("txtPrecioO"));
                item2.existencias = Integer.parseInt(request.getParameter("txtExistencias"));
                Producto.update(item2);
                response.sendRedirect("/Parcial/Views/Producto/CrudProductos.jsp");
                break;
            default:
                throw new AssertionError();
        }

    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        try {
            processRequest(request, response);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(CRUDProductos.class.getName()).log(Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            Logger.getLogger(CRUDProductos.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            Logger.getLogger(CRUDProductos.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(CRUDProductos.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        try {
            processRequest(request, response);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(CRUDProductos.class.getName()).log(Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            Logger.getLogger(CRUDProductos.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            Logger.getLogger(CRUDProductos.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(CRUDProductos.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
