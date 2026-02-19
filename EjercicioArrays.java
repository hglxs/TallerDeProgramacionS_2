//  Importar librería
import java.util.Scanner;

public class EjercicioArrays {
    //  Hacer la declaración global del Scanner
    public static Scanner sc = new Scanner(System.in);

    //  Iniciar "MAIN"
    public static void main(String[] args){
        //  Declarar variables
        int[] calificaciones;
        int cantidad, comprobar, pares=0, cantidadPares=0;
        double promedio=0;

        //  Pedir al usuario que ingrese los datos
        System.out.println("\n===== CALCULO DE PROMEDIO CON ARRAYS =====");
        System.out.print("Ingresa la cantidad de calificacioes que deseas ingresar\nCALIFICACIONES: ");
        cantidad = sc.nextInt();

        //  Iniciar el array
        calificaciones = new int[cantidad];

        System.out.println("\n*** NOTA: RECUERDA QUE LAS CALIFICACIONES SOLO PUEDEN SER ENTRE CERO Y DIEZ (0 - 10) ***");

        /*  Iniciar ciclo "for" para que el usuario ingrese las calificaciones

            NOTA: LAS CALIFICACIONES SÓLO PUEDEN SER POSITIVAS Y EN UN RANGO DE 0 A 10
        */
       for (int i=0; i<calificaciones.length; i++){
            System.out.print("\nCALIFICACION "+(i+1)+": ");
            calificaciones[i] = sc.nextInt();

            //  Comprobar que las calificaciones estén en el rango
            if ((calificaciones[i] >= 0) && (calificaciones[i] <= 10)){
                comprobar = calificaciones[i];

                //  Comparar las calificaciones pares e impares y sólo tomar pares
                if (comprobar%2 == 0){
                    pares += comprobar;
                    cantidadPares++;
                }

            //  Si están fuera de rango
            } else {
                //  Pedir al usuario que ingrese una nueva cantidad
                while(!(calificaciones[i] >= 0) || !(calificaciones[i] <=10)){
                    System.err.println("\nLA CALIFICACION INGRESADA ESTA FUERA DE RANGO...\nPOR FAVOR INGRESA UNA NUEVA CALIFICACION...");
                    System.out.print("CALIFICACION "+(i+1)+": ");
                    calificaciones[i] = sc.nextInt();
                }
                //  Comparar si la nueva calificación es par o impar
                comprobar = calificaciones[i];
                if (comprobar%2==0){
                    pares += comprobar;
                    cantidadPares++;
                }
            }
       }

       //   Calcular el promedio sólo con las calificaciones pares
       promedio = pares/cantidadPares;

       //   Imprimir los resultados finales al usuario
       System.out.println("\n===== RESULTADOS FINALES =====");
       System.out.println("CANTIDAD DE CALIFICACIONES INGRESADAS: "+cantidad);
       System.out.println("CANTIDAD DE CALIFICACIONES PARES: "+cantidadPares);
       System.out.println("PROMEDIO DE CALIFICACIONES PARES: "+promedio);
    }
}
