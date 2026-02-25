//  Importar Scanner
import java.util.Scanner;

public class FigurasEjemplo {
    //  Inicializar variables globales
    public static Scanner sc = new Scanner(System.in);
    public static String resultados;

    //  INICIAR MÉTODOS
    //  Método para cuadrado
    public static String figuraCuadrado(double lado){
        double area=lado*lado, perimetro=lado*4;
        return "AREA DEL CUADRADO: "+area+"\nPERIMETRO DEL CUADRADO: "+perimetro;
    }

    //  Método para triángulo
    public static String figuraTriangulo(double base, double altura){
        double area=(base*altura/2), perimetro=base*3;
        return "AREA DEL TRIANGULO: "+area+"\nPERIMETRO DEL TRIANGULO: "+perimetro;
    }

    //  Método para círculo
    public static String figuraCirculo(double radio){
        double area=Math.PI*(radio*radio), perimetro=Math.PI*2*radio;
        return "AREA DEL CIRCULO: "+area+"\nPERIMETRO DE CIRCULO: "+perimetro;
    }

    //  MAIN
    public static void main(String[] args){
        //  Declarar variables
        String figura;

        //  Mostrar información al usuario
        System.out.println("\n========= PERIMETROS Y AREAS DE FIGURAS =========");
        System.out.println("¿CON QUÉ FIGURA DESEAS TRABAJAR?");
        System.out.println("A) CUADRADO\nB) TRIANGULO\nC) CIRCULO");
        System.out.println("\nNOTA: Escribe solo  el inciso, sin parentesis");

        //  Pedir al usuario que seleccione una opción
        System.out.print("INCISO: ");
        figura = sc.nextLine().trim().toUpperCase();

        //  Comprobar opción ingresada con un while
        while (!figura.equals("A") && !figura.equals("B") && !figura.equals("C")){
            System.err.println("LA OPCION INGRESADA NO ES VALIDA.\nPOR FAVOR. VUELVE A INGRESARLA");
            System.out.print("INCISO: ");
            figura = sc.nextLine().trim().toUpperCase();
        }

        //  Iniciar switch-case dependiendo de la elección del usuario
        switch(figura){
            case "A":
                //  CUADRADO
                System.out.println("\nINGRESA EL LADO DEL CUADRADO EN CM (UNICAMENTE NUMEROS)");
                System.out.print("LADO: ");
                double lado = sc.nextDouble();

                //  Mostrar resultados con los métodos
                resultados = figuraCuadrado(lado);
                System.out.println(resultados);
                break;      //  Terminar el caso

            case "B":
                //  TRIÁNGULO
                System.out.println("\nINGRESA LA BASE Y LA ALTURA DEL TRIANGULO EN CM (UNICAMENTE NUMEROS)");
                System.out.print("BASE: ");
                double base = sc.nextDouble();

                System.out.print("ALTURA: ");
                double altura = sc.nextDouble();

                //  Mostrar resultados con el método "TRIÁNGULO"
                resultados = figuraTriangulo(base, altura);
                System.out.println(resultados);
                break;      //  Terminar el caso

            case "C":
                //  CÍRCULO
                System.out.println("\nINGRESA EL RADIO DEL CIRCULO EN CM (UNICAMENTE NUMEROS)");
                System.out.print("CIRCULO: ");
                double radio = sc.nextDouble();

                //  Mostrar resultados con el método "TRIÁNGULO"
                resultados = figuraCirculo(radio);
                System.out.println(resultados);
                break;      //  Terminar el caso
        }

    }
}
