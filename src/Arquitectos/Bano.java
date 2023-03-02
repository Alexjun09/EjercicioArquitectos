package Arquitectos;

public class Bano extends Estancias {
    protected boolean baneraODucha;

    public Bano() {

    }

    public Bano(String nombre, int metros, int puertas, int ventanas, boolean baneraODucha) {
        super(nombre, metros, puertas, ventanas);
        this.baneraODucha = baneraODucha;
    }

    public void setBaneraODucha(boolean baneraODucha) {
        this.baneraODucha = baneraODucha;
    }

    public String isBaneraODucha() {
        if (baneraODucha) {
            return "Tiene bañera";
        } else {
            return "Tiene ducha";
        }

    }
}
