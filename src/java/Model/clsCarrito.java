/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.util.AbstractMap;
import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author bryan
 */
public class clsCarrito {
    private static clsCarrito current;
    public static clsCarrito GetInstance(){
        if (current==null) {
            current=new clsCarrito();
            current.carrito = new HashMap<Integer,Producto>();
        }
        return current;
    }
    public Map<Integer,Producto> carrito;
    public static void AddElement(Producto item){
        clsCarrito.GetInstance();
        if (clsCarrito.GetInstance().carrito.containsKey(item.idproducto)) {
            item = clsCarrito.GetInstance().carrito.get(item.idproducto);
            item.existencias++;
            clsCarrito.GetInstance().carrito.put(item.idproducto, item);
            return;
        }
        clsCarrito.GetInstance().carrito.put(item.idproducto, item);
    }
    public static void RemoveElement(Producto item){
        clsCarrito.GetInstance();
        if (clsCarrito.GetInstance().carrito.containsKey(item.idproducto)) {
            item = clsCarrito.GetInstance().carrito.get(item.idproducto);
            item.existencias--;
            clsCarrito.GetInstance().carrito.put(item.idproducto, item);
            if (clsCarrito.GetInstance().carrito.get(item.idproducto).existencias<=0) {
                clsCarrito.GetInstance().carrito.remove(item.idproducto);
            }
        }
    }
}
