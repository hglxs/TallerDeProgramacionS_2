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
        int dias, horarios, cantidadRegistros;
        double[][] temperatura;
        double promedioGeneral, tempMin, tempMax, promedioDia, diaMayor, diaMenor, sumaTemperaturas=0;

        /** 
         * PEDIR AL USUARIO QUE INGRESE LOS DATOS
        */
        System.out.println("\n========== TEMPERATURAS ==========");
        //  Ingresar la cantidad de días
        System.out.print("\nEl programa registra las temperaturas del área de refigeracion durante los dias y horarios que se indiquen.\nINGRESA LA CANTIDAD DE DÍAS: ");
        dias = sc.nextInt();
        sc.nextLine();      //  Limpiar el Scanner

        //  Comprobar que la cantidad sea positiva
        while(!(dias>0)){
            System.err.println("\nLA CANTIDAD INGRESADA TIENE QUE SER POSITIVA...\nPOR FAVOR, VUELVE A INGRESAR EL DATO...");
            System.out.print("\nCANTIDAD DE DIAS: ");
            dias = sc.nextInt();
            sc.nextLine();
        }

        //  Ingresar la cantidad de horarios
        System.out.print("INGRESA LA CANTIDAD DE HORARIOS: ");
        horarios = sc.nextInt();
        sc.nextLine();      //  Limpiar el Scanner

        //  Comprobar que la cantidad sea positiva
        while(!(horarios>0)){
            System.err.println("\nLA CANTIDAD INGRESADA TIENE QUE SER POSITIVA...\nPOR FAVOR, VUELVE A INGRESAR EL DATO...");
            System.out.print("\nCANTIDAD DE HORARIOS: ");
            dias = sc.nextInt();
            sc.nextLine();
        }

        //  Inicializar la matriz "temperatura" y la variable "cantidad de registros"
        temperatura = new double[dias][horarios];
        cantidadRegistros = dias*horarios;

        /** 
         * COMENZAR A CALCULAR LOS RESULTADOS REQUERIDOS CON UN CICLO "FOR" ANIDADO
         *      1. Promedio general de las temeraturas
         *      2. Temperatura mínima y máxima indicando "día" y "hora"
         *      3. Promedio de temperatura por día
         *      4. Día con mayor y menor temperatura
        */
        System.out.println("\n========== REGISTRO DE TEMPERATURAS =========");
        for (int i=0; i<dias; i++){
            for (int j=0; j<horarios; j++){

                //  Registrar las temperaturas del día de acuerdo con la cantidad de horarios deseados
                System.out.println("\nDIA "+(i+1)+"     HORARIO "+(j+1));
                System.out.print("TEMPERATURA REGISTRADA: ");
                temperatura[i][j] = sc.nextDouble();
                sc.nextLine();

                //  Sumar la cantidad de temperaturas que se van ingresando
                sumaTemperaturas += temperatura[i][j];
            }
        }

        //  Determinar el promedio de las temperaturas ingresadas
        promedioGeneral = Promedio(sumaTemperaturas, cantidadRegistros);

        /** 
         *  MOSTRAR LOS RESULTADOS AL USUARIO
        */
       System.out.println("\n========= RESULTADOS =========");
       System.out.println("PROMEDIO GENERAL: "+promedioGeneral);
       System.out.println("TEMPERATURA MÁXIMA: ");
       System.out.println();
       System.out.println();
    }

    /** 
     *  ==========================================
     *                  MÉTODOS
     *  ==========================================
    */

    /*  Método "PROMEDIO DE TEMPERATURAS"
        Este método calcula el promedio general de las temperaturas ingresadas 
    */
    public static double Promedio(double suma, int cantidad){
        return suma/cantidad;
    }

    
}
