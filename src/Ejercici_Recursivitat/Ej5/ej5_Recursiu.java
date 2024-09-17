package Ejercici_Recursivitat.Ej5;

public class ej5_Recursiu {
    public static void main(String[] args) {
        /*
5.- Calcular potencia.  Crear un mètode que obtinga el resultat d'elevar un número a un altre.
         */
        int base = 5;
        int exponent = 2;

        System.out.println(base + " elevado "+exponent + " = " + potencia(base, exponent));


    }

  static int potencia (int base, int exponent)
    {
        if (exponent == 0) return exponent;
        if (exponent == 1) return base;
        else return base * potencia(base, exponent - 1);

    }
}
