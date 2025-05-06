package programas;

import java.util.Scanner;

public class Sumar {
    public static void suma() {
        Scanner scannerNumeros = new Scanner(System.in);
        
        System.out.println("Primer número:");
        int num1 = scannerNumeros.nextInt();
        System.out.println("Segundo número:");
        int num2 = scannerNumeros.nextInt();
        int suma = num1 + num2;
        System.out.println("La suma de los números es: " + suma);
        

        
    }
}