package programas;

import java.util.Scanner;

public class Converción1 {
    public static void converción1() {
        Scanner scannerNumeros = new Scanner(System.in);
        
        System.out.println("Distancia en metros:");
        int distancia = scannerNumeros.nextInt();
        int conversion = distancia / 1000;
        System.out.println("La distancia en kilómetros es: " + conversion);
        }
}
