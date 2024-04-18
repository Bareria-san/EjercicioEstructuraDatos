package co.edu.poli.ces3.actividad1;

import java.util.Random;

public class Main {

    public static void main(String[] args) {
        // Tamaño del arreglo
        int tamanoArreglo = 10;

        // Crear el arreglo
        int[] arreglo = new int[tamanoArreglo];

        // Inicializar el generador de números aleatorios
        Random rand = new Random();

        // Llenar el arreglo con números aleatorios
        for (int i = 0; i < tamanoArreglo; i++) {
            arreglo[i] = rand.nextInt(100); // Genera números aleatorios entre 0 y 99
        }

        // Imprimir los elementos en posiciones pares
        System.out.println("Elementos en posiciones pares:");
        for (int i = 0; i < tamanoArreglo; i += 2) {
            System.out.println("Posición " + i + ": " + arreglo[i]);
        }
    }
}
