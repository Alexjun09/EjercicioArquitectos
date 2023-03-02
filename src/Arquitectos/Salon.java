package Arquitectos;

/**
 * Clase Salon que heredará de   la clase Estancias
 */
public class Salon extends Estancias {
    //declaramos los atributos de la clase
    protected int numeroTomas;
    protected boolean terraza;
    protected int metrosTerraza;

    public Salon() {

    }

    /**
     * Constructor del objeto Salon el cual hereda los atributos de la clase Estancias
     *
     * @param metros        los metros cuadrados de la estancia
     * @param puertas       la cantidad de puertas que tiene la estancia
     * @param ventanas      la cantidad de ventanas que tiene la estancia
     * @param tomas         la cantidad de tomas que tiene el salon
     * @param terr          si el salon tiene terraza o no
     * @param metrosTerraza la cantidad de metros que tiene la terraza
     */
    public Salon(int metros, int puertas, int ventanas, int tomas, boolean terr, int metrosTerraza) {
        super("Salon", metros, puertas, ventanas);
        numeroTomas = tomas;
        terraza = terr;
        this.metrosTerraza = metrosTerraza;
    }

    /**
     * Metodo para mostrar todos los datos del objeto, en caso en el que haya terraza y en el caso contrario
     */
    public void mostrarDatos() {
        if (terraza) {
            System.out.println("El salon tiene: " + metrosCuadrados + " metros cuadrados, " + numeroPuertas + " puertas, " + numeroVentanas + " ventanas, " + numeroTomas + " tomas de corriente y " + metrosTerraza + " metros de terraza");
        } else {
            System.out.println("El salon tiene: " + metrosCuadrados + " metros cuadrados, " + numeroPuertas + " puertas, " + numeroVentanas + " ventanas, " + numeroTomas + " tomas de corriente y  no tiene terraza");
        }
    }

    //setters y getters
    public void setMetrosTerraza(int metrosTerraza) {
        this.metrosTerraza = metrosTerraza;
    }

    public void setNumeroTomas(int numeroTomas) {
        this.numeroTomas = numeroTomas;
    }

    public void setTerraza(boolean terraza) {
        this.terraza = terraza;
    }

    public int getMetrosTerraza() {
        return metrosTerraza;
    }

    public int getNumeroTomas() {
        return numeroTomas;
    }

    public String terraza() {
        if (terraza) {
            return "Tiene terraza";
        } else {
            return "No tiene terraza";
        }
    }
}
