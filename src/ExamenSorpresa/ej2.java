package ExamenSorpresa;

public class ej2 {
    private static int metodo() {
        int valor = 0;
        try {
            valor = valor + 1;
// INSTRUCCIÓN
            valor=valor+Integer.parseInt("22"); valor = valor + 1;
            System.out.println("Valor al final del Try: " + valor);

        } catch (NumberFormatException e) {
            valor = valor + Integer.parseInt("42");
            System.out.println("Valor al final del catch: " + valor);
        } finally {
            valor = valor + 1;
            System.out.println("Valor al final del finally: " + valor);
        }

        valor = valor + 1;
        System.out.println("Valor antes del return: " + valor);

        return valor;

    }

    public static void main(String args[]) {
        try {
            System.out.println(metodo());
        } catch (Exception e) {
            System.err.println("Excepcion en metodo()");
            e.printStackTrace();
        }
    }
}
