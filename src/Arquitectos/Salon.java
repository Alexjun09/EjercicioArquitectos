package Arquitectos;

public class Salon extends Estancias {
    protected int numeroTomas;
    protected boolean terraza;
    protected int metrosTerraza;

    public Salon() {

    }

    public Salon(int metros, int puertas, int ventanas, int tomas, boolean terr, int metrosTerraza) {
        super("Salon", metros, puertas, ventanas);
        numeroTomas = tomas;
        terraza = terr;
        this.metrosTerraza = metrosTerraza;
    }

    public void mostrarDatos() {
        if (terraza) {
            System.out.println("El salon tiene: " + metrosCuadrados + " metros cuadrados, " + numeroPuertas + " puertas, " + numeroVentanas + " ventanas, " + numeroTomas + " tomas de corriente y " + metrosTerraza + " metros de terraza");
        } else {
            System.out.println("El salon tiene: " + metrosCuadrados + " metros cuadrados, " + numeroPuertas + " puertas, " + numeroVentanas + " ventanas, " + numeroTomas + " tomas de corriente y  no tiene terraza");
        }
    }

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
