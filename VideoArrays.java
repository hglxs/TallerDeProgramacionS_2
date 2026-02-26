//  Importar Scanner
import java.util.Scanner;

public class VideoArrays {

    public static void main(String[] args){
        //  Declarar variables
        Scanner sc = new Scanner(System.in);
        int[] edades;
        int cantidad;

        //  Mostrar información al usuario
        System.out.println("\n===== EDADES DE ALUMNOS =====");
        System.out.println("INGRESE LA CANTIDAD DE ALUMNOS QUE DESEA REGISTRAR SUS EDADES: ");

        //  Ingresar datos del usuario
        System.out.print("\nCANTIDAD DE ALUMNOS: ");
        cantidad = sc.nextInt();
        sc.nextLine();          //  Limpiar Scanner

        //  Inicializar array "edades"
        edades = new int[cantidad];

        //  Iniciar ciclo "for" para el ingreso de las edades
        for (int i=0; i<edades.length; i++){
            System.out.print("\nINGRESA LA EDAD DEL ALUMNO "+(i+1)+": ");
            edades[i] = sc.nextInt();
        }

        //  Iniciar ciclo "for" para mostrar los resultados al usuario
        for(int i=0; i<edades.length; i++){
            System.out.println("EDAD DEL ALUMNO "+(i+1)+": "+edades[i]+" AÑOS");
        }

        //  Cerrar Scanner
        sc.close();
    }
}
