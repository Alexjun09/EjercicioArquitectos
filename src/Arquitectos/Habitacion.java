package Arquitectos;

/**
 * Clase Habitacion que heredará de   la clase Estancias
 */
public class Habitacion extends Estancias {
    //declaramos los atributos de la clase
    protected int numeroPuertasArmario;
    protected boolean accesoDirectoBano;

    public Habitacion() {

    }

    /**
     * Constructor del objeto Habitacion el cual hereda los atributos de la clase Estancias
     *
     * @param metros   los metros cuadrados de la estancia
     * @param puertas  la cantidad de puertas que tiene la estancia
     * @param ventanas la cantidad de ventanas que tiene la estancia
     * @param armario  la cantidad de puertas que tiene el armario empotrado
     * @param acceso   si la abitacion tiene acceso directo al baño o no
     */
    public Habitacion(int metros, int puertas, int ventanas, int armario, boolean acceso) {
        super("Habitacion", metros, puertas, ventanas);
        numeroPuertasArmario = armario;
        accesoDirectoBano = acceso;
    }

    /**
     * Metodo para mostrar todos los datos del objeto
     */
    public void mostrarDatos() {
        System.out.println("La habitacion tiene: " + metrosCuadrados + " metros cuadrados, " + numeroPuertas + " puertas, " + numeroVentanas + " ventanas, " + numeroPuertasArmario + " puertas en el armario, y " + isAccesoDirectoBano());
    }

    //setters y getters
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
