package paquete;
import java.util.Random;
import java.util.Scanner;

public class MatrizApp {

    public static void main(String[] args) {
    	  // Crear la matriz 5x5 de números aleatorios entre 1 y 100
        int[][] matriz = new int[5][5];

        // Llenar la matriz con números aleatorios
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                matriz[i][j] = (int) (Math.random() * 100) + 1; // Números aleatorios entre 1 y 100
            }
        }

        // Mostrar la matriz en la consola
        System.out.println("Matriz 5x5 generada con números aleatorios entre 1 y 100:");
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print(matriz[i][j] + "\t"); // Imprimir cada valor seguido de una tabulación
            }
            System.out.println(); // Salto de línea después de cada fila
        }

        // Solicitar al usuario un número para buscar en la matriz
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese un número para buscar en la matriz: ");
        int numeroBuscado = scanner.nextInt();

        // Buscar el número en la matriz
        boolean encontrado = false;
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                if (matriz[i][j] == numeroBuscado) {
                    System.out.println("El número " + numeroBuscado + " se encuentra en la posición: Fila " + (i + 1) + ", Columna " + (j + 1));
                    encontrado = true;
                    break;
                }
            }
            if (encontrado) {
                break;
            }
        }

        // Si el número no se encuentra en la matriz
        if (!encontrado) {
            System.out.println("El número " + numeroBuscado + " no se encuentra en la matriz.");
        } 
    }
}