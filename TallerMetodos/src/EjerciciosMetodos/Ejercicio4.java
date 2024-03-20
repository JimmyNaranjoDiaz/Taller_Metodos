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
public class Ejercicio4 {
    public static double calcularCirculo(double radio, String tipoCalculo) {
        double resultado = 0;
        double pi = 3.1416;
        
        switch (tipoCalculo.toLowerCase()) {
            case "perimetro":
                resultado = 2 * pi * radio;
                break;
            case "area":
                resultado = pi * Math.pow(radio, 2);
                break;
            case "volumen":
                resultado = (4 * pi * Math.pow(radio, 3)) / 3;
                break;
        }
        
        return resultado;
    }
}
