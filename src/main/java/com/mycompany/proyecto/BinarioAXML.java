/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.proyecto;

/**
 *
 * @author Eduardo
 */
import javax.xml.bind.JAXBContext;

import javax.xml.bind.JAXBException;

import javax.xml.bind.Marshaller;

import java.io.File;

import java.io.FileInputStream;

import java.io.ObjectInputStream;



public class BinarioAXML {



    public static void main(String[] args) {

        try {

            // Leer el objeto Alumnos desde el archivo binario

            Alumnos alumnos;

            try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream("src/main/resources/alumno.bin"))) {

                alumnos = (Alumnos) ois.readObject();

            }



            // Crear el contexto JAXB y el marshaller para convertir a XML

            JAXBContext context = JAXBContext.newInstance(Alumnos.class);

            Marshaller marshaller = context.createMarshaller();

            marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, Boolean.TRUE);



            // Escribir el objeto Alumnos en un nuevo archivo XML

            marshaller.marshal(alumnos, new File("src/main/resources/nuevoAlumnos.xml"));



            System.out.println("Conversión de binario a XML completada.");

        } catch (JAXBException e) {

            e.printStackTrace();

        } catch (Exception e) {

            System.out.println("Error: " + e.getMessage());

        }

    }

}
