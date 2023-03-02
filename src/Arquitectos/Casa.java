package Arquitectos;

import java.util.Scanner;

public class Casa {
    //declaramos las variables globales para que sean accesibles desde todos los metodos
    static Scanner sc = new Scanner(System.in);

    static Hall hall1;
    static Cocina cocina1;
    static Salon salon1;
    static Habitacion habitacion1;
    static Bano bano1;

    /**
     * Metodo hall el cual preguntará por todos los datos, los alamacenará, verificará que son correctos y finalmente llamará al constructor correspondiente con los datos
     */
    public static void hall() {
        //preguntamos por los datos y los almacenamos en las variables
        System.out.println("Cuantos metros cuadrados tiene el hall?");
        int metros = -1;
        //verificamos que el valor introducido es un numero y mayor a 0
        do {
            try {
                metros = Integer.parseInt(sc.nextLine());
            } catch (NumberFormatException ex) {
                System.out.println("Valor introducido no valido, tiene que ser un numero mayor que 0");
            }
        } while (metros <= 0);
        System.out.println("Cuantas puertas tiene el Hall?");
        int puertas = -1;
        //verificamos que el valor introducido es un numero y mayor a 0
        do {
            try {
                puertas = Integer.parseInt(sc.nextLine());
            } catch (NumberFormatException ex) {
                System.out.println("Valor introducido no valido, tiene que ser un numero positivo");
            }
        } while (puertas < 0);
        System.out.println("Cuantas ventanas tiene el Hall?");
        int ventanas = -1;
        //verificamos que el valor introducido es un numero y mayor a 0
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
        //en caso en el que el input sea "si" le damos un valor true al booleano
        if (input.equals("si")) {
            puertaBlindada = true;
        } else {
            puertaBlindada = false;
        }
        //llamamos al constructor con los datos
        hall1 = new Hall(metros, puertas, ventanas, puertaBlindada);
    }

    /**
     * Metodo cocina el cual preguntará por todos los datos, los alamacenará, verificará que son correctos y finalmente llamará al constructor correspondiente con los datos
     */
    public static void cocina() {
        //preguntamos por los datos y los almacenamos en las variables
        System.out.println("Cuantos metros cuadrados tiene la cocina?");
        int metros = -1;
        //verificamos que el valor introducido es un numero y mayor a 0
        do {
            try {
                metros = Integer.parseInt(sc.nextLine());
            } catch (NumberFormatException ex) {
                System.out.println("Valor introducido no valido, tiene que ser un numero mayor que 0");
            }
        } while (metros <= 0);
        System.out.println("Cuantas puertas tiene la cocina?");
        int puertas = -1;
        //verificamos que el valor introducido es un numero y mayor a 0
        do {
            try {
                puertas = Integer.parseInt(sc.nextLine());
            } catch (NumberFormatException ex) {
                System.out.println("Valor introducido no valido, tiene que ser un numero positivo");
            }
        } while (puertas < 0);
        System.out.println("Cuantas ventanas tiene la cocina?");
        int ventanas = -1;
        //verificamos que el valor introducido es un numero y mayor a 0
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
        //en caso de que tenga tendedero pedimos los datos de este, de lo contrario le damos un valor de 0
        if (input.equals("si")) {
            tendedero = true;
            System.out.println("Cuantos metros tiene el tendedero?");
            metrosTendedero = -1;
            //verificamos que el valor introducido es un numero y mayor a 0
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
        //llamamos al constructor con los datos
        cocina1 = new Cocina(metros, puertas, ventanas, tendedero, metrosTendedero);
    }

    /**
     * Metodo salon el cual preguntará por todos los datos, los alamacenará, verificará que son correctos y finalmente llamará al constructor correspondiente con los datos
     */
    public static void salon() {
        //preguntamos por los datos y los almacenamos en las variables
        System.out.println("Cuantos metros cuadrados tiene el salon?");
        int metros = -1;
        //verificamos que el valor introducido es un numero y mayor a 0
        do {
            try {
                metros = Integer.parseInt(sc.nextLine());
            } catch (NumberFormatException ex) {
                System.out.println("Valor introducido no valido, tiene que ser un numero mayor que 0");
            }
        } while (metros <= 0);
        System.out.println("Cuantas puertas tiene el salon?");
        int puertas = -1;
        //verificamos que el valor introducido es un numero y mayor a 0
        do {
            try {
                puertas = Integer.parseInt(sc.nextLine());
            } catch (NumberFormatException ex) {
                System.out.println("Valor introducido no valido, tiene que ser un numero positivo");
            }
        } while (puertas < 0);
        System.out.println("Cuantas ventanas tiene el salon?");
        int ventanas = -1;
        //verificamos que el valor introducido es un numero y mayor a 0
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
        //en caso de que tenga terraza pedimos los datos de este, de lo contrario le damos un valor de 0
        if (input.equals("si")) {
            terraza = true;
            System.out.println("Cuantos metros tiene la terraza?");
            metrosTerraza = -1;
            //verificamos que el valor introducido es un numero y mayor a 0
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
        //verificamos que el valor introducido es un numero y mayor a 0
        do {
            try {
                tomas = Integer.parseInt(sc.nextLine());
            } catch (NumberFormatException ex) {
                System.out.println("Valor introducido no valido, tiene que ser un numero positivo");
            }
        } while (tomas < 0);
        //llamamos al constructor con los datos
        salon1 = new Salon(metros, puertas, ventanas, tomas, terraza, metrosTerraza);
    }

    /**
     * Metodo habitacion el cual preguntará por todos los datos, los alamacenará, verificará que son correctos y finalmente llamará al constructor correspondiente con los datos
     */
    public static void habitacion() {
        //preguntamos por los datos y los almacenamos en las variables
        System.out.println("Cuantos metros cuadrados tiene la habitacion?");
        int metros = -1;
        //verificamos que el valor introducido es un numero y mayor a 0
        do {
            try {
                metros = Integer.parseInt(sc.nextLine());
            } catch (NumberFormatException ex) {
                System.out.println("Valor introducido no valido, tiene que ser un numero mayor que 0");
            }
        } while (metros <= 0);
        System.out.println("Cuantas puertas tiene la habitacion?");
        int puertas = -1;
        //verificamos que el valor introducido es un numero y mayor a 0
        do {
            try {
                puertas = Integer.parseInt(sc.nextLine());
            } catch (NumberFormatException ex) {
                System.out.println("Valor introducido no valido, tiene que ser un numero positivo");
            }
        } while (puertas < 0);
        System.out.println("Cuantas ventanas tiene la habitacion?");
        int ventanas = -1;
        //verificamos que el valor introducido es un numero y mayor a 0
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
        //en caso en el que el input sea "si" le damos un valor true al booleano
        if (input.equals("si")) {
            accesoBano = true;
        } else {
            accesoBano = false;
        }
        System.out.println("Cuantas puertas tiene el armario de la habitacion?");
        int puertasArmario = -1;
        //verificamos que el valor introducido es un numero y mayor a 0
        do {
            try {
                puertasArmario = Integer.parseInt(sc.nextLine());
            } catch (NumberFormatException ex) {
                System.out.println("Valor introducido no valido, tiene que ser un numero positivo");
            }
        } while (puertasArmario < 0);
        //llamamos al constructor con los datos
        habitacion1 = new Habitacion(metros, puertas, ventanas, puertasArmario, accesoBano);
    }

    /**
     * Metodo bano el cual preguntará por todos los datos, los alamacenará, verificará que son correctos y finalmente llamará al constructor correspondiente con los datos
     */
    public static void bano() {
        //preguntamos por los datos y los almacenamos en las variables
        System.out.println("Cuantos metros cuadrados tiene el baño?");
        int metros = -1;
        //verificamos que el valor introducido es un numero y mayor a 0
        do {
            try {
                metros = Integer.parseInt(sc.nextLine());
            } catch (NumberFormatException ex) {
                System.out.println("Valor introducido no valido, tiene que ser un numero mayor que 0");
            }
        } while (metros <= 0);
        System.out.println("Cuantas puertas tiene el baño?");
        int puertas = -1;
        //verificamos que el valor introducido es un numero y mayor a 0
        do {
            try {
                puertas = Integer.parseInt(sc.nextLine());
            } catch (NumberFormatException ex) {
                System.out.println("Valor introducido no valido, tiene que ser un numero positivo");
            }
        } while (puertas < 0);
        System.out.println("Cuantas ventanas tiene el baño?");
        int ventanas = -1;
        //verificamos que el valor introducido es un numero y mayor a 0
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
        //en caso en el que el input sea "si" le damos un valor true al booleano
        if (input.equals("banera")) {
            baneraDucha = true;
        } else {
            baneraDucha = false;
        }
        //llamamos al constructor con los datos
        bano1 = new Bano(metros, puertas, ventanas, baneraDucha);
    }

    /**
     * el metodo calcularMetrosCuadrados calculará el toral de metros cuadrados de la casa sumando todas las instancias
     *
     * @return la cantidad de metros cuadrados totales
     */
    public static int calcularMetrosCuadrados() {
        int metrosCuadrados = 0;

        int hall = hall1.getMetrosCuadrados();
        int cocina = cocina1.getMetrosCuadrados();
        int salon = salon1.getMetrosCuadrados();
        int bano = bano1.getMetrosCuadrados();
        int habitacion = habitacion1.getMetrosCuadrados();
        int terraza = salon1.getMetrosTerraza();
        int tendedero = cocina1.getMetrosTendedero();

        //sumamos todos los metros cuadrados de las estancias
        metrosCuadrados = hall + cocina + salon + bano + habitacion + terraza + tendedero;

        //devolvemos el valor
        return metrosCuadrados;
    }

    /**
     * Metodo que llamará a los metodos mostrarDatos() de todos los objetos
     */
    public static void imprimirDatos() {
        hall1.mostrarDatos();
        cocina1.mostrarDatos();
        salon1.mostrarDatos();
        habitacion1.mostrarDatos();
        bano1.mostrarDatos();
    }

    public static void main(String[] args) {
        //llamamos a los metodos correspondientes
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
        //imprimimos el total de metros cuadrados de todas las estancias
        System.out.println("La casa tiene " + calcularMetrosCuadrados() + " metros cudrados");
    }
}