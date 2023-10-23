package Tp10Java.Ej1;

public class perro {
    private String nombre;
    private String raza;
    private int edad;

    public perro() {
        this.nombre = nombre;
        this.raza = raza;
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }


    public void ladrar(){
        System.out.println(nombre+ ": " + "Guau, guau!");
    }
}
