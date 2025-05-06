package programas;

import java.util.Scanner;

public class Multiplicación {
    public static void multiplicación (){
        Scanner scannerNumeros = new Scanner(System.in);
       
        System.out.println("Primer número:");
        int num5 = scannerNumeros.nextInt();
        System.out.println("Segundo número:");
        int num6 = scannerNumeros.nextInt();
        int multiplicacion = num5 * num6;
        System.out.println("La multiplicación de los números es: " + multiplicacion);
    }
}
   
    