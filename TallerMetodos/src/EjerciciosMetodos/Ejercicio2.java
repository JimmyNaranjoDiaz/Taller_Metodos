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
public class Ejercicio2 {
    public static double calcularRectangulo(double lado1, double lado2, String tipoCalculo) {
        double resultado = 0;
        
        switch (tipoCalculo.toLowerCase()) {
            case "perimetro":
                resultado = 2 * (lado1 + lado2);
                break;
            case "area":
                resultado = lado1 * lado2;
                break;
        }
        
        return resultado;
    }
}
