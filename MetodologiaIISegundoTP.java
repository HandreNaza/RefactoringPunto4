/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package metodologiaii.segundo.tp;

import java.util.List;

/**
 *
 * @author handr
 */
public class MetodologiaIISegundoTP {

    public static void main(String[] args) {
        Personaje mago = new Personaje(
            "Mago", 10, new HabilidadMagica()
        );

        Personaje guerrero = new Personaje(
            "Guerrero", 15, new HabilidadCuerpoACuerpo()
        );

        Videojuego juego = new Videojuego(List.of(mago, guerrero));

        juego.imprimirInfo(mago);
        System.out.println();

        juego.imprimirInfo(guerrero);
        System.out.println();

        Personaje ganador = juego.personajeConMasDaño();

        System.out.println(
            "El personaje con más daño es: " + ganador.getNombre()
        );
    }
    
}
