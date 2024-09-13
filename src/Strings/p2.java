package Strings;

import java.util.Scanner;

public class p2 {
    public static void main(String[] args) {
        Scanner teclat = new Scanner(System.in);
        System.out.println("Programa 2");
        System.out.println("Dime la Primera frase");
        String frase = teclat.nextLine();
        System.out.println("Dime la Segunda frase");
        String frase2 = teclat.nextLine();

        if (frase.equalsIgnoreCase(frase2)) {
            System.out.println("La frase es igual");
        }
        else {
            System.out.println("La frase no es igual");
        }
    }
}
