package PruebasTryCatch;

import java.util.InputMismatchException;
import java.util.Scanner;

public class p2 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
       /*
       Implementa un programa que pida dos valores int A y B utilizando un nextInt() (de Scanner),
        calcule A/B y muestre el resultado por pantalla.
       Se deberán tratar de forma independiente las dos posibles excepciones,
       InputMismatchException y ArithmeticException, mostrando en cada caso un
        mensaje de error diferente en cada caso.
        */


        try {
            System.out.println("Dime la opcion A");
            int A = teclado.nextInt();
            System.out.println("Dime la opcion B");
            int B = teclado.nextInt();
            System.out.println("La opción es : " + A/B);
        }
        catch (InputMismatchException e) {
            System.out.println("Es una letra, tienes que poner un numero");

        }
        catch (ArithmeticException e){
            System.out.println("No puedes poner 0 en el segundo");

        }


    }
}
