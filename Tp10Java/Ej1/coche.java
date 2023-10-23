package Tp10Java.Ej1;

public class coche {
    private String marca;
    private String modelo;
    private int anoFabric;

    public coche(String marca, String modelo, int anoFabric){
        this.marca = marca;
        this.modelo = modelo;
        this.anoFabric = anoFabric;
    }

    public void acelerar(){
        System.out.println("El auto, " + marca + " " + modelo + ", aceleró");
    }
    public void frenar(){
        System.out.println("El auto, " + marca + " " + modelo + ", frenó");
    }
}
