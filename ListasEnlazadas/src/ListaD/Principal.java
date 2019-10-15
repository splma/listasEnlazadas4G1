/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ListaD;

public class Principal {

    public static void main(String[] args) {
        ListaD ld = new ListaD();
        ld.agregar(13);
        ld.agregar(15);
        ld.agregar(67);
        ld.agregar(67);
        ld.agregar(67);
        ld.agregar(67);
        System.out.println("Tamaño: " + ld.getTamaño());
       ld.mostrarDI();
        
    }
}
