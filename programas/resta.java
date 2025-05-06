package programas;

import java.util.Scanner;

public class resta {
    public static void resta() {
        Scanner scannerNumeros = new Scanner(System.in);
        
         System.out.println("Primer número:");
         int num3 = scannerNumeros.nextInt();
         System.out.println("Segundo número:");
         int num4 = scannerNumeros.nextInt();
         int resta = num3 - num4;
         System.out.println("La resta de los números es: " + resta);
        }
}
