import java.util.Scanner;

public class PerfilUsuario {
    public static void main(String[] args){
        // Declarar Scanner "read"
        Scanner read = new Scanner(System.in);

        //
        System.out.println("NOMBRE: ");
        String nombre = read.nextLine();

        //
        System.out.println("EDAD: ");
        int edad = read.nextInt();

        //
        System.out.println("ESTATURA (m): ");
        double estatura = read.nextDouble();

        //
        System.out.println("\n----- PERFIL -----");
        System.out.println("NOMBRE: "+nombre);
        System.out.println("EDAD: "+edad);
        System.out.println("ESTATURA: "+estatura);

        //
        read.close();
    }
}
