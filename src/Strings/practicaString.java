package Strings;

import java.util.ArrayList;
import java.util.Scanner;

public class practicaString {
    public static void main(String[] args) {
        Scanner teclat = new Scanner(System.in);
        System.out.println("Programa 1");
        System.out.println("Dime una frase");
        String palabra = teclat.nextLine();

        for (int i = 0; i < palabra.length(); i++) {
            System.out.print(palabra.charAt(i));
            System.out.println();
        }


    }


}
