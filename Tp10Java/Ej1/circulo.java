package Tp10Java.Ej1;

public class circulo {
    private double radio;



    public circulo() {
        this.radio = radio;
    }

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }

    public double calcArea(){
        double resp;
        resp = Math.PI * (radio*radio);
        return resp;
    }

    public double calcCircunf(){
        double resp;
        resp = Math.PI * (radio*2);
        return resp;
    }
}

