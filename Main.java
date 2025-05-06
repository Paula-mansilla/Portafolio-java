import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        int opcion;

        vistas.vista.banner();

        do{
            
         programas.Opciones.Opciones();
         System.out.println("[0] salir");
         System.out.println("[?] ");
         opcion = scanner.nextInt();

        
        //Opciones
        switch (opcion) {
            case 1:
            System.out.println("-----------------------");
            programas.Sumar.suma();
            System.out.println("------------------------");
                break;
             
                case 2:
            System.out.println("-----------------------");
            programas.resta.resta();
            System.out.println("------------------------");
                break;
             
                case 3:
            System.out.println("-----------------------");
            programas.Multiplicación.multiplicación();
            System.out.println("------------------------");
                break;
             
             case 4:
             System.out.println("-----------------------");
             programas.Division.division();
             System.out.println("------------------------");
             break;
                
             case 5:
             System.out.println("-----------------------");
             programas.Modulo.modulo();
             System.out.println("------------------------");
             break;

             case 6:
             System.out.println("-----------------------");
             programas.Promedio.promedio();
             System.out.println("------------------------");
             break;

             case 7:
             System.out.println("-----------------------");
             programas.Mayor1.mayor1();
             System.out.println("------------------------");
             break;

             case 8:
             System.out.println("-----------------------");
             programas.Mayor2.mayor2();
             System.out.println("------------------------");
             break;

             case 9:
             System.out.println("-----------------------");
             programas.Converción1.converción1();
             System.out.println("------------------------");
             break;

             case 10:
             System.out.println("-----------------------");
             programas.Converción2.converción2();
             System.out.println("------------------------");
             break;

             case 0:
             System.out.println("Saliendo del programa");
             break;

             default:
             System.out.println("Error de entrada [/]");
             break;
             
              }
        }while (opcion != 0 );
    }
}
