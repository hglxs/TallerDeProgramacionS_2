//  Importar Scanner
import java.util.Scanner;

public class examenPrimerParcial {
    //  Declarar Scanner de forma global
    public static Scanner sc = new Scanner(System.in);

    //  *** MÉTODOS DEL PROGRAMA ***
    //  Método "Ley de Ohm" y "Potencia eléctrica"
    public static double OhmYPotencia(double a, double b){
        return a*b;
    }

    //  Método "Resistencias En Serie"
    public static int resistenciaEnSerie(int n, int[] resistencias){
        int resultado=0;
        for(int i=0; i<n; i++){
            System.out.print("RESISTENCIA "+(i+1)+": ");
            resistencias[i] = sc.nextInt();
            resultado += resistencias[i];
        }
        return resultado;
    }

    //  Método "Resistencias En Paralelo"
    public static double resistenciaEnParalelo(int a, int b){
        double resultado=0, suma = a+b, mult = a*b;

        if(suma == 0){
            System.out.println("ERROR...\nNO PUEDES DIVIDIR ENTRE CERO\nPOR FAVOR INGRESA OTROS VALORES");
        } else {
            resultado = mult/suma;
        }
        return resultado;
    }

    //  *** MAIN DEL PROGRAMA ***
    public static void main(String[] args){
        //  Declarar variables
        int opcionMenu;
        int[] resistenciaSerie;
        double resultado, voltaje, intensidad, resistencia;
        
        //  1. Mostrar información al usuario
        System.out.println("===== CALCULADORA BÁSICA DE CIRCUITOS ELÉCTRICOS =====");
        System.out.println("\nEscribe únicamente el número de la operación que deseas realizar.");
        System.out.println("*** NOTA. EL NÚMERO DEBE SER POSITIVO Y SIN DECIMALES ***");

        //  1.1 Pedir datos al usuario
        System.out.println("\n1. LEY DE OMH\n2. POTENCIA ELÉCTRICA\n3. RESISTENCIAS EN SERIE\n4. RESISTENCIAS EN PARALELO\n5. SALIR");
        System.out.print("\nOPCION: ");
        opcionMenu = sc.nextInt();
        sc.nextLine();

        //  2. Verificar que el usuario ingrese una opción correcta
        while ((opcionMenu<=0) || (opcionMenu>5)){
            System.err.println("*** LA OPCION INGRESADA NO EXISTE EN EL MENU\nPOR FAVOR, INGRESA OTRA OPCIÓN");
            System.out.println("\n1. LEY DE OMH\n2. POTENCIA ELÉCTRICA\n3. RESISTENCIAS EN SERIE\n4. RESISTENCIAS EN PARALELO\n5. SALIR");
            opcionMenu = sc.nextInt();
            sc.nextLine();
        }

        //  Iniciar "switch-case" con la opción ingresada del usuario
        switch(opcionMenu){
            case 1:     //  Ley de Ohm
            //  Pedir datos al usuario
                System.out.println("\n=== LEY DE OHM ===");
                System.out.print("Ingresa la intensidad: ");
                intensidad = sc.nextDouble();

                System.out.print("Ingresa la resistencia: ");
                resistencia = sc.nextDouble();
            //  Inicializar "resultados"
                resultado = OhmYPotencia(intensidad, resistencia);

            //  Mostrar los resultados
                System.out.println("\nRESULTADO DEL VOLTAJE = "+resultado);
            break;

            case 2:     //  Potencia eléctrica
            //  Pedir datos al usuario
                System.out.println("\n=== POTENCIA ELÉCTRICA ===");
                System.out.print("Ingresa el voltaje: ");
                voltaje = sc.nextDouble();

                System.out.print("Ingresa la intensidad de corriente: ");
                intensidad = sc.nextDouble();

            //  Inicializar "resultados"
                resultado = OhmYPotencia(voltaje, intensidad);

            //  Mostrar los resultados
                System.out.println("\nRESULTADO DEL VOLTAJE = "+resultado);
            break;

            case 3:     //  Resistencia en serie
            //  Pedir datos al usuario
                System.out.println("=== RESISTENCIAS EN SERIE ===");
                System.out.println("Ingresa la cantidad de n cantidad de resistencias: ");
                int cantidad = sc.nextInt();

            //  Inicializar array y resultado
                resistenciaSerie = new int[cantidad];
                resultado = resistenciaEnSerie(cantidad, resistenciaSerie);
            
            //  Mostrar los resultados
                System.out.println("RESULTADO DE LAS RESISTENCIAS EN SERIE: "+resultado);
            break;

            case 4:     //  Resistencia en paralelo
            //  Pedir datos al usuario
                System.out.println("=== RESISTENCIAS EN PARALELO ===");
            //  Ingresar las resistencias 1 y 2
                System.out.print("RESISTENCIA 1: ");
                int resistenciaA = sc.nextInt();
                System.out.print("RESISTENCIA 1: ");
                int resistenciaB = sc.nextInt();

            //  Inicializar resultado
                resultado = resistenciaEnParalelo(resistenciaA, resistenciaB);
            
            //  Mostrar los resultados
                System.out.println("RESULTADO DE LAS RESISTENCIAS EN SERIE: "+resultado);
            break;

            case 5:     //  Salir del programa
                System.out.println("USTED HA SALIDO DEL PROGRAMA...");
            break;
        }

    }

}
