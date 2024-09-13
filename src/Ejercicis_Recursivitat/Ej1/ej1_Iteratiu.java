package Ejercicis_Recursivitat.Ej1;

public class ej1_Iteratiu {

        public static int factorial(int numero){
            int fact=1;
            for (int i=1;i<=numero;i++) {
                fact=fact*i;
            }
            return fact;
        }
        public static void main(String args[]){
            System.out.println(factorial(4));
        }

}
