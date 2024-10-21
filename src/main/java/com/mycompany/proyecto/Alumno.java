package com.mycompany.proyecto;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
class Alumno implements Serializable {
    private static final long serialVersionUID = 1L;

    private String nombre;
    private String apellidos;
    private String edad;
    private String matricula;

    // Constructor sin parámetros
    public Alumno() {
    }

    // Constructor con parámetros
    public Alumno(String nombre, String apellidos, String edad, String matricula) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.edad = edad;
        this.matricula = matricula;
    }

    // Getters y Setters con anotaciones JAXB
    @XmlElement
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @XmlElement
    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    @XmlElement
    public String getEdad() {
        return edad;
    }

    public void setEdad(String edad) {
        this.edad = edad;
    }

    @XmlElement
    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }
}
