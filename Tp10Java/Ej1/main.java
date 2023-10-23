package Tp10Java.Ej1;

public class main {
    public static void main(String[]args){
        perro p1 = new perro();
        circulo circ1 = new circulo(), circ2 = new circulo();
        estudiante e1 = new estudiante();
        libro l1 = new libro("JoJo", "Araki", 2004);
        CuentaBancaria cuent1 = new CuentaBancaria();
        coche auto1 = new coche("toyota", "corola", 1999);
        pelicula peli1 = new pelicula("Spiderman", "Pepe", 180);

        cuent1.setSaldo(1000);
        cuent1.setNumCuenta(1437);
        p1.setNombre("Bolt");
        p1.setRaza("ovejero");

        p1.setEdad(10);

        e1.setNombre("Thomas");
        e1.setEdad(18);
        e1.setId(518);

        circ1.setRadio(12.2);
        circ2.setRadio(6.66);

        peli1.mostrarInfo();
        p1.ladrar();
        l1.mostrarDatos();
        //salto de linea
        auto1.acelerar();
        auto1.frenar();

        /*
        System.out.println();
        cuent1.depositar();
        cuent1.retirar();
        cuent1.mostrarSaldo();

        System.out.println(circ1.calcArea());
        System.out.println(circ1.calcCircunf());
        System.out.println(circ2.calcArea());
         */

    }
}
