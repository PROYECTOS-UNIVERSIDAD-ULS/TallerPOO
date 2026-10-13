package Asociacion;

import java.util.List;
import java.util.ArrayList;


public class ejemplo1 {
   

class Estudiante {
    String nombre;
    List<Curso> cursos = new ArrayList<>();

    public Estudiante(String nombre) { this.nombre = nombre; }
}

class Curso {
    String nombreCurso;
    List<Estudiante> estudiantes = new ArrayList<>();

    public Curso(String nombreCurso) { this.nombreCurso = nombreCurso; }
}
}
