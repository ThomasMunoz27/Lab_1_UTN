package Tp10Java.Ej1;

public class pelicula {
    private String titulo;
    private String director;
    private int duracion;

    public pelicula(String titulo, String director, int duracion){
        this.titulo = titulo;
        this.director = director;
        this.duracion = duracion;
    }
    public void mostrarInfo(){
        System.out.println("Titulo: " + titulo);
        System.out.println("Director: " + director);
        System.out.println("Duracion: " + duracion +"min");
    }
}
