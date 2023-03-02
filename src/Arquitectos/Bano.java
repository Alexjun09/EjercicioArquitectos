package Arquitectos;

public class Bano extends Estancias {
    protected boolean baneraODucha;

    public Bano() {

    }

    public Bano(int metros, int puertas, int ventanas, boolean baneraODucha) {
        super("Bano", metros, puertas, ventanas);
        this.baneraODucha = baneraODucha;
    }

    public void mostrarDatos() {
        System.out.println("El baño tiene: " + metrosCuadrados + " metros cuadrados, " + numeroPuertas + " puertas, " + numeroVentanas + " ventanas y " + isBaneraODucha());
    }

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
