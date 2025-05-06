package programas;

import java.util.Scanner;

public class Division {
    public static void division() {
        Scanner scannerNumeros = new Scanner(System.in);
       
        System.out.println("Primer número:");
        int num7 = scannerNumeros.nextInt();
        System.out.println("Segundo número:");
        int num8 = scannerNumeros.nextInt();
        int division = num7 / num8;
        System.out.println("La división de los números es: " + division);
    }
}