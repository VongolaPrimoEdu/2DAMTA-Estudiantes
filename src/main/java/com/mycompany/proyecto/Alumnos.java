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



@XmlRootElement(name = "ventas")

public class Alumnos implements Serializable {

    private List<Alumno> ventas;



    @XmlElement(name = "venta")

    public List<Alumno> getAlumnos() {

        return ventas;

    }



    public void setAlumnos(List<Alumno> ventas) {

        this.ventas = ventas;

    }

}