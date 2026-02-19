/**
 * ===== PROMEDIO DE CALIFICACIONES INGRESADAS =====
 *  - El usuario ingresa los datos del alumno (nombre y calificaciones)
 *  - El usuario determina cuántas calificaciones va a ingresar
 *  - Al final se muestran los resultados que ingresó el usuario
 */

//  Importar Scanner
import java.util.Scanner;

public class PromedioCalificaciones {

    //  Declarar variable global Scanner "sc"
    public static Scanner sc = new Scanner(System.in);

    //  Método principal (MAIN)
    public static void main(String[] args){

        /** Declarar variables para los datos ingresados por el usuario
         *      1. Nombre del alumno
         *      2. Cantidad de calificaciones y los valores de cada una
         *      3. Promedio
        */
        String nombre;
        double promedio, cantidad, calificaciones=0, temp;
        
        /**
         * Pedir al usuario que ingrese sus datos
         */
        System.out.println("\n===== SISTEMA DE CALIFICACIONES =====");
        System.out.print("Ingresa el nombre del alumno: ");
        nombre = sc.nextLine().trim().toUpperCase();

        System.out.print("\nIngresa la cantidad de calificaciones que deseas ingresar: ");
        cantidad = sc.nextDouble();

        /**
         *  Verificar que la cantidad de calificaciones sea positiva con un condicional "if" y "do-while"
         */
        if (cantidad <= 0){
            do {
                System.out.print("\nIngresa una cantidad positiva y distinta de cero: ");
                cantidad = sc.nextDouble();
            } while (cantidad <= 0);
        }

        /** 
         * Iniciar ciclo "for" para que el usuario ingrese las calificaciones correspondientes
        */
        for (int i=0; i<cantidad; i++){
            System.out.print("Ingresa la calificación " + (i + 1) + ": ");
            temp = sc.nextDouble();

            //  Comprobar que la calificación ingresada esté en el rango de 0 a 10
            if (!((temp >= 0) & (temp <= 10))){
                do {
                    System.out.println("\nLa calificación ingresada debe estar entre 0 y 10.\nPor favor, ingresa nuevamente la calificaion");
                    System.out.print("Calificacion " + (i + 1) + ": ");
                    temp = sc.nextDouble();
                } while (!((temp >= 0) & (temp <= 10)));
            }

            //  Guardar y sumar los valores de la variable "temp" en la variable "calificaciones"
            calificaciones += temp;
        }

        /* 
         * Calcular promedio una vez que termine el ciclo "for"
        */
        promedio = (calificaciones / cantidad);

        //  Mostrar resultados al usuario
        System.out.println("\n===== RESULTADOS INGRESADOS =====");
        System.out.println("NOMBRE DEL ALUMNO: " + nombre);
        System.out.println("TOTAL DE CALIFICAIONES INGRESADAS: " + cantidad);
        System.out.println("PROMEDIO DEL ALUMNO: " + promedio);
    }
}
