/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package examen1;
import java.util.Scanner;

public class Examen1 {

 
    public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);
    	boolean salir = false;

    	while (!salir) {
        	System.out.println("Menú de opciones:");
        	System.out.println("1. Concatenar dos palabras");
        	System.out.println("2. Visualizar el número de palabras de una frase");
        	System.out.println("3. Contar cuántas veces aparece una letra en una frase");
        	System.out.println("4. Salir");
        	System.out.print("Seleccione una opción: ");

        	int opcion = scanner.nextInt();
        	scanner.nextLine(); // Limpiar el buffer

        	switch (opcion) {
            	case 1:
                System.out.print("Ingrese la primera palabra: ");
           		 String palabra1 = scanner.nextLine();
           		 System.out.print("Ingrese la segunda palabra: ");
           		 String palabra2 = scanner.nextLine();
                	break;
                      

            	case 2:
                	
                	break;

            	case 3:
                	
                	break;

            	case 4:
                	// Opción 4: Salir
                	System.out.print("¿Está seguro de que desea salir? (s/n): ");
                	String confirmacion = scanner.nextLine();
                	if (confirmacion.equalsIgnoreCase("s")) {
                    	salir = true;
                    	System.out.println("Saliendo del programa...");
                	} else {
                    	System.out.println("Regresando al menú...");
                	}
                        System.out.println("Resultado de la concatenación: " + palabra1 + palabra2);

                	break;

            	default:
                	System.out.println("Opción no válida. Por favor, seleccione una opción del 1 al 4.");
        	}
        	System.out.println(); // Línea en blanco para separar las iteraciones
    	}

    	scanner.close();
	}
}
