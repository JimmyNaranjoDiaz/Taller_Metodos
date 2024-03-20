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
public class Ejercicio3 {
    public static double convertirDolaresAEuros(double dolares) {
          
       double tipoCambio = 1.33250;
       double euros = dolares / tipoCambio;
       return euros;
    }
}
