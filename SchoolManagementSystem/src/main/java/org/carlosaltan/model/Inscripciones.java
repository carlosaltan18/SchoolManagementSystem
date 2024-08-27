package org.carlosaltan.model;

public class Inscripciones {
    private Integer idCurso;
    private Estudiante estudiante;

    public Inscripciones(Estudiante estudiante, Integer idCurso) {
        this.estudiante = estudiante;
        this.idCurso = idCurso;
    }

    public Inscripciones() {
    }

    public Estudiante getEstudiante() {
        return estudiante;
    }

    public void setEstudiante(Estudiante estudiante) {
        this.estudiante = estudiante;
    }

    public Integer getIdCurso() {
        return idCurso;
    }

    public void setIdCurso(Integer idCurso) {
        this.idCurso = idCurso;
    }
}
