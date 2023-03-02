package Arquitectos;

import java.util.Scanner;

public class Casa {
    static Scanner sc = new Scanner(System.in);

    static Hall hall1;
    static Cocina cocina1;
    static Salon salon1;
    static Habitacion habitacion1;
    static Bano bano1;

    public static void hall() {
        System.out.println("Cuantos metros cuadrados tiene el hall?");
        int metros = -1;
        do {
            try {
                metros = Integer.parseInt(sc.nextLine());
            } catch (NumberFormatException ex) {
                System.out.println("Valor introducido no valido, tiene que ser un numero mayor que 0");
            }
        } while (metros <= 0);
        System.out.println("Cuantas puertas tiene el Hall?");
        int puertas = -1;
        do {
            try {
                puertas = Integer.parseInt(sc.nextLine());
            } catch (NumberFormatException ex) {
                System.out.println("Valor introducido no valido, tiene que ser un numero positivo");
            }
        } while (puertas < 0);
        System.out.println("Cuantas ventanas tiene el Hall?");
        int ventanas = -1;
        do {
            try {
                ventanas = Integer.parseInt(sc.nextLine());
            } catch (NumberFormatException ex) {
                System.out.println("Valor introducido no valido, tiene que ser un numero positivo");
            }
        } while (ventanas < 0);
        System.out.println("Tiene el Hall una puerta blindada? (si/no)");
        String input = sc.nextLine();
        boolean puertaBlindada;
        if (input.equals("si")) {
            puertaBlindada = true;
        } else {
            puertaBlindada = false;
        }
        hall1 = new Hall(metros, puertas, ventanas, puertaBlindada);
    }

    public static void cocina() {
        System.out.println("Cuantos metros cuadrados tiene la cocina?");
        int metros = -1;
        do {
            try {
                metros = Integer.parseInt(sc.nextLine());
            } catch (NumberFormatException ex) {
                System.out.println("Valor introducido no valido, tiene que ser un numero mayor que 0");
            }
        } while (metros <= 0);
        System.out.println("Cuantas puertas tiene la cocina?");
        int puertas = -1;
        do {
            try {
                puertas = Integer.parseInt(sc.nextLine());
            } catch (NumberFormatException ex) {
                System.out.println("Valor introducido no valido, tiene que ser un numero positivo");
            }
        } while (puertas < 0);
        System.out.println("Cuantas ventanas tiene la cocina?");
        int ventanas = -1;
        do {
            try {
                ventanas = Integer.parseInt(sc.nextLine());
            } catch (NumberFormatException ex) {
                System.out.println("Valor introducido no valido, tiene que ser un numero positivo");
            }
        } while (ventanas < 0);
        System.out.println("Tiene la cocina un tendedero? (si/no)");
        String input = sc.nextLine();
        boolean tendedero;
        int metrosTendedero;
        if (input.equals("si")) {
            tendedero = true;
            System.out.println("Cuantos metros tiene el tendedero?");
            metrosTendedero = -1;
            do {
                try {
                    metrosTendedero = Integer.parseInt(sc.nextLine());
                } catch (NumberFormatException ex) {
                    System.out.println("Valor introducido no valido, tiene que ser un numero positivo");
                }
            } while (metrosTendedero < 0);
        } else {
            tendedero = false;
            metrosTendedero = 0;
        }
        cocina1 = new Cocina(metros, puertas, ventanas, tendedero, metrosTendedero);
    }

    public static void salon() {
        System.out.println("Cuantos metros cuadrados tiene el salon?");
        int metros = -1;
        do {
            try {
                metros = Integer.parseInt(sc.nextLine());
            } catch (NumberFormatException ex) {
                System.out.println("Valor introducido no valido, tiene que ser un numero mayor que 0");
            }
        } while (metros <= 0);
        System.out.println("Cuantas puertas tiene el salon?");
        int puertas = -1;
        do {
            try {
                puertas = Integer.parseInt(sc.nextLine());
            } catch (NumberFormatException ex) {
                System.out.println("Valor introducido no valido, tiene que ser un numero positivo");
            }
        } while (puertas < 0);
        System.out.println("Cuantas ventanas tiene el salon?");
        int ventanas = -1;
        do {
            try {
                ventanas = Integer.parseInt(sc.nextLine());
            } catch (NumberFormatException ex) {
                System.out.println("Valor introducido no valido, tiene que ser un numero positivo");
            }
        } while (ventanas < 0);
        System.out.println("Tiene la cocina una terraza? (si/no)");
        String input = sc.nextLine();
        boolean terraza;
        int metrosTerraza;
        if (input.equals("si")) {
            terraza = true;
            System.out.println("Cuantos metros tiene la terraza?");
            metrosTerraza = -1;
            do {
                try {
                    metrosTerraza = Integer.parseInt(sc.nextLine());
                } catch (NumberFormatException ex) {
                    System.out.println("Valor introducido no valido, tiene que ser un numero positivo");
                }
            } while (metrosTerraza < 0);
        } else {
            terraza = false;
            metrosTerraza = 0;
        }
        System.out.println("Cuantas tomas tiene el salon?");
        int tomas = -1;
        do {
            try {
                tomas = Integer.parseInt(sc.nextLine());
            } catch (NumberFormatException ex) {
                System.out.println("Valor introducido no valido, tiene que ser un numero positivo");
            }
        } while (tomas < 0);
        salon1 = new Salon(metros, puertas, ventanas, tomas, terraza, metrosTerraza);
    }

    public static void habitacion() {
        System.out.println("Cuantos metros cuadrados tiene la habitacion?");
        int metros = -1;
        do {
            try {
                metros = Integer.parseInt(sc.nextLine());
            } catch (NumberFormatException ex) {
                System.out.println("Valor introducido no valido, tiene que ser un numero mayor que 0");
            }
        } while (metros <= 0);
        System.out.println("Cuantas puertas tiene la habitacion?");
        int puertas = -1;
        do {
            try {
                puertas = Integer.parseInt(sc.nextLine());
            } catch (NumberFormatException ex) {
                System.out.println("Valor introducido no valido, tiene que ser un numero positivo");
            }
        } while (puertas < 0);
        System.out.println("Cuantas ventanas tiene la habitacion?");
        int ventanas = -1;
        do {
            try {
                ventanas = Integer.parseInt(sc.nextLine());
            } catch (NumberFormatException ex) {
                System.out.println("Valor introducido no valido, tiene que ser un numero positivo");
            }
        } while (ventanas < 0);
        System.out.println("Tiene la habitacion acceso directo a un baño? (si/no)");
        String input = sc.nextLine();
        boolean accesoBano;
        if (input.equals("si")) {
            accesoBano = true;
        } else {
            accesoBano = false;
        }
        System.out.println("Cuantas puertas tiene el armario de la habitacion?");
        int puertasArmario = -1;
        do {
            try {
                puertasArmario = Integer.parseInt(sc.nextLine());
            } catch (NumberFormatException ex) {
                System.out.println("Valor introducido no valido, tiene que ser un numero positivo");
            }
        } while (puertasArmario < 0);
        habitacion1 = new Habitacion(metros, puertas, ventanas, puertasArmario, accesoBano);
    }

    public static void bano() {
        System.out.println("Cuantos metros cuadrados tiene el baño?");
        int metros = -1;
        do {
            try {
                metros = Integer.parseInt(sc.nextLine());
            } catch (NumberFormatException ex) {
                System.out.println("Valor introducido no valido, tiene que ser un numero mayor que 0");
            }
        } while (metros <= 0);
        System.out.println("Cuantas puertas tiene el baño?");
        int puertas = -1;
        do {
            try {
                puertas = Integer.parseInt(sc.nextLine());
            } catch (NumberFormatException ex) {
                System.out.println("Valor introducido no valido, tiene que ser un numero positivo");
            }
        } while (puertas < 0);
        System.out.println("Cuantas ventanas tiene el baño?");
        int ventanas = -1;
        do {
            try {
                ventanas = Integer.parseInt(sc.nextLine());
            } catch (NumberFormatException ex) {
                System.out.println("Valor introducido no valido, tiene que ser un numero positivo");
            }
        } while (ventanas < 0);
        System.out.println("El baño tiene bañera o ducha? (banera/ducha)");
        String input = sc.nextLine();
        boolean baneraDucha;
        if (input.equals("banera")) {
            baneraDucha = true;
        } else {
            baneraDucha = false;
        }
        bano1 = new Bano(metros, puertas, ventanas, baneraDucha);
    }

    public static int calcularMetrosCuadrados() {
        int metrosCuadrados = 0;

        int hall = hall1.getMetrosCuadrados();
        int cocina = cocina1.getMetrosCuadrados();
        int salon = salon1.getMetrosCuadrados();
        int bano = bano1.getMetrosCuadrados();
        int habitacion = habitacion1.getMetrosCuadrados();
        int terraza = salon1.getMetrosTerraza();
        int tendedero = cocina1.getMetrosTendedero();

        metrosCuadrados = hall + cocina + salon + bano + habitacion + terraza + tendedero;

        return metrosCuadrados;
    }

    public static void imprimirDatos() {
        hall1.mostrarDatos();
        cocina1.mostrarDatos();
        salon1.mostrarDatos();
        habitacion1.mostrarDatos();
        bano1.mostrarDatos();
    }

    public static void main(String[] args) {
        System.out.println("**Inicializando el programa de medicion de metro cuadrados**");
        System.out.println();
        hall();
        System.out.println();
        cocina();
        System.out.println();
        salon();
        System.out.println();
        habitacion();
        System.out.println();
        bano();
        System.out.println();
        imprimirDatos();
        System.out.println();
        System.out.println("La casa tiene " + calcularMetrosCuadrados() + " metros cudrados");
    }
}
