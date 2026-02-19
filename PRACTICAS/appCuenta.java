package PRACTICAS;
import java.util.Scanner;

public class appCuenta {
    public static void main(String[] args){
        //  Declarar variables
        Scanner sc = new Scanner(System.in);
        String tit, option, input;
        double ingreso, retiro;

        //  Pedir al usuario que ingrese su nombre para nombrar su cuenta
        System.out.println("Por favor ingrese su nombre completo para abrir su cuenta");
        tit = sc.nextLine().trim().toUpperCase();
        //  Declarar cuenta e iniciarla con el nombre del titular
        Cuenta cuentaUno = new Cuenta(tit, 0);
        System.out.println();

        //  Preguntar al ususario qué desea hacer con su cuenta
        System.out.println("USTED DISPONE DE 5000 MXN POR HABER INICIADO UNA CUENTA CON NOSOTROS");
        System.out.println("¿QUÉ DESEA HACER?\nESCRIBA SÓLO EL NÚMERO DE LA OPERACIÓN QUE DESEA REALIZAR");
        System.out.println("1. INGRESAR DINERO\n2. RETIRAR DINERO\n3. CONSULTAR ESTADO DE CUENTA\n4. SALIR DE LA APLICACIÓN");

        //  El usuario ingresa la opción que desea y se evalua con un swtich/case
        option = sc.nextLine().trim();
        System.out.println();
        switch(option){
            //  Ingresar dinero
            case "1":
                System.out.print("CANTIDAD A INGRESAR A LA CUENTA: ");
                input = sc.nextLine().trim();
                ingreso = Double.parseDouble(input);
                cuentaUno.ingresar(ingreso);
                System.out.println();
                System.out.println(cuentaUno);
                break;
            //  Retirar dinero
            case "2":
                System.out.print("CANTIDAD A RETIRAR DE LA CUENTA: ");    
                input = sc.nextLine().trim();
                retiro = Double.parseDouble(input);
                cuentaUno.retirar(retiro);
                System.out.println();
                System.out.println(cuentaUno);
                break;
            //  Consultar estado de cuenta
            case "3":
                System.out.println("TITULAR DE LA CUENTA: "+tit);
                System.out.println("CANTIDAD DE LA CUENTA: "+5000);
                System.out.println(cuentaUno);
                break;
            //  Salir de la aplciación
            case "4":    
                System.out.println("GRACIAS POR INGRESAR...");
                break;
            //  Default en caso de no ser correcta la opción
            default:
                System.err.println("LO SENTIMOS, LA OPCIÓN INGRESADA NO ES CORRECTA\nPOR FAVOR, VUELVE A INICIAR EL PROGRAMA...");
                break;
        }

        // Cerrar Scanner "sc"
        sc.close();
    }
}
