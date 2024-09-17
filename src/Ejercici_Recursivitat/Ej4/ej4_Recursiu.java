package Ejercici_Recursivitat.Ej4;

public class ej4_Recursiu {
    public static void main(String[] args) {
        int num = 1223343;
        System.out.println(num + " tiene " +digi(num) + " digitos");
    }
    static int digi ( int num){
        if (num<=0) return 0;
        return 1 + digi(num/10);
    }
}
