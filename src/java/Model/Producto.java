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

    public int idproducto, idcategoria, idproveedor, ofertado, existencias, cantCarrito;
    public String nombre_producto, imagen, descripcion,categoria;
    public double precio_normal, precio_oferta;
    static Conexion oCon;

    public static ArrayList<Producto> GetAll() throws ClassNotFoundException, InstantiationException, IllegalAccessException, SQLException {
        oCon = new Conexion();
        ArrayList<Producto> productos = new ArrayList<>();
        ResultSet rs = oCon.consultar("idproducto,productos.idcategoria,idproveedor,nombre_producto,precio_normal,ofertado,precio_oferta,existencias,descripcion,imagen,categorias.nombre_categoria", "productos inner join categorias on categorias.idcategoria=productos.idcategoria");
        while (rs.next()) {
            Producto item = new Producto();
            item.idproducto = rs.getInt(1);
            item.idcategoria = rs.getInt(2);
            item.idproveedor = rs.getInt(3);
            item.nombre_producto = rs.getString(4);
            item.precio_normal = rs.getDouble(5);
            item.ofertado = rs.getInt(6);
            item.precio_oferta = rs.getDouble(7);
            item.existencias = rs.getInt(8);
            item.descripcion = rs.getString(9);
            item.imagen = rs.getString(10);
            item.categoria = rs.getString(11);
            productos.add(item);
        }
        return productos;
    }

    public static Producto GetById(int id) throws ClassNotFoundException, InstantiationException, IllegalAccessException, SQLException {
        oCon = new Conexion();
        ResultSet rs = oCon.consultar("idproducto,productos.idcategoria,idproveedor,nombre_producto,precio_normal,ofertado,precio_oferta,existencias,descripcion,imagen,categorias.nombre_categoria", "productos inner join categorias on categorias.idcategoria=productos.idcategoria", "idproducto=" + id);
        Producto item = new Producto();
        while (rs.next()) {
            item.idproducto = rs.getInt(1);
            item.idcategoria = rs.getInt(2);
            item.idproveedor = rs.getInt(3);
            item.nombre_producto = rs.getString(4);
            item.precio_normal = rs.getDouble(5);
            item.ofertado = rs.getInt(6);
            item.precio_oferta = rs.getDouble(7);
            item.existencias = rs.getInt(8);
            item.descripcion = rs.getString(9);
            item.imagen = rs.getString(10);
            item.categoria = rs.getString(11);
        }
        return item;
    }

    public static int Insert(Producto item) throws ClassNotFoundException, InstantiationException, IllegalAccessException, SQLException {
        oCon = new Conexion();
        int resp = oCon.agregar("Insert into productos(idcategoria,idproveedor ,nombre_producto,precio_normal,ofertado,precio_oferta,existencias,descripcion,imagen)"
                + "values('" + item.idcategoria + "','" + item.idproveedor + "','" + item.nombre_producto + "','" + item.precio_normal + "','" + item.ofertado + "','" + item.precio_oferta + "','" + item.existencias + "','" + item.descripcion + "','" + item.imagen + "')");
        return resp;
    }

    public static int remove(int id) throws ClassNotFoundException, InstantiationException, IllegalAccessException, SQLException {
        oCon = new Conexion();
        return oCon.eliminar("productos", "idproducto=" + id);
    }

    public static int update(Producto item) throws ClassNotFoundException, InstantiationException, IllegalAccessException, SQLException {
        oCon = new Conexion();
        String query = "update productos set idcategoria=" + item.idcategoria + ",idproveedor=" + item.idproveedor + ",nombre_producto='"+item.nombre_producto + "',precio_normal=" + item.precio_normal + ",ofertado=" + item.ofertado + ",precio_oferta=" + item.precio_oferta + ",existencias=" + item.existencias + ",descripcion='" + item.descripcion + "',imagen='" + item.imagen + "' where idproducto=" + item.idproducto + ";";
        oCon.DoQuery2(query);
        return 1;
    }
}
