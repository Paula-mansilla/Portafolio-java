package programas;

import java.util.Scanner;

public class Mayor1 {
    public static void mayor1() {
        Scanner scannerNumeros = new Scanner(System.in);
       
        System.out.println("Ingrese el primer número:");
        int num14 = scannerNumeros.nextInt();
        System.out.println("Ingrese el segundo número:");
        int num15 = scannerNumeros.nextInt();
        if (num14 > num15) {
         System.out.println("El número mayor es: " + num14);
         System.out.println("El número menor es: " + num15);
        } else {
         System.out.println("El número mayor es: " + num15);
         System.out.println("El número menor es: " + num14);
         }
    }
}