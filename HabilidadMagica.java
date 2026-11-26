package metodologiaii.segundo.tp;

public class HabilidadMagica implements TipoHabilidad {

    @Override
    public double calcularDaño(double dañoBase) {
        return dañoBase * 2;
    }

    @Override
    public String getDescripcion() {
        return "Habilidad tipo habilidad mágica\n"
             + "Esta habilidad dobla tu fuerza";
    }
}
