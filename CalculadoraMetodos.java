import java.util.Scanner;

public class CalculadoraMetodos{
    public static void main(String[] args){
        // Declarar Scanner "read"
        Scanner read = new Scanner(System.in);

        // Pedir al usuario un número entero o decimal para "a" y "b"
        System.out.print("a = ");
        double a = read.nextDouble();

        System.out.print("b = ");
        double b = read.nextDouble();

        // Mostrar los resultados al usuario
        System.out.println("\nSUMA: "+suma(a, b));
        System.out.println("RESTA: "+resta(a, b));
        System.out.println("MULTIPLICACION: "+multiplicacion(a, b));

        // Cerrar Scanner "read"
        read.close();
    }

    //  Metodo "SUMA"
    static double suma(double a, double b){
        return a + b;
    }
    //  Metodo "RESTA"
    static double resta(double a, double b){
        return a - b;
    }
    // Metodo "MULTIPLICACION"
    static double multiplicacion(double a, double b){
        return a * b;
    }
}
