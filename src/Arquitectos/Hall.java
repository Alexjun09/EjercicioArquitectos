package Arquitectos;

/**
 * Clase Hall que heredará de   la clase Estancias
 */
public class Hall extends Estancias {
    //declaramos los atributos de la clase
    protected boolean puertaBlindada;

    public Hall() {

    }

    /**
     * Constructor del objeto Hall el cual hereda los atributos de la clase Estancias
     *
     * @param metros   los metros cuadrados de la estancia
     * @param puertas  la cantidad de puertas que tiene la estancia
     * @param ventanas la cantidad de ventanas que tiene la estancia
     * @param blindada si la estancia tiene una puerta blindada o no
     */
    public Hall(int metros, int puertas, int ventanas, boolean blindada) {
        super("Hall", metros, puertas, ventanas);
        puertaBlindada = blindada;
    }

    /**
     * Metodo para mostrar todos los datos del objeto
     */
    public void mostrarDatos() {
        System.out.println("El hall tiene: " + metrosCuadrados + " metros cuadrados, " + numeroPuertas + " puertas, " + numeroVentanas + " ventanas y " + getPuertaBlindada());
    }

    //setters y getters
    public String getPuertaBlindada() {
        if (puertaBlindada) {
            return "tiene puerta blindada";
        } else {
            return "no tiene puerta blindada";
        }
    }

    public void setPuertaBlindada(boolean puertaBlindada) {
        this.puertaBlindada = puertaBlindada;
    }
}
