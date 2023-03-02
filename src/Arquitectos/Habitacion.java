package Arquitectos;

public class Habitacion extends Estancias {
    protected int numeroPuertasArmario;
    protected boolean accesoDirectoBano;

    public Habitacion() {

    }

    public Habitacion(String nombre, int metros, int puertas, int ventanas, int armario, boolean acceso) {
        super(nombre, metros, puertas, ventanas);
        numeroPuertasArmario = armario;
        accesoDirectoBano = acceso;
    }

    public void setAccesoDirectoBano(boolean accesoDirectoBano) {
        this.accesoDirectoBano = accesoDirectoBano;
    }

    public void setNumeroPuertasArmario(int numeroPuertasArmario) {
        this.numeroPuertasArmario = numeroPuertasArmario;
    }

    public int getNumeroPuertasArmario() {
        return numeroPuertasArmario;
    }

    public String isAccesoDirectoBano() {
        if (accesoDirectoBano) {
            return "Tiene acceso directo al baño";
        } else {
            return "No tiene acceso directo al baño";
        }
    }
}
