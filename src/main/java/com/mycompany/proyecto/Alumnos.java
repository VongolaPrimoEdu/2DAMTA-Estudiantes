/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.proyecto;

/**
 *
 * @author Eduardo
 */
import java.io.Serializable;

import java.util.List;

import javax.xml.bind.annotation.XmlElement;

import javax.xml.bind.annotation.XmlRootElement;



@XmlRootElement(name = "alumnos")

public class Alumnos implements Serializable {

    private List<Alumno> alumnos;



    @XmlElement(name = "alumno")

    public List<Alumno> getAlumnos() {

        return alumnos;

    }



    public void setAlumnos(List<Alumno> alumnos) {

        this.alumnos = alumnos;

    }

}