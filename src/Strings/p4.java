package Strings;

import java.util.Scanner;

public class p4 {
    public static void main(String[] args) {
        Scanner teclat = new Scanner(System.in);
        System.out.println("Programa 4");
        System.out.println("Dime una frase");
        String frase = teclat.nextLine();
        int contA = 0;
        int contE = 0;
        int contI = 0;
        int contO = 0;
        int contU = 0;

    for (int i = 0; i < frase.length(); i++) {

        if (frase.charAt(i) == 'a' || frase.charAt(i) == 'A'){
            contA++;
        }
        if (frase.charAt(i) == 'e' || frase.charAt(i) == 'E'){
            contE++;
        }
        if (frase.charAt(i) == 'i' || frase.charAt(i) == 'I'){
            contI++;
        }
        if (frase.charAt(i) == 'o' || frase.charAt(i) == 'O'){
            contO++;
        }
        if (frase.charAt(i) == 'u' || frase.charAt(i) == 'U'){
            contU++;
        }
    }


        System.out.println("Hay " + contA + " A");
        System.out.println("Hay " + contE + " E");
        System.out.println("Hay " + contI + " I");
        System.out.println("Hay " + contO + " O");
        System.out.println("Hay " + contU + " U");
    }
}
