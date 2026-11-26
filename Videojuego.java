package metodologiaii.segundo.tp;

import java.util.List;

public class Videojuego {

    private List<Personaje> personajes;

    public Videojuego(List<Personaje> personajes) {
        this.personajes = personajes;
    }

    private double calcularDaño(Personaje p) {
        return p.getTipoHabilidad().calcularDaño(p.getDaño());
    }

    public Personaje personajeConMasDaño() {
        Personaje temp = null;
        double max = 0;

        for (Personaje p : personajes) {
            double daño = calcularDaño(p);

            if (daño > max) {
                temp = p;
                max = daño;
            }
        }

        return temp;
    }

    public void imprimirInfo(Personaje p) {
        System.out.println(p.getNombre() + " tiene como daño " + p.getDaño());
        System.out.println(p.getTipoHabilidad().getDescripcion());
    }
}
