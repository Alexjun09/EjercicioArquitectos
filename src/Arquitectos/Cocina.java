package Arquitectos;

public class Cocina extends Estancias {
    protected boolean tendedero;
    protected int metrosTendedero;

    public Cocina() {

    }

    public Cocina(int metros, int puertas, int ventanas, boolean tendedero, int metrosTendedero) {
        super("Cocina", metros, puertas, ventanas);
        this.tendedero = tendedero;
        this.metrosTendedero = metrosTendedero;
    }

    public void mostrarDatos() {
        if (tendedero) {
            System.out.println("La cocina tiene: " + metrosCuadrados + " metros cuadrados, " + numeroPuertas + " puertas, " + numeroVentanas + " ventanas, y " + metrosTendedero + " metros de tendedero");
        } else {
            System.out.println("La cocina tiene: " + metrosCuadrados + " metros cuadrados, " + numeroPuertas + " puertas, " + numeroVentanas + " ventanas, y no tiene tendedero");
        }
    }

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
