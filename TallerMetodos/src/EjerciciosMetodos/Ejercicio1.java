/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EjerciciosMetodos;

/**
 *
 * @author Usuario
 */
public class Ejercicio1 {
    public static void main(String[] args) {
        double precioOriginal = 300;
        double descuento = 20;

        double descuentoAplicado = precioOriginal * (descuento / 100);

        double precioFinal = precioOriginal - descuentoAplicado;
        
        System.out.println("El precio final con descuento es: " + precioFinal);
    }
}

