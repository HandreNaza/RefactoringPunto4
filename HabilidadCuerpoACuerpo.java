package metodologiaii.segundo.tp;

public class HabilidadCuerpoACuerpo implements TipoHabilidad {

    @Override
    public double calcularDaño(double dañoBase) {
        return dañoBase;
    }

    @Override
    public String getDescripcion() {
        return "Habilidad tipo habilidad Cuerpo a cuerpo\n"
             + "Esta habilidad mantiene tu fuerza";
    }
}
