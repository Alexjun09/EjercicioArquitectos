package Arquitectos;

public class Hall extends Estancias {
    protected boolean puertaBlindada;

    public Hall() {

    }

    public Hall(String nombre, int metros, int puertas, int ventanas, boolean blindada) {
        super(nombre, metros, puertas, ventanas);
        puertaBlindada = blindada;
    }

    public String getPuertaBlindada() {
        if (puertaBlindada) {
            return "Tiene puerta blindada";
        } else {
            return "No tiene puerta blindada";
        }
    }

    public void setPuertaBlindada(boolean puertaBlindada) {
        this.puertaBlindada = puertaBlindada;
    }
}
