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
    }
}