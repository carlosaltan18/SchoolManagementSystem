package org.carlosaltan.model;

public class Persona {
    private Integer edad;
    private String nombre;
    private String apellido;
    private String fechaDeNacimiento;


    public Persona(){}

    public Persona(String apellido, Integer edad, String fechaDeNacimiento, String nombre) {
        this.apellido = apellido;
        this.edad = edad;
        this.fechaDeNacimiento = fechaDeNacimiento;
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public Integer getEdad() {
        return edad;
    }

    public void setEdad(Integer edad) {
        this.edad = edad;
    }

    public String getFechaDeNacimiento() {
        return fechaDeNacimiento;
    }

    public void setFechaDeNacimiento(String fechaDeNacimiento) {
        this.fechaDeNacimiento = fechaDeNacimiento;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}


