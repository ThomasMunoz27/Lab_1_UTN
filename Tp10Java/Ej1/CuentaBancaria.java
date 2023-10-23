package Tp10Java.Ej1;
import java.util.Scanner;
public class CuentaBancaria {
    Scanner sc = new Scanner(System.in);
    private double saldo;
    private int numCuenta;

    public CuentaBancaria(){
        this.saldo = saldo;
        this.numCuenta = numCuenta;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public int getNumCuenta() {
        return numCuenta;
    }

    public void setNumCuenta(int numCuenta) {
        this.numCuenta = numCuenta;
    }

    public double depositar(){
        double deposito = sc.nextDouble();
        saldo += deposito;
        return saldo;
    }

    public double retirar() {
        double retiro = sc.nextDouble();
        saldo -= retiro;
        return saldo;
    }

    public void mostrarSaldo(){
        System.out.println(saldo);
    }
}
