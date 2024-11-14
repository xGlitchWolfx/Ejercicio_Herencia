package org.example;

public class Main {
    public static void main(String[] args) {
        Portero portero = new Portero("Juan", 30, "Equipo A", 50, 20);
        Defensa defensa = new Defensa("Carlos", 25, "Equipo B", 35);
        Delantero delantero = new Delantero("Luis", 28, "Equipo C");

        System.out.println("Información del Portero:");
        portero.mostrarInfo();
        System.out.println("\nInformación del Defensa:");
        defensa.mostrarInfo();
        System.out.println("\nInformación del Delantero:");
        delantero.mostrarInfo();
    }
}