/** 
 * Una empresa requiere registrar las temperaturas del área de refrigeración durante varios días. 
 * El disposotivo mide la temperatura en grados Fahrenheit aunque se espera que la consulta final esté en grados centígrados. 
 * Este registro se simplifica de la siguiente manera, cada fila representa un día y cada columna representa una lectura tomada en un horario fijo. 
 * El programa debe permitir capturar esas lecturas en una matriz y generar un reporte básico. 

    Instrucciones:
        1. El programa debe pedir al usuario la cantidad de días y los horarios (3 días y 5 horarios)
        2. Crear una matriz bidimensional double
        3. Capturar las temperaturas por día con el Scanner, indicando su posición explícita
        4. Calcular una vez capturada la matriz:
	        4.1 Promedio general de todas las temperaturas
	        4.2 Temperatura mínima y máxima registradas indicando el día y la hora
	        4.3 Promedio de cada día
	        4.4 Día con mayor temperatura y día con menor temperatura
*/

//  Importar librería
import java.util.Scanner;

public class TareaTemperatura {
    public static void main(String[] args){

        //  Declarar variables
        Scanner sc = new Scanner(System.in);
        int dias, horarios;
        double[][] temperatura;
        double promedioGeneral, tempMin, tempMax, promedioDia, diaMayor, diaMenor;

        /** 
         * PEDIR AL USUARIO QUE INGRESE LOS DATOS
        */
        System.out.println("\n===== REGISTRO DE TEMPERATURAS =====");
        //  Ingresar la cantidad de días
        System.out.print("\nEl programa registra las temperaturas del área de refigeracion durante los dias y horarios que se indiquen.\nINGRESA LA CANTIDAD DE DÍAS: ");
        dias = sc.nextInt();
        sc.nextLine();      //  Limpiar el Scanner

        //  Ingresar la cantidad de horarios
        System.out.print("INGRESA LA CANTIDAD DE HORARIOS: ");
        horarios = sc.nextInt();
        sc.nextLine();      //  Limpiar el Scanner

        //  Inicializar la matriz "temperatura"
        temperatura = new double[dias][horarios];

        /** 
         * COMENZAR A CALCULAR LOS RESULTADOS REQUERIDOS CON UN CICLO "FOR" ANIDADO
         *      1. Promedio general de las temeraturas
         *      2. Temperatura mínima y máxima indicando "día" y "hora"
         *      3. Promedio de temperatura por día
         *      4. Día con mayor y menor temperatura
        */

    }
}
