package Arquitectos;

/**
 * Clase Cocina que heredará de   la clase Estancias
 */
public class Cocina extends Estancias {
    //declaramos los atributos de la clase
    protected boolean tendedero;
    protected int metrosTendedero;

    public Cocina() {

    }

    /**
     * Constructor del objeto Cocina el cual hereda los atributos de la clase Estancias
     *
     * @param metros          los metros cuadrados de la estancia
     * @param puertas         la cantidad de puertas que tiene la estancia
     * @param ventanas        la cantidad de ventanas que tiene la estancia
     * @param tendedero       si tiene la cocina un tendedero o no
     * @param metrosTendedero la cantidad de metros que tiene el tendedero
     */
    public Cocina(int metros, int puertas, int ventanas, boolean tendedero, int metrosTendedero) {
        super("Cocina", metros, puertas, ventanas);
        this.tendedero = tendedero;
        this.metrosTendedero = metrosTendedero;
    }

    /**
     * Metodo para mostrar todos los datos del objeto, en caso en el que haya tendedero y en el caso contrario tambien
     */
    public void mostrarDatos() {
        if (tendedero) {
            System.out.println("La cocina tiene: " + metrosCuadrados + " metros cuadrados, " + numeroPuertas + " puertas, " + numeroVentanas + " ventanas, y " + metrosTendedero + " metros de tendedero");
        } else {
            System.out.println("La cocina tiene: " + metrosCuadrados + " metros cuadrados, " + numeroPuertas + " puertas, " + numeroVentanas + " ventanas, y no tiene tendedero");
        }
    }

    //setters y getters
    public void setMetrosTendedero(int metrosTendedero) {
        this.metrosTendedero = metrosTendedero;
    }

    public void setTendedero(boolean tendedero) {
        this.tendedero = tendedero;
    }

    public int getMetrosTendedero() {
        return metrosTendedero;
    }

    public String getTendedero() {
        if (tendedero) {
            return "Tiene tendedero";
        } else {
            return "No tiene tendedero";
        }
    }
}
