package org.carlosaltan.model;

public class Curso {

    private Integer id;
    private String nombre;
    private String descripcion;
    private Integer numeroCreditos;
    private String version;

    public Curso(){}

    public Curso(String descripcion, Integer id, String nombre, Integer numeroCreditos, String version) {
        this.descripcion = descripcion;
        this.id = id;
        this.nombre = nombre;
        this.numeroCreditos = numeroCreditos;
        this.version = version;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Integer getNumeroCreditos() {
        return numeroCreditos;
    }

    public void setNumeroCreditos(Integer numeroCreditos) {
        this.numeroCreditos = numeroCreditos;
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }
}

