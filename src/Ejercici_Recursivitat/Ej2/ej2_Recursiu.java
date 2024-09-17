package Ejercici_Recursivitat.Ej2;

public class ej2_Recursiu {

    public static void recursivo(int[] vector, int num) {
        if (num == vector.length -1) {
            System.out.println(vector[num]);
        }

        else {
            System.out.println(vector[num]);
            recursivo(vector,num+1);
        }

    }


    public static void main(String[] args) {
        int vector[] = {1,2,3,4,5};
        recursivo(vector,0);

    }
}
