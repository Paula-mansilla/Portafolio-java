package programas;

import java.util.Scanner;

public class Mayor2 {
    public static void mayor2() {
        Scanner scannerNumeros = new Scanner(System.in);
       
        System.out.println("Ingrese el primer número:");
        int num16 = scannerNumeros.nextInt();
        System.out.println("Ingrese el segundo número:");
        int num17 = scannerNumeros.nextInt();
        System.out.println("Ingrese el tercer número:");
        int num18 = scannerNumeros.nextInt();

        int mayor, menor;

        // el mayor
        if (num16 >= num17 && num16 >= num18) {
            mayor = num16;
        } else if (num17 >= num16 && num17 >= num18) {
            mayor = num17;
        } else {
            mayor = num18;
        }

        // el menor
        if (num16 <= num17 && num16 <= num18) {
            menor = num16;
        } else if (num17 <= num16 && num17 <= num18) {
            menor = num17;
        } else {
            menor = num18;
        }

        System.out.println("El número mayor es: " + mayor);
        System.out.println("El número menor es: " + menor);
    }
}
   