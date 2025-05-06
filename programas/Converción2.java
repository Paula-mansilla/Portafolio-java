package programas;

import java.util.Scanner;

public class Converción2 {
    public static void converción2() {
        Scanner scannerNumeros = new Scanner(System.in);
       
        System.out.println("Ingresa la distancia en kilómetros:");
        int kilometros = scannerNumeros.nextInt();
        int metros = kilometros * 1000;
        System.out.println("La distancia en metros es: " + metros);
         }
}