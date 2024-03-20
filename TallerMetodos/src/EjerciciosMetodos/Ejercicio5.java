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
public class Ejercicio5 {
    public static int convertirASegundos(int dias, int horas, int minutos) {
         int segundosPorDia = 24 * 60 * 60;
         int segundosPorHora = 60 * 60;
         int segundosPorMinuto = 60;

         int segundosTotales = (dias * segundosPorDia) + (horas * segundosPorHora) + (minutos * segundosPorMinuto);

         return segundosTotales;
     }
}
