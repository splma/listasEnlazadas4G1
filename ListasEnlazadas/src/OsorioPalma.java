/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Folio
 */
public class OsorioPalma {

    public static void main(String[] args) {
                
    }
}

class Producto {

    public Producto(int cantidad, double precio) {
        this.cantidad = cantidad;
        this.precio = precio;
    }

    String nombre = "";
    int cantidad = 0;
    double precio = 0;

    double subtotal() {
        return cantidad * precio;
    }

}
