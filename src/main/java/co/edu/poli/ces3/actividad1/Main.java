package co.edu.poli.ces3.actividad1;

import java.util.Random;

public class Main {

    public static void main(String[] args) {

        int tamanoArreglo = 10;
        int[] arreglo = new int[tamanoArreglo];

        Random rand = new Random();

        // Llenar el arreglo con números aleatorios
        for (int i = 0; i < tamanoArreglo; i++) {
            arreglo[i] = rand.nextInt(100);
        }

        System.out.println("Elementos en el array:");
        for (int i = 0; i < tamanoArreglo; i++) {
            System.out.println("Posición " + i + ": " + arreglo[i]);
        }

        // Imprimir los elementos en posiciones pares
        System.out.println("Elementos en posiciones pares:");
        for (int i = 0; i < tamanoArreglo; i += 2) {
            System.out.println("Posición " + i + ": " + arreglo[i]);
        }
    }
}
