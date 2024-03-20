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
public class Ejercicio6 {
    public static double convertirSegundos(double segundos, String tipo) {
        double dias = segundos / (24 * 60 * 60);
        double horas = segundos / (60 * 60);
        double minutos = segundos / 60;
        
        switch (tipo.toLowerCase()) {
            case "dias":
                return dias;
            case "horas":
                return horas;
            case "minutos":
                return minutos;
            default:
                return -1;
        }
    }
}
