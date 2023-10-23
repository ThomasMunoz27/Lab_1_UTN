package Tp10Java.Ej1;

public class libro {
    private String titulo;
    private String autor;
    private int anoPublicacion;

    public libro(String titulo, String autor, int anoPublicacion){
        this.titulo = titulo;
        this.autor = autor;
        this.anoPublicacion = anoPublicacion;
    }

    public void mostrarDatos(){
        System.out.println("Autor: " + autor);
        System.out.println("Titulo: " + titulo);
        System.out.println("Año de publicacion: " + anoPublicacion);
    }
}
