package PruebasTryCatch;

import java.util.Scanner;

public class p4 {
    public static void main(String[] args) {
        /*
        Implementa un programa que cree un vector de enteros de tamaño N (número aleatorio entre 1 y 100)
        con valores aleatorios entre 1 y 10. Luego se le preguntará al usuario qué posición del vector quiere mostrar por pantalla,
        repitiéndose una y otra vez hasta que se introduzca un valor negativo.
        Maneja todas las posibles excepciones.

         */
        Scanner teclat = new Scanner(System.in);
        int aleatorio = (int) (1 + Math.random() * 100);
        int vector [] = new int[aleatorio];
        int numero =(int) (1 + Math.random() * 10);

    }


}
