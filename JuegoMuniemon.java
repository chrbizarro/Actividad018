package Actividad018;

import java.util.Scanner;

class Muniemon {
    String nombre;
    int vida;
    int ataque;
    int defensa;
    String tipo;

    public Muniemon(String nombre, int vida, int ataque, int defensa, String tipo) {
        this.nombre = nombre;
        this.vida = vida;
        this.ataque = ataque;
        this.defensa = defensa;
        this.tipo = tipo;
    }
}

public class JuegoMuniemon {
    private Muniemon muniemon;

    public void darDeAltaMuniemon() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese el nombre del Muniemon:");
        String nombre = scanner.nextLine();
        System.out.println("Ingrese la vida del Muniemon:");
        int vida = Integer.parseInt(scanner.nextLine());
        System.out.println("Ingrese el ataque del Muniemon:");
        int ataque = Integer.parseInt(scanner.nextLine());
        System.out.println("Ingrese la defensa del Muniemon:");
        int defensa = Integer.parseInt(scanner.nextLine());
        System.out.println("Ingrese el tipo del Muniemon (AGUA, TIERRA, FUEGO, PLANTA):");
        String tipo = scanner.nextLine().toUpperCase();

        muniemon = new Muniemon(nombre, vida, ataque, defensa, tipo);
        System.out.println("Muniemon creado exitosamente.");
    }

    public void mostrarMuniemon() {
        if (muniemon != null) {
            System.out.println("Nombre: " + muniemon.nombre);
            System.out.println("Vida: " + muniemon.vida);
            System.out.println("Ataque: " + muniemon.ataque);
            System.out.println("Defensa: " + muniemon.defensa);
            System.out.println("Tipo: " + muniemon.tipo);
        } else {
            System.out.println("No hay ningún Muniemon creado.");
        }
    }

    public void ejecutar() {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("\nMenú:");
            System.out.println("1. Dar de alta Muniemon");
            System.out.println("2. Mostrar Muniemon");
            System.out.println("3. Salir del programa");
            System.out.println("Seleccione una opción:");
            String opcion = scanner.nextLine();

            switch (opcion) {
                case "1":
                    darDeAltaMuniemon();
                    break;
                case "2":
                    mostrarMuniemon();
                    break;
                case "3":
                    System.out.println("Saliendo del programa...");
                    scanner.close();
                    return;
                default:
                    System.out.println("Opción inválida. Inténtelo de nuevo.");
            }
        }
    }

    public static void main(String[] args) {
        JuegoMuniemon juego = new JuegoMuniemon();
        juego.ejecutar();
    }
}
