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

            switch (opcion) {
                case 1:
                    concatenarPalabras(scanner);
                    break;
                case 2:
                  System.out.print("Ingrese una frase: ");
                	String frase = scanner.nextLine();
                	String[] palabras = frase.trim().split("\\s+");
                	System.out.println("La frase contiene " + palabras.length + " palabras.");
                	break;

                case 3:
System.out.print("Ingrese una frase: ");
                	String fraseParaContar = scanner.nextLine();
                	System.out.print("Ingrese la letra a buscar: ");
                	char letra = scanner.nextLine().charAt(0);
                	int contador = 0;
                	for (char c : fraseParaContar.toCharArray()) {
                    	if (c == letra) {
                        	contador++;
                    	}
                	}
                	System.out.println("La letra '" + letra + "' aparece " + contador + " veces en la frase.");
                	break;

                case 4:
                    salir(scanner);
                    break;
                default:
                    System.out.println("Opción no válida. Intente de nuevo.");
            }
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
