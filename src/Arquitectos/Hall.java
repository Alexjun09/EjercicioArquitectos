package Arquitectos;

public class Hall extends Estancias {
    protected boolean puertaBlindada;

    public Hall() {

    }

    public Hall(int metros, int puertas, int ventanas, boolean blindada) {
        super("Hall", metros, puertas, ventanas);
        puertaBlindada = blindada;
    }

    public void mostrarDatos() {
        System.out.println("El hall tiene: " + metrosCuadrados + " metros cuadrados, " + numeroPuertas + " puertas, " + numeroVentanas + " ventanas y " + getPuertaBlindada());
    }

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
