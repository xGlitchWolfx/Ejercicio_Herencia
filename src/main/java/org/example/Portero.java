package org.example;

public class Portero extends Jugador {
    private int atajadas;
    private int golesRecibidos;

    public Portero(String nombre, int edad, String equipo, int atajadas, int golesRecibidos) {
        super(nombre, edad, equipo);
        this.atajadas = atajadas;
        this.golesRecibidos = golesRecibidos;
    }

    @Override
    public void mostrarInfo() {
        super.mostrarInfo();
        System.out.println("Atajadas: " + atajadas);
        System.out.println("Goles recibidos: " + golesRecibidos);
    }
}
