package Strings;

import java.util.Scanner;

public class p5 {
    public static void main(String[] args) {
        Scanner teclat = new Scanner(System.in);
        System.out.println("Programa 5");
        System.out.println("Dime una frase");
        String frase = teclat.nextLine();

        frase = frase.toLowerCase().replaceAll("\\s","");
        String palabra = "";
        for (int i = frase.length() - 1; i >= 0; i--) {
            palabra += frase.charAt(i);
        }
        System.out.println(palabra);
        if (frase.equalsIgnoreCase(palabra)) {
            System.out.println("palindromo");
        } else {
            System.out.println("no palindromo");
        }


    }
}
