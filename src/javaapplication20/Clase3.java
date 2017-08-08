package javaapplication20;

import java.util.Scanner;



public class Clase3 {


      public static void main(String[] args) {
        double totalSalario;
        Scanner flujoEntrada = 
                new Scanner(System.in);
        String nombre = null;
        int numeroHoras = 0;
        double valorHora = 0;
        
        System.out.println("Nombre");
        nombre = flujoEntrada.next();
        
        System.out.println("Horas");
        numeroHoras = flujoEntrada.nextInt();
        
        System.out.println("Valor");
        valorHora = flujoEntrada.nextDouble();
        
      //invocando la funcion 
        totalSalario = calcularsalario(numeroHoras, valorHora);
        System.out.println("Nombre" + nombre + "salario" + totalSalario);
     }
      

    public static double
            calcularsalario(int horas, double valor) {
        double totalSalario = 0;
        double valorHorasNormales;
        double valorHorasExtra;
        int horasExtra;
        double valorHorasExtra2;

        if (horas == 40) {
            totalSalario = (int) (valor * horas);
        }
        if (horas > 40) {
            valorHorasNormales = (int) (40 * valor);
            horasExtra = (horas - 40);
            valorHorasExtra = (int) (horasExtra * (valor * 2));
            totalSalario = (int) (valorHorasExtra + valorHorasNormales);
            if (horas > 48) {
                valorHorasNormales = (int) (40 * valor);
                valorHorasExtra = (int) (8 * (valor * 2));
                valorHorasExtra2 = (int) ((horas - 48) * (valor * 3));
                totalSalario = (int) (valorHorasExtra + valorHorasExtra2 + valorHorasNormales);

            }

        }
        return totalSalario;
    }
    
}
