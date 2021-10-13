/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

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
        }
        return current;
    }
    public Map<String,Integer> carrito;
    public static void AddElement(Producto item){
        if (clsCarrito.GetInstance().carrito.containsKey(item.nombre_producto)) {
            clsCarrito.GetInstance().carrito.put(item.nombre_producto, clsCarrito.GetInstance().carrito.get(item.nombre_producto)+1);
            return;
        }
        clsCarrito.GetInstance().carrito.put(item.nombre_producto, item.existencias);
    }
    public static void RemoveElement(Producto item){
        if (clsCarrito.GetInstance().carrito.containsKey(item.nombre_producto)) {
            clsCarrito.GetInstance().carrito.put(item.nombre_producto, clsCarrito.GetInstance().carrito.get(item.nombre_producto)-1);
            if (clsCarrito.GetInstance().carrito.get(item.nombre_producto)<=0) {
                clsCarrito.GetInstance().carrito.remove(item.nombre_producto);
            }
        }
    }
}
