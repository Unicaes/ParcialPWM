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
public class Clientes {
    static Conexion ocon;
    public int idcliente;
    public String nombres,apellidos,sexo,direccion,telefono,pais,clave,correo;
    public static ArrayList<Clientes> GetAll() throws ClassNotFoundException, SQLException, InstantiationException, IllegalAccessException{
        ocon = new Conexion();
        ResultSet rs = ocon.consultar("*", "clientes");
        ArrayList<Clientes> clientes = new ArrayList<>();
        while(rs.next()){
            Clientes item = new Clientes();
            item.idcliente=rs.getInt(1);
            item.nombres=rs.getString(2);
            item.apellidos=rs.getString(3);
            item.sexo=rs.getString(4);
            item.telefono=rs.getString(5);
            item.pais=rs.getString(6);
            item.correo=rs.getString(8);
            item.direccion=rs.getString(9);
            clientes.add(item);
        }
        return clientes;
    }
    public static int AddCliente(Clientes item)throws ClassNotFoundException, SQLException, InstantiationException, IllegalAccessException{
        ocon = new Conexion();
        String query = "insert into clientes(nombres,apellidos,sexo,telefono,pais,clave,correo,direccion) values('"+item.nombres+"','"+item.apellidos+"','"+item.sexo+"','"+item.telefono+"','"+item.pais+"','"+item.clave+"','"+item.correo+"','"+item.direccion+"')";
        int resp = ocon.agregar(query);
        return resp;
    }
    public static int RemoveCliente(int id)throws ClassNotFoundException, SQLException, InstantiationException, IllegalAccessException{
        ocon = new Conexion();
        return ocon.eliminar("clientes", "idcliente="+id);
    }
}
