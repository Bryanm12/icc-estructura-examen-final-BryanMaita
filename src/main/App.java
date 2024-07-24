package main;

import main.models.Estudiante;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        Estudiante estudiante = new Estudiante("Mateo", 50); 
        Estudiante estudiante1 = new Estudiante("Daniel", 30);
        Estudiante estudiante2 = new Estudiante("Miguel", 70);
        Estudiante estudiante3 = new Estudiante("Pedro", 45);
        Estudiante estudiante4 = new Estudiante("Rebecca", 90);

        System.out.println("Lista de estudiantes: "+estudiante);
    }
}
