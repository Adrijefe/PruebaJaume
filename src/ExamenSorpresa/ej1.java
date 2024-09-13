package ExamenSorpresa;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ej1 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        try {
            System.out.print("Introduce un número positivo\n");
            imprimePositivo(teclado.nextInt());
            System.out.print("Introduce un número negativo\n");
            imprimeNegativo(teclado.nextInt());
        }
        catch (InputMismatchException e) {
            e.printStackTrace();
        }
        catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void imprimeNegativo(int i) {
        if (i < 0){
            System.out.println("El numero es negativo");
        }
        else {
            System.out.println("El numero es positivo");
        }
    }

    public static void imprimePositivo(int i) {
        if (i >= 0){
            System.out.println("El numero es positivo");
        }
        else {
            System.out.println("El numero es negativo");
        }

    }
}

