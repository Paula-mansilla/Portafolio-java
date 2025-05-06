package programas;

public class Opciones {
    
    static String lista [] = {
        "Suma de dos numeros",
        "Resta de dos numeros",
        "Multiplicación de dos numeros",
        "Division de dos numeros",
        "Módulo (residuo de una division)",
        "Promedio de tres numeros",
        "Numero mayor y menor entre dos números",
        "Numero mayor y menor entre tres números",
        "Conversión de metros a centimetros",
        "Conversion de kilogramos a gramos",
     };

     //MOSTRAR OPCIONES

     public static void Opciones() {
        for (int i = 0; i < lista.length; i++) {
             System.out.println("["+ (i+1) +"]" + lista[i]);
        }
        
     }
}

    
