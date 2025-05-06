package programas;

import java.util.Scanner;

public class Modulo {
    public static void modulo() {
        Scanner scannerNumeros = new Scanner(System.in);
       
        System.out.println("Primer número:");
        int num9 = scannerNumeros.nextInt();
        System.out.println("Segundo número:");
        int num10 = scannerNumeros.nextInt();
        int modulo = num9 % num10;
        System.out.println("El módulo de los números es: " + modulo);
    }
}