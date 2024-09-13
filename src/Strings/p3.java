package Strings;

import java.util.Scanner;

public class p3 {
    public static void main(String[] args) {
        Scanner teclat = new Scanner(System.in);
        System.out.println("Programa 3");
        System.out.println("Dime una Nombre");
        String nombre = teclat.nextLine();
        System.out.println("Dime una Apellido");
        String apellido = teclat.nextLine();
        System.out.println("Dime el Segundo Apellido");
        String segundoApellido = teclat.nextLine();

        for (int i = 0; i < 3; i++) {
            System.out.print(nombre.toUpperCase().charAt(i));

        }
        for (int i = 0; i < 3; i++) {
            System.out.print(apellido.toUpperCase().charAt(i));

        }
        for (int i = 0; i < 3; i++) {
            System.out.print(segundoApellido.toUpperCase().charAt(i));
        }


    }
}
