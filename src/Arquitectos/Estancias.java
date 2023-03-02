package Arquitectos;


public abstract class Estancias {
    protected String nombre;
    protected int metrosCuadrados;
    protected int numeroPuertas;
    protected int numeroVentanas;

    public Estancias() {

    }

    public Estancias(String nom, int metros, int puertas, int ventanas) {
        nombre = nom;
        metrosCuadrados = metros;
        numeroPuertas = puertas;
        numeroVentanas = ventanas;
    }

    public void mostrarDatos() {

    }

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
