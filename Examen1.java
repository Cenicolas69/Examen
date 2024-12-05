/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package examen1;
import java.util.Scanner;

public class Examen1 {

 
    public static void main(String[] args) {
      Scanner scanner = new Scanner(System.in);
        int opcion;
        
        do {
            // Menú de opciones
            System.out.println("Menú de opciones:");
            System.out.println("1. Concatenar dos palabras");
            System.out.println("2. Visualizar el número de palabras de una frase");
            System.out.println("3. Contar cuántas veces aparece una letra en una frase");
            System.out.println("4. Salir");
            System.out.print("Seleccione una opción: ");
            
            opcion = scanner.nextInt();
            scanner.nextLine(); // Consumir el salto de línea

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
                    contarLetra(scanner);
                    break;
                case 4:
                    salir(scanner);
                    break;
                default:
                    System.out.println("Opción no válida. Intente de nuevo.");
            }

        } while (opcion != 4);
        
        scanner.close();
    }

    // Función para concatenar dos palabras
    public static void concatenarPalabras(Scanner scanner) {
        System.out.print("Ingrese la primera palabra: ");
        String palabra1 = scanner.nextLine();
        System.out.print("Ingrese la segunda palabra: ");
        String palabra2 = scanner.nextLine();
        System.out.println("Resultado de la concatenación: " + palabra1 + palabra2);
    }

    // Función para contar las palabras en una frase
    public static void contarPalabras(Scanner scanner) {
        System.out.print("Ingrese una frase: ");
        String frase = scanner.nextLine();
        String[] palabras = frase.split("\\s+");
        System.out.println("Número de palabras: " + palabras.length);
    }

    // Función para contar cuántas veces aparece una letra en una frase
    public static void contarLetra(Scanner scanner) {
        System.out.print("Ingrese una frase: ");
        String frase = scanner.nextLine();
        System.out.print("Ingrese la letra a contar: ");
        char letra = scanner.nextLine().charAt(0);
        
        int contador = 0;
        for (int i = 0; i < frase.length(); i++) {
            if (frase.charAt(i) == letra) {
                contador++;
            }
        }
        
        System.out.println("La letra '" + letra + "' aparece " + contador + " veces.");
    }

    // Función para salir del programa
    public static void salir(Scanner scanner) {
        System.out.print("¿Está seguro de que desea salir? (s/n): ");
        String confirmacion = scanner.nextLine();
        if (confirmacion.equalsIgnoreCase("s")) {
            System.out.println("Saliendo del programa...");
        } else {
            System.out.println("Regresando al menú...");
        }
    }
}