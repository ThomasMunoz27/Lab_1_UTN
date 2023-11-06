package Tp11Part1;

import java.util.ArrayList;
import java.util.Scanner;

public class equipoFutbol {
    Scanner sc = new Scanner(System.in);
    private ArrayList<String> jugadores = new ArrayList<>();

    public equipoFutbol() {
        this.jugadores = jugadores;
    }

    public void mostrarJugadores() {
        if (jugadores.isEmpty()) {
            System.out.println("No hay jugadores ingresados");
        } else {
            for (String nombre : jugadores) {
                System.out.println(nombre + " ");
            }
        }
    }

    public void agregarJugadores() {
        String nuevoJugador = "1";
        while (!(nuevoJugador.equals("X"))) {
            System.out.println("Ingrese el nombre del jugador (Ingrese X para dejar de ingresar jugadores): ");
            nuevoJugador = sc.nextLine().toUpperCase();
            if (!(nuevoJugador.equals("X"))) {
                jugadores.add(nuevoJugador);
            }
        }
    }

    public void eliminarJugadores() {
        String jugador = "1";
        int count = 0;
        System.out.println("Ingrese el nombre del jugador : ");
        jugador = sc.nextLine().toUpperCase();
        for (int i = 0; i <= jugadores.size()-1; i++) {
            if (jugadores.get(i).equals(jugador)) {
                System.out.println("Se eliminó al Jugador: " + jugadores.get(i));
                jugadores.remove(i);
                break;
            } else if (jugadores.get(jugadores.size() - 1) != jugador) {
                count += 1;
            }
            if (count == jugadores.size()){
                System.out.println("No se encontró al jugador registrado");
            }
        }
    }
}


