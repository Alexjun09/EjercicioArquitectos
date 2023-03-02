package Arquitectos;

public class Habitacion extends Estancias {
    protected int numeroPuertasArmario;
    protected boolean accesoDirectoBano;

    public Habitacion() {

    }

    public Habitacion(int metros, int puertas, int ventanas, int armario, boolean acceso) {
        super("Habitacion", metros, puertas, ventanas);
        numeroPuertasArmario = armario;
        accesoDirectoBano = acceso;
    }

    public void mostrarDatos() {
        System.out.println("La habitacion tiene: " + metrosCuadrados + " metros cuadrados, " + numeroPuertas + " puertas, " + numeroVentanas + " ventanas, " + numeroPuertasArmario + " puertas en el armario, y " + isAccesoDirectoBano());
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
            return "tiene acceso directo al baño";
        } else {
            return "no tiene acceso directo al baño";
        }
    }
}
