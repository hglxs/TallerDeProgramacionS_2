//  importar Scanner
import java.util.Scanner;

//  Crear el registro "mascota"
record Mascota(String nombre, int edad, double peso){}

public class VideoRegistros {
    public static void main(String[] args){
        //  Declarar las variables
        Scanner sc = new Scanner(System.in);
        String nombre;
        int edad;
        double peso;

        //  Declarar una nueva mascota
        Mascota perro;

        //  Mostrar la información al usuario
        System.out.println("\n===== REGISTRO DE MASCOTA =====");
        System.out.println("INGRESA LOS DATOS DE TU MASCOTA");
        
        //  Pedir datos al usuario
        System.out.print("\nNOMBRE: ");
        nombre = sc.nextLine();

        System.out.print("EDAD: ");
        edad = sc.nextInt();
        sc.nextLine();          //  Limpiar Scanner

        System.out.print("PESO: ");
        peso = sc.nextDouble();
        sc.nextLine();          //  Limpiar Scanner

        //  Inicializar la mascota con los datos ingresados por el usuario
        perro = new Mascota(nombre, edad, peso);

        //  Mostrar el registro completo de la mascota
        System.out.println("\n===== REGISTRO DE LA MASCOTA ===== ");
        System.out.println("DATOS DE LA MASCOTA: "+perro);

        //  Mostrar una sola variable del registro
        System.out.println("\n===== DATOS INDIVIDUALES =====");
        System.out.println("NOMBRE: "+perro.nombre());
        System.out.println("EDAD: "+perro.edad());
        System.out.println("PESO: "+perro.peso());

        //  Cerrar Scanner
        sc.close();
    }
}
