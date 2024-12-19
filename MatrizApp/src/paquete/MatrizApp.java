package paquete;
import java.util.Random;
import java.util.Scanner;

public class MatrizApp {

    public static void main(String[] args) {
        // Crear la matriz de 5x5 con números aleatorios entre 1 y 100
        int[][] matriz = generarMatriz(5, 5);

        // Mostrar la matriz en consola
        mostrarMatriz(matriz);

        // Permitir al usuario buscar un número en la matriz
        buscarNumero(matriz);

        // (Opcional) Calcular y mostrar la suma de todos los números en la matriz
        int suma = calcularSuma(matriz);
        System.out.println("La suma de todos los números en la matriz es: " + suma);
    } 

    // Método para generar una matriz de tamaño filas x columnas con números aleatorios entre 1 y 100
    public static int[][] generarMatriz(int filas, int columnas) {
        int[][] matriz = new int[filas][columnas];
        Random random = new Random();
        
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                matriz[i][j] = random.nextInt(100) + 1; // Números aleatorios entre 1 y 100
            }
        }
        
        return matriz;
    }

    // Método para mostrar la matriz en consola
    public static void mostrarMatriz(int[][] matriz) {
        System.out.println("Matriz generada:");
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print(matriz[i][j] + "\t");
            }
            System.out.println();
        }
    }

    // Método para buscar un número en la matriz
    public static void buscarNumero(int[][] matriz) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Introduce un número para buscar en la matriz: ");
        int numeroBuscado = scanner.nextInt();

        boolean encontrado = false;

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                if (matriz[i][j] == numeroBuscado) {
                    System.out.println("Número encontrado en la posición: Fila " + (i + 1) + ", Columna " + (j + 1));
                    encontrado = true;
                    break;
                }
            }
            if (encontrado) {
                break;
            }
        }

        if (!encontrado) {
            System.out.println("El número no se encuentra en la matriz.");
        }
    }

    // Método para calcular la suma de todos los números en la matriz
    public static int calcularSuma(int[][] matriz) {
        int suma = 0;
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                suma += matriz[i][j];
            }
        }
        return suma;
    }
}