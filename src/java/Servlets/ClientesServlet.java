/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servlets;

import Model.Clientes;
import java.io.IOException;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author bryan
 */
@WebServlet(name = "ClientesServlet", urlPatterns = {"/ClientesServlet"})
public class ClientesServlet extends HttpServlet {

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
            throws ServletException, IOException, ClassNotFoundException, SQLException, InstantiationException, IllegalAccessException {
        response.setContentType("text/html;charset=UTF-8");
        String[] para = request.getParameter("btnAction").split("-");
        int action = Integer.parseInt(para[0]);        
        int id = Integer.parseInt(para[1]);
        switch (action) {
            case 1:
                Clientes item = new Clientes();
                item.nombres=request.getParameter("txtNombres");
                item.apellidos=request.getParameter("txtApellidos");
                item.telefono=request.getParameter("txtTelefono");
                item.clave=request.getParameter("txtClave");
                item.direccion=request.getParameter("txtDireccion");
                item.correo=request.getParameter("txtMail");
                item.sexo=request.getParameter("txtSexo");
                Clientes.AddCliente(item);
                response.sendRedirect("Views/Clientes/CRUDClientes.jsp");
                break;
            case 2:
                Clientes.RemoveCliente(id);
                response.sendRedirect("Views/Clientes/CRUDClientes.jsp");
                break;
            case 3:
                response.sendRedirect("Views/Clientes/ModifyCliente.jsp?id="+id);
                break;
            case 5:
                Clientes item2 = new Clientes();
                item2.nombres=request.getParameter("txtNombres");
                item2.apellidos=request.getParameter("txtApellidos");
                item2.telefono=request.getParameter("txtTelefono");
                item2.clave=request.getParameter("txtClave");
                item2.direccion=request.getParameter("txtDireccion");
                item2.correo=request.getParameter("txtMail");
                item2.sexo=request.getParameter("txtSexo");
                Clientes.update(item2);
                response.sendRedirect("Views/Clientes/CRUDClientes.jsp");
                break;
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
            Logger.getLogger(ClientesServlet.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(ClientesServlet.class.getName()).log(Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            Logger.getLogger(ClientesServlet.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            Logger.getLogger(ClientesServlet.class.getName()).log(Level.SEVERE, null, ex);
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
            Logger.getLogger(ClientesServlet.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(ClientesServlet.class.getName()).log(Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            Logger.getLogger(ClientesServlet.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            Logger.getLogger(ClientesServlet.class.getName()).log(Level.SEVERE, null, ex);
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
