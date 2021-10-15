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
public class Producto {
    public int idproducto,idcategoria,idproveedor,ofertado,existencias;
    public String nombre_producto,imagen,descripcion;
    public double precio_normal,precio_oferta;
    static Conexion oCon;
    public static ArrayList<Producto> GetAll() throws ClassNotFoundException, InstantiationException, IllegalAccessException, SQLException{
        oCon=new Conexion();
        ArrayList<Producto> productos = new ArrayList<>();
        ResultSet rs = oCon.consultar("*", "productos");
        while(rs.next()){
            Producto item = new Producto();
            item.idproducto=rs.getInt(1);
            item.idcategoria=rs.getInt(2);
            item.idproveedor=rs.getInt(3);
            item.nombre_producto=rs.getString(4);
            item.precio_normal=rs.getDouble(5);
            item.ofertado=rs.getInt(6);
            item.precio_oferta=rs.getDouble(7);
            item.existencias=rs.getInt(8);
            item.descripcion=rs.getString(9);
            item.imagen=rs.getString(10);
            productos.add(item);
        }
        return productos;
    }
    public static Producto GetById(int id) throws ClassNotFoundException, InstantiationException, IllegalAccessException, SQLException{
        oCon = new Conexion();
        ResultSet rs =oCon.consultar("*", "productos", "idproducto="+id);
        Producto item = new Producto();
        while(rs.next()){
            item.idproducto=rs.getInt(1);
            item.idcategoria=rs.getInt(2);
            item.idproveedor=rs.getInt(3);
            item.nombre_producto=rs.getString(4);
            item.precio_normal=rs.getDouble(5);
            item.ofertado=rs.getInt(6);
            item.precio_oferta=rs.getDouble(7);
            item.existencias=rs.getInt(8);
            item.descripcion=rs.getString(9);
            item.imagen=rs.getString(10);
        }
        return item;
    }
    public static int Insert(Producto item) throws ClassNotFoundException, InstantiationException, IllegalAccessException, SQLException{
        oCon = new Conexion();
        int resp = oCon.agregar("Insert into productos(idcategoria,idproveedor ,nombre_producto,precio_normal,ofertado,precio_oferta,existencias,descripcion,imagen)"
                + "values('"+item.idcategoria+"','"+item.idproveedor+"','"+item.nombre_producto+"','"+item.precio_normal+"','"+item.ofertado+"','"+item.precio_oferta+"','"+item.existencias+"','"+item.descripcion+"','"+item.imagen+"')");
        return resp;
    }
    public static int remove(int id) throws ClassNotFoundException, InstantiationException, IllegalAccessException, SQLException{
        oCon = new Conexion();
        return oCon.eliminar("productos", "idproducto="+id);
    }
}
