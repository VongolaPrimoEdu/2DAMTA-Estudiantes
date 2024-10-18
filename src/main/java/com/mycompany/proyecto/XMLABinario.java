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

import javax.xml.bind.Unmarshaller;

import java.io.File;

import java.io.FileOutputStream;

import java.io.ObjectOutputStream;

import java.util.List;



public class XMLABinario {



    public static void main(String[] args) {

        try {

            // Crear el contexto JAXB para la clase 

            JAXBContext context = JAXBContext.newInstance(Alumnos.class);

            Unmarshaller unmarshaller = context.createUnmarshaller();



            // Deserializar el archivo XML en un objeto Alumnos

            Alumnos alumnos = (Alumnos) unmarshaller.unmarshal(new File("src/main/resources/alumnos.xml"));



            // Serializar el objeto Alumnos en un archivo binario

            try (FileOutputStream fos = new FileOutputStream("alumnos.bin");

                 ObjectOutputStream oos = new ObjectOutputStream(fos)) {

                oos.writeObject(alumnos);

            }



            System.out.println("Conversión de XML a binario completada.");

        } catch (JAXBException e) {

            e.printStackTrace();

        } catch (Exception e) {

            System.out.println("Error: " + e.getMessage());

        }

    }

}

