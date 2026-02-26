//  Importar herramientas de Java
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.io.IOException;

public class VideoArchivo {
    public static void main(String[] args){

        //  Definir la "ruta" y el nombre del archivo
        Path rutaDelArchivo = Paths.get("puntaje_juego.txt");

        //  Definir el dato que queremos salvar de la destrucción al cerrar el programa
        String datosAGuardar = "Jugador: LaKnakaa | Record: 1309";
        System.out.println("===== SIMULADOR DE GUARDADO =====");

        /** 
         * Cuando trabajamos en JAVA con archivos físicos, debemos usar un bloque "try-catch"
         * Esto es porque el Disco Duro podría fallar, estar lleno o no tener permisos
        */
        
        try {
            //  ESCRITURA (PERSISTENCIA): Mandar el texto a la RAM del Disco Duro
            Files.writeString(rutaDelArchivo, datosAGuardar);
            System.out.println("1. ¡PARTIDA GUARDADA! SE CREO EL ARCHIVO: "+rutaDelArchivo);

            //  LECTURA: Traer el texto del Disco Duro de vulta a la RAM
            String datosLeidos = Files.readString(rutaDelArchivo);
            System.out.println("2. CARGANDO PARTIDA DESDE EL DISCO...");
            System.out.println("3. INFORMACION RECUPERADA: "+datosLeidos);

        } catch(IOException e) {
            System.out.println("UPS, HUBO UN PROBLEMA CON EL ARCHIVO: "+e.getMessage());
        }
    }
}
