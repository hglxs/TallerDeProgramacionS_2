import java.util.Scanner;

/** 
 * AGREGAR LAS INSTRUCCIONES SOBRE LO QUE VA A EJECUTAR EL PROGRAMA
*/

public class BorradorPI_1{
    // Declarar como variable global Scanner "sc"
        public static Scanner sc = new Scanner(System.in);
    
    //  Método principal (MAIN)
    public static void main(String[] args){
        /**
         * Declarar las variables para capturar los datos del usuario:
         *      1. Nombre del cliente (string)
         *      2. ID de cotización (integer)
         *      3. Cantidad de tarjetas (integer)
         */
        String cliente;
        int idCot, cantidad;

        /**
         * Declarar los parámetros de las PCBs:
         *      1. Largo en cm (double)
         *      2. Ancho en cm (double)
         *      3. Número de capas (integer)
         *      4. Tipo de acabado - HASL / ENIG (string)
         *      5. Tipo de ensamble - SMT / THT / Mixto (string)
         *      6. Número estimado de componentes (integer)
         *      7. Costos fijos de:
         *          7.1. Costo por cm^2 (double)
         *          7.2. Costo por ensamblado (double)
         *          7.3. Costo por fabricación (double)
         */
        final double cmCuadrado = 23, costoEnsamble = 2.1, costoFabricacion = 2;        //  Determinas los costos con el equipo
        double largo, ancho;
        int numCapas, numComponentes;
        String tipoAcabado, tipoEnsamble;

        /**
         * Declarar los resultados que van a ser mostrados al ususario:
         *      1. Área de la tarjeta en cm^2 (double)
         *      2. Subtotal por fabricación de PCB (double)
         *      3. Subtotal por ensamble (double)
         *      4. Total estimado de la cotización - fabricación + ensamble (double)
         */
        double areaTotal, subFabricacion, subEnsamble, totalCotizacion;

        //  Pedir al usuario que ingrese sus datos
        System.out.println("\n===== REGISTRO DEL USUARIO =====");
        System.out.print("Ingrese el nombre del cliente: ");
        cliente = sc.nextLine().toUpperCase().trim();

        System.out.print("\nID de Cotización: ");
        idCot = sc.nextInt();

        System.out.print("\nCantidad de PCBs requeridas: ");
        cantidad = sc.nextInt();

        //  Pedir al usuario los datos de las PCBs
        System.out.println("\n===== DATOS DE LAS PCBs =====");
        System.out.print("Ingresa el largo de la PCB en centimetros (cm): ");
        largo = sc.nextDouble();

        System.out.print("\nIngresa el ancho de la PCB en centimetros (cm): ");
    }
}