package Arquitectos;

public class Cocina extends Estancias {
    protected boolean tendedero;
    protected int metrosTendedero;

    public Cocina() {

    }

    public Cocina(String nombre, int metros, int puertas, int ventanas, boolean tendedero, int metrosTendedero) {
        super(nombre, metros, puertas, ventanas);
        this.tendedero = tendedero;
        this.metrosTendedero = metrosTendedero;
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
        if (tendedero){
            return "Tiene tendedero";
        }else{
            return "No tiene tendedero";
        }
    }
}
