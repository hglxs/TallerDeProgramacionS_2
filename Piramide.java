/**
 * ===== PIRÁMIDE DE ASTERISCOS =====
 *  - El programa debe de imprimir una pirámide de asteriscos
 *  - Pedir al usuario la altura de la pirámide
 */
//  Importar Scanner
import java.util.Scanner;

public class Piramide {
    
    //  Método principal (MAIN)
    public static void main(String[] args){
        
        /**
         * Declarar las variables:
         *      1. Scanner para el ingreso de datos
         *      2. Altura de la pirámide (integer)
         */
        Scanner sc = new Scanner(System.in);
        int altura;

        /**
         * Pedir los datos al usuario
         */
        System.out.println("\n===== PIRÁMIDE CON ASTERISCOS =====");
        System.out.println("Ingresa la altura que deseas que tenga la pirámide\nNOTA. Ingresa solo números positivos");
        System.out.print("ALTURA DE LA PIRAMIDE: ");
        altura = sc.nextInt();

        /**
         * Verificar con el condicional "if" y "do-while" que la altura ingresada no sea negativa o igual a cero
         *      True = Suelta un mensaje de error y obliga al usuario a poner una altura válida
         *      False = Comienza con la impresión de la pirámide
         */
        if(altura <= 0){
            do{
                System.out.println("\nTE DIJE QUE TENIA QUE SER POSITIVA LA ALTURA.\nVUELVE A INGRESAR LA ALTURA");
                System.out.print("ALTURA: ");
                altura = sc.nextInt();
            } while(altura <= 0);
        }
        //  -- TERMINAR EL CÓDIGO DESDE ESTE PUNTO (faltan los ciclos "for" y la impresión de la pirámide)

        //  Cerrar Scanner "sc"
        sc.close();
    }
}
