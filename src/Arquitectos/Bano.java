package Arquitectos;

/**
 * Clase Bano que heredará de   la clase Estancias
 */
public class Bano extends Estancias {
    //declaramos los atributos de la clase
    protected boolean baneraODucha;

    public Bano() {

    }

    /**
     * Constructor del objeto Hall el cual hereda los atributos de la clase Estancias
     *
     * @param metros       los metros cuadrados de la estancia
     * @param puertas      la cantidad de puertas que tiene la estancia
     * @param ventanas     la cantidad de ventanas que tiene la estancia
     * @param baneraODucha si el baño tiene bañera o ducha
     */
    public Bano(int metros, int puertas, int ventanas, boolean baneraODucha) {
        super("Bano", metros, puertas, ventanas);
        this.baneraODucha = baneraODucha;
    }

    /**
     * Metodo para mostrar todos los datos del objeto
     */
    public void mostrarDatos() {
        System.out.println("El baño tiene: " + metrosCuadrados + " metros cuadrados, " + numeroPuertas + " puertas, " + numeroVentanas + " ventanas y " + isBaneraODucha());
    }

    //setters y getters
    public void setBaneraODucha(boolean baneraODucha) {
        this.baneraODucha = baneraODucha;
    }

    public String isBaneraODucha() {
        if (baneraODucha) {
            return "tiene bañera";
        } else {
            return "tiene ducha";
        }

    }
}
