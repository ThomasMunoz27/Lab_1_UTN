package Tp11Part1;
import java.util.ArrayList;
import java.util.Scanner;
public class factura {
    private double iva;
    private Scanner sc = new Scanner(System.in);
    private int numeroFactura;
    private int fechaEmision;
    private String cliente;
    private ArrayList<String> articulos;
    private ArrayList<Double> precioUnitario;
    private int cantidad;
    private double subtotal;
    private double ivaCalculado;
    private double total;


    public factura(int numeroFactura, int fechaEmision, String cliente, double iva) {
        this.numeroFactura = numeroFactura;
        this.fechaEmision = fechaEmision;
        this.cliente = cliente;
        this.articulos = new ArrayList<>();
        this.precioUnitario = new ArrayList<>();
        this.iva = iva;
    }


    public void agregarArticulo() {
        System.out.println("Ingrese el artículo: ");
        String articulo = sc.nextLine();
        System.out.println("Ingrese el precio: ");
        double precio = sc.nextDouble();
        this.articulos.add(articulo);
        this.precioUnitario.add(precio);
    }


    public double calcularSubtotal() {
        double subtotal = 0;
        for (double precio : this.precioUnitario) {
            subtotal += precio;
        }
        this.subtotal = subtotal;
        return subtotal;
    }


    public double calcularIva() {
        this.ivaCalculado = (subtotal * iva) - subtotal;
        return ivaCalculado;
    }


    public double calcularTotal() {
        this.total = subtotal + ivaCalculado;
        return total;
    }




}

