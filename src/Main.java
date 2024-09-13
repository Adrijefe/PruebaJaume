import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner teclat = new Scanner(System.in);
        System.out.println("Dime las dimension del vector");
        int dimension = teclat.nextInt();
        int vec[] = new int[dimension];

        while(true) {

            System.out.println("********* MENU DE OPCIONES *********");
            System.out.println("1- Rellenar el vector");
            System.out.println("2- Calcular la media");
            System.out.println("3- Comprobar si existe el numero");
            System.out.println("4- Contar Mayores");
            System.out.println("5- Salir del programa");
            int numero = teclat.nextInt();

            switch (numero){
                case 1:
                    rellenar(vec);
                    break;
                    case 2:
                        media(vec);
                        break;
                        case 3:
                            existeNumero(vec);
                            break;
                            case 4:
                                mayorQue(vec);
                                break;
                                case 5:
                                System.out.println("Salir del programa");
                                return;

            }

        }



        }

        public static void rellenar (int[] vector){
        for (int i = 0; i < vector.length; i++) {
            int tam = (int) (-100 + Math.random() * (100 - (-100) +1));
            vector[i] = tam;
            System.out.println(vector[i]);
        }



    }

    public static void media (int[] vector){
         int media = 0;
        for (int i = 0; i < vector.length; i++) {
            media += vector[i];

        }
        media = media / vector.length;
        System.out.println(media);

    }

    public static void existeNumero (int[] vector){
      Scanner teclado = new Scanner(System.in);
      System.out.println("Dime que numero quieres");
     int tamaño = teclado.nextInt();
      boolean existe = true;
      for (int i = 0; i < vector.length; i++) {
          if (vector[i] == tamaño){
              existe = true;

          }
          else {
              existe = false;
          }

      }
        System.out.println(existe);


    }
    public static void mayorQue ( int [] vector ){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Dime un numero: ");
        int numero = scanner.nextInt();

        for (int i = 0; i < vector.length; i++){
            int nummayor = 0;
            for (int j = 0; j < vector.length; j++){
                if (vector[j] >= numero ){
                    nummayor += 1;

                }
            }
            if (nummayor == 0){
                System.out.println("No hay mayores.");
                break;
            } else {
                System.out.println("Hay " + nummayor + " mayores.");
                break;
            }
        }


        }
    }



