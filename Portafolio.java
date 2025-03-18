import java.util.Scanner;

public class Portafolio {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        int opcion;

        do{
            System.out.println();

            System.out.println(" ____             _       ");
            System.out.println("|  _ \\ __ _ _   _| | __ _ ");
            System.out.println("| |_) / _` | | | | |/ _` |");
            System.out.println("|  __/ (_| | |_| | | (_| |");
            System.out.println("|_|   \\__,_|\\__,_|_|\\__,_|");
            System.out.println("");
            System.out.println("");
            
            System.out.println("[?] Selecciona una opción para continuar");
            System.out.println("------> Desarrollado por Paula 2025");
            System.out.println("");

        
         //menu
        System.out.println("| [1] La suma de dos nnumero* ");
        System.out.println("| [2] ");
        System.out.println("| [3] ");
        System.out.println("| [4] ");
        System.out.println("| [?] Salir* ");
        opcion=scanner.nextInt();
        
        
        
        //Opciones
        switch (opcion) {
            case 1:
            System.out.println("ingrese un primer numero ");
            System.out.print("Ingrese el primer número: ");
            int num1 = scanner.nextInt();
            System.out.print("Ingrese el segundo número: ");
            int num2 = scanner.nextInt();
            int suma = num1 + num2;
            System.out.println("La suma es: " + suma);
            case 2:
             System.out.println(" Saliendo del programa");
                break;
        
            default:
                break;
        }
        }while (opcion != 0 );
        
    }

    
}
