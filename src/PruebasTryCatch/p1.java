package PruebasTryCatch;

import java.util.InputMismatchException;
import java.util.Scanner;

public class p1 {
    public static void main(String[] args) {
        Scanner teclat = new Scanner(System.in);
/*
Implementa un programa que pida al usuario un valor entero A utilizando un nextInt()
 (de Scanner) y luego muestre por pantalla el mensaje “Valor introducido: …”.
  Se deberá tratar la excepción InputMismatchException que lanza nextInt()
  cuando no se introduce un entero válido.
En tal caso se mostrará el mensaje “Valor introducido incorrecto”.
 */

        try {
            System.out.println("Dame un numero");
            int numero = teclat.nextInt();
            System.out.println("EL valor introducido es: " + numero);
        }
        catch (InputMismatchException e){
            System.out.println("Valor introducido incorrecto");
        }


    }
}
