package org.carlosaltan.model;

public class Estudiante extends Persona{
    private Integer id;
    private Boolean matricula;
    private String numeroMatricula;

    public Estudiante() {}



    public Estudiante(String apellido, Integer edad, String fechaDeNacimiento, String nombre, Integer id) {
        super(apellido, edad, fechaDeNacimiento, nombre);
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Boolean getMatricula() {
        return matricula;
    }

    public void setMatricula(Boolean matricula) {
        this.matricula = matricula;
    }

    public String getNumeroMatricula() {
        return numeroMatricula;
    }

    public void setNumeroMatricula(String numeroMatricula) {
        this.numeroMatricula = numeroMatricula;
    }
}


