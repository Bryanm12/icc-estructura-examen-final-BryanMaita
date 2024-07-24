package main.models;

public class Estudiante {
    private String nombre;
    private int calificacion;
    public Estudiante(String nombre, int calificacion){
        this.nombre = nombre;
        this.calificacion= calificacion;
    }
    public String getNombre() {
        return nombre;
    }
    public int getCalificacion() {
        return calificacion;
    }

    public String toString(){
        return "Nombre del estudiante es:"+nombre+". Su calificación: "+calificacion;
    }

}
