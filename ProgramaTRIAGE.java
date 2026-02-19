import java.util.Scanner;

public class ProgramaTRIAGE{
    //  Declarar el Scanner "sc" como variable global
    public static Scanner sc = new Scanner(System.in);

    /**
     * Método "PAM"
     *  El método va a regresar un double, donde va a utilizar los datos de:
     *      1. Presión Sistólica
     *      2. Presión Diastólica
     *  Su retorno será --> PAM = (pSistolica + (2*pDiastolica))/3
     */
    public static double PAM(int pSistolica, int pDiastolica){
        return (pSistolica+(2*pDiastolica))/3.0;
    }

    /**
     * Método "Clasificación TRIAGE"
     *  El método va a clasificar en qué categoría de TRIAGE se van a ubicar los pacientes ingresados. Las categorías son:
     *      1. ROJO
     *          1.1 Si la presión sistólica es menor que 90
     *          1.2 Ó la temperatura es mayor o igual a 39.0
     *          1.3 Ó la frecuencia cardiaca es mayor o igual a 130
     *      2. AMARILLO
     *          2.1 Si la edad es mayor o igual a 65
     *          2.2 Ó la temperatura es mayor o igual a 38.0 y menor a 39.0
     *          2.3 Ó la frecuencia cardiaca está entre 110 y 129
     *      3. VERDE
     *          3.1 Cualquier otro caso
     * 
     */
    public static String clasificacionTRIAGE(int pSistolica, double temperatura, int frecuencia, int edad){
        if ((pSistolica < 90) || (temperatura >= 39.0) || (frecuencia >= 130)){
            return "rojo";
        } else if ((edad >= 65) || (temperatura>=38.0 && temperatura<39.0) || (frecuencia>=110 && frecuencia<=129)){
            return "amarillo";
        } else {
            return "verde";
        }
    }

    //  Método principal (MAIN)
    public static void main(String[] args){
        /**
         *  Declarar las variables para que el usuario ingrese los siguientes datos:
         *      1. Número del paciente (int)
         *      2. Nombre del paciente (String)
         *      3. Edad del paciente (int)
         *      4. Temperatura del paciente (double)
         *      5. Frecuencia cardiaca (int)
         *      6. Presión sistólica (int)
         *      7. Presión diastólica (int)
         */
        int numeroPaciente, edadPaciente, frecuencia, pSistolica, pDiastolica;
        int rojo=0, amarillo=0, verde=0;
        double temperatura, pam;
        String nombre, clasificacion;

        System.out.println("\n===== PROGRMA DE CLASIFICACION =====");
        System.out.println("INGRESA EL NUMERO DE PACIENTES");

        System.out.print("Numero de pacientes: ");
        numeroPaciente = sc.nextInt();
        sc.nextLine();

        //  Iniciar el ciclo "for"
        for (int i=0; i<numeroPaciente; i++){
            System.out.print("\nNombre del Paciente #"+(i+1)+": ");
            nombre = sc.nextLine().trim();

            System.out.print("\nEdad del Paciente #"+(i+1)+(": "));
            edadPaciente = sc.nextInt();

            System.out.print("\nTemperatura del Paciente #"+(i+1)+(": "));
            temperatura = sc.nextDouble();

            System.out.print("\nFrecuencia cardiaca del Paciente #"+(i+1)+(": "));
            frecuencia = sc.nextInt();

            System.out.print("\nPresion sistolica del Paciente #"+(i+1)+(": "));
            pSistolica = sc.nextInt();

            System.out.print("\nPresion diastolica del Paciente #"+(i+1)+(": "));
            pDiastolica = sc.nextInt();
            sc.nextLine();

            pam = PAM(pSistolica, pDiastolica);
            System.out.print("\nPresion Arterial Media del Paciente #"+(i+1)+": "+pam);

            System.out.println();
            clasificacion = clasificacionTRIAGE(pSistolica, temperatura, frecuencia, edadPaciente);
            if (clasificacion.equals("rojo")){
                rojo++;
            }
            if (clasificacion.equals("amarillo")){
                amarillo++;
            }
            if (clasificacion.equals("verde")){
                verde++;
            }
        } 

        System.out.println("\n===== CLASIFICACION DE TRIAGE =====");
        System.out.println("TOTAL DE CASOS ROJOS: "+rojo);
        System.out.println("TOTAL DE CASOS AMARILLOS: "+amarillo);
        System.out.println("TOTAL DE CASOS VERDES: "+verde);

        /*System.out.print("\nNombre del Paciente: ");
        nombre = sc.nextLine().trim();

        System.out.print("\nEdad del Paciente: ");
        edadPaciente = sc.nextInt();

        System.out.print("\nTemperatura del Paciente: ");
        temperatura = sc.nextDouble();

        System.out.print("\nFrecuencia cardiaca del Paciente: ");
        frecuencia = sc.nextInt();

        System.out.print("\nPresion sistolica del Paciente: ");
        pSistolica = sc.nextInt();

        System.out.print("\nPresion diastolica del Paciente: ");
        pDiastolica = sc.nextInt();

        //  Prueba del método PAM
        double pam = PAM(pSistolica, pDiastolica);
        System.out.println("PAM: "+pam);

        //  Prueba del método "Clasificación TRIAGE"
        String clasificacion = clasificacionTRIAGE(pSistolica, temperatura, frecuencia, edadPaciente);
        System.out.println("CLASIFICACION: "+clasificacion);
        
        /*  Prueba de código
        System.out.println("\nNUMERO DE PACIENTES: "+numeroPaciente);
        System.out.println("NOMBRE: "+nombre);
        System.out.println("EDAD: "+edadPaciente);
        System.out.println("TEMPERATURA: "+temperatura+"°C");
        System.out.println("FRECUENCIA CARDIACA: "+frecuencia);
        System.out.println("PRESION SISTOLICA: "+pSistolica);
        System.out.println("PRESION DIASTOLICA: "+pDiastolica);*/
    }

}