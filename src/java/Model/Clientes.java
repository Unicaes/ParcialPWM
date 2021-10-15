/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import static Model.Producto.oCon;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author bryan
 */
public class Clientes {
    static Conexion ocon;
    public static Clientes item;
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
    public static Clientes GetById(int id) throws ClassNotFoundException, InstantiationException, IllegalAccessException, SQLException {
        oCon = new Conexion();
        ResultSet rs = oCon.consultar("*", "clientes", "idcliente=" + id);
        Clientes item = new Clientes();
        while (rs.next()) {
            item.idcliente=rs.getInt(1);
            item.nombres=rs.getString(2);
            item.apellidos=rs.getString(3);
            item.sexo=rs.getString(4);
            item.telefono=rs.getString(5);
            item.pais=rs.getString(6);
            item.correo=rs.getString(8);
            item.direccion=rs.getString(9);
        }
        return item;
    }
    public static void update(Clientes item) throws ClassNotFoundException, InstantiationException, IllegalAccessException, SQLException{
        oCon = new Conexion();
        String query = "update clientes set nombres='"+item.nombres+"',apellidos='"+item.apellidos+"',sexo='"+item.sexo+"',telefono='"+item.telefono+"',pais='"+item.pais+"',clave='"+item.clave+"',correo='"+item.correo+"',direccion='"+item.direccion+"' where idcliente="+item.idcliente;
        oCon.DoQuery2(query);
    }
    public static boolean Login(String correo,String clave) throws ClassNotFoundException, InstantiationException, IllegalAccessException, SQLException{
        oCon = new Conexion();
        String query = "select * from clientes where correo='"+correo+"' and clave='"+clave+"';";
        ResultSet rs = oCon.DoQuery(query);
        rs.last();
        int fila = rs.getRow();
        if (fila<=0) {
            return false;
        }
        rs.first();
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
            Clientes.item=item;
        }
        return true;
    }
}