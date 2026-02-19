//  Importar librería
import java.util.Scanner;

public class ArraysBidimensionales {
    //  Declarar el Scanner "sc" de forma global
    public static Scanner sc = new Scanner(System.in);

    //  Iniciar "MAIN"
    public static void main(String[] args){
        //  Declarar variables
        int[][] matriz;
        int filas, columnas;

        //  Pedir datos al usuario
        System.out.println("\n===== ARRAY BIDIMENSIONAL UNO =====");
        System.out.print("Ingresa el numero de filas y columnas que deseas que tenga la matriz\nFILAS: ");
        filas = sc.nextInt();

        System.out.print("COLUMMNAS: ");
        columnas = sc.nextInt();

        //  Iniciar la matriz con los valores ingresados por el usuario
        matriz = new int[filas][columnas];

        //  
        for (int i=0; i<filas; i++){
            for (int j=0; j<columnas; j++){

            }
        }
    }
}
