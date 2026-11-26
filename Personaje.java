package metodologiaii.segundo.tp;

public class Personaje {

    private String nombre;
    private double daño;
    private TipoHabilidad tipoHabilidad;

    public Personaje(String nombre, double daño, TipoHabilidad tipoHabilidad) {
        this.nombre = nombre;
        this.daño = daño;
        this.tipoHabilidad = tipoHabilidad;
    }

    public String getNombre() {
        return nombre;
    }

    public double getDaño() {
        return daño;
    }

    public TipoHabilidad getTipoHabilidad() {
        return tipoHabilidad;
    }
}
