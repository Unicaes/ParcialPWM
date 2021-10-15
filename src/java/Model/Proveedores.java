/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author bryan
 */
public class Proveedores {
    public int idproveedor;
    public String nombre_proveedor,telefono,contacto;
    static Conexion oConn;
    public static ArrayList<Proveedores> GetAll() throws ClassNotFoundException, InstantiationException, IllegalAccessException, SQLException{
        oConn = new Conexion();
        ResultSet rs = oConn.consultar("*", "proveedores");
        ArrayList<Proveedores> proveedores = new ArrayList<>();
        while(rs.next()){
            Proveedores item = new Proveedores();
            item.idproveedor=rs.getInt(1);
            item.nombre_proveedor=rs.getString(2);
            item.telefono=rs.getString(3);
            item.contacto=rs.getString(4);
            proveedores.add(item);
        }
        return proveedores;
    }
    public static int Agregar(Proveedores item) throws ClassNotFoundException, InstantiationException, IllegalAccessException, SQLException{
        oConn = new Conexion();
        oConn.agregar("insert into proveedores(nombre_proveedor,telefono,contacto) values('"+item.nombre_proveedor+"','"+item.telefono+"','"+item.contacto+"');");
        return 1;
    }
}
