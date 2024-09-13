package PruebasTryCatch;

import java.util.InputMismatchException;
import java.util.Scanner;

public class p3 {
    public static void main(String[] args) {
        /*
        Implementa un programa que cree un vector tipo double de tamaño 5 y luego, utilizando un bucle,
         pida cinco valores por teclado y los introduzca en el vector.
         Tendrás que manejar la/las posibles excepciones y
          seguir pidiendo valores hasta rellenar completamente el vector.
         */

        double vector[] = new double[5];
        Scanner teclado = new Scanner(System.in);
        int cont = 0;

        while (cont < 5){
            try {
                System.out.println("Dime un numero");
                double numero = teclado.nextDouble();
                vector[cont] = numero;
                cont++;


            } catch (ArithmeticException e) {
                System.out.println("Lo siento");

            } catch (InputMismatchException e) {
                System.out.println("No puedes poner una letra");
                teclado.nextLine();

            }


        }
        for (int i = 0; i < vector.length; i++) {
            System.out.println(vector[i]);

        }
        }


}
