import java.util.Scanner;

public class ValidacionDivision {
    public static void main(String[] args){
        // Declarar Scanner "read"
        Scanner read = new Scanner(System.in);

        // Pedir al usuario un número entero o decimal para "x" y "y"
        System.out.print("x = ");
        double x = read.nextDouble();

        System.out.print("y = ");
        double y = read.nextDouble();

        // Verificar que "y" sea distinto de cero
        if (y == 0){
            // Mensaje de error en caso de que "y" sea igual que cero
            System.err.println("\nERROR...\nNO SE PUEDE DIVIDIR ENTRE CERO...");
        } else {
            // Si "y" es distinto de cero, mostrar el resultado de la división
            System.out.println("\nX / Y = " + (x/y));
        }

        // Cerrar el Scanner "read"
        read.close();
    }
}
