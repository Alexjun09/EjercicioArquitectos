package Arquitectos;

public class Salon extends Estancias {
    protected int numeroTomas;
    protected boolean terraza;
    protected int metrosTerraza;

    public Salon() {

    }

    public Salon(String nombre, int metros, int puertas, int ventanas, int tomas, boolean terr, int metrosTerraza) {
        super(nombre, metros, puertas, ventanas);
        numeroTomas = tomas;
        terraza = terr;
        this.metrosTerraza = metrosTerraza;
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
