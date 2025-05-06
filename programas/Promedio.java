package programas;

import java.util.Scanner;

public class Promedio{
    public static void promedio() {
        Scanner scannerNumeros = new Scanner(System.in);
       
        System.out.println("Número 1:");
         int num11 = scannerNumeros.nextInt();
         System.out.println("Número 2:");
         int num12 = scannerNumeros.nextInt();
         System.out.println("Número 3:");
         int num13 = scannerNumeros.nextInt();
         int promedio = (num11 + num12 + num13) / 3;
         System.out.println("El promedio de los números es: " + promedio);
    }
}
   