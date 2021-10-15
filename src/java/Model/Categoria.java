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
public class Categoria {
    public int idcategoria;
    public String nombre_categoria;
    static Conexion oCon;
    public static ArrayList<Categoria> GetAll() throws ClassNotFoundException, InstantiationException, IllegalAccessException, SQLException{
        oCon = new Conexion();
        ResultSet rs = oCon.consultar("*", "categorias");
        ArrayList<Categoria> categorias = new ArrayList<Categoria>();
        while(rs.next()){
            Categoria item = new Categoria();
            item.idcategoria=rs.getInt(1);
            item.nombre_categoria=rs.getString(2);
            categorias.add(item);
        }
        return categorias;
    }
    public static int Add(Categoria item) throws ClassNotFoundException, InstantiationException, IllegalAccessException, SQLException{
        oCon = new Conexion();
        oCon.agregar("insert into categorias(nombre_categoria) values('"+item.nombre_categoria+"');");
        return 1;
    }
}
