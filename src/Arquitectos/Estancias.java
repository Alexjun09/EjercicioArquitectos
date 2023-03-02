package Arquitectos;

/**
 * Clase abstracta estancias la cual será heredada por las otras
 */
public abstract class Estancias {
    //declaramos los atributos
    protected String nombre;
    protected int metrosCuadrados;
    protected int numeroPuertas;
    protected int numeroVentanas;

    public Estancias() {

    }

    /**
     * constructor del objeto estancias al cual todos las clases hijo llamarán con super
     *
     * @param nom      el nombre de la estancia
     * @param metros   los metros cuadrados de la estancia
     * @param puertas  la cantidad de puertas que tiene la estancia
     * @param ventanas la cantidad de ventanas que tiene la estancia
     */
    public Estancias(String nom, int metros, int puertas, int ventanas) {
        nombre = nom;
        metrosCuadrados = metros;
        numeroPuertas = puertas;
        numeroVentanas = ventanas;
    }

    /**
     * se declara el metodo mostrarDatos que luego derivarán a los metodos individuales de cada estancia
     */
    public void mostrarDatos() {

    }

    //setters y getters
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setMetrosCuadrados(int metrosCuadrados) {
        this.metrosCuadrados = metrosCuadrados;
    }

    public void setNumeroPuertas(int numeroPuertas) {
        this.numeroPuertas = numeroPuertas;
    }

    public void setNumeroVentanas(int numeroVentanas) {
        this.numeroVentanas = numeroVentanas;
    }

    public String getNombre() {
        return nombre;
    }

    public int getMetrosCuadrados() {
        return metrosCuadrados;
    }

    public int getNumeroPuertas() {
        return numeroPuertas;
    }

    public int getNumeroVentanas() {
        return numeroVentanas;
    }
}
