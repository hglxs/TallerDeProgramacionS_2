//  Crear clase simple
class Personaje{
    int puntosDeVida = 1000;
}

public class VideoReferencias {
    public static void main(String[] args){

        System.out.println("===== SIMULADOR DE REFERENCIAS =====");

        /** 
         * Crear UN SOLO personaje en la memoria RAM
         * 'Yoya' es nuestro primer control remoto apuntando a ese personaje
        */

        Personaje yoya = new Personaje();

        /** 
         * No se crea un nuevo personaje
         * Le damos a 'yeya' la misma dirección que tiene 'yoya'
        */
        Personaje yeya = yoya;

        System.out.println("AL INICIO: ");
        System.out.println("SALUD DE YOYA: "+yoya.puntosDeVida);
        System.out.println("SALUD DE YEYA: "+yeya.puntosDeVida);

        //  Atacar a 'yeya' (usar el segundo control remoto)
        System.out.println("\n¡¡JIJO DE SU MADRE!! UN PEJELAGARTO ATACA A \"YEYA\" Y LE QUITA 40 PUNTOS DE VIDA");
        yeya.puntosDeVida = 60;

        //  Comprobar el estado de los personajes después del ataque
        System.out.println("\n===== DESPUÉS DEL ATAQUE =====");
        System.out.println("SALUD DE YOYA: "+yoya.puntosDeVida);
        System.out.println("SALUD DE YEYA: "+yeya.puntosDeVida);
    }
}
