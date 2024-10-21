/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.proyecto;

/**
 *
 * @author Eduardo
 */
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.PrintWriter;
import java.io.EOFException;

public class BinarioACSV {
    public static void main(String[] args) {
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream("alumnos.bin"));
             PrintWriter pw = new PrintWriter(new FileOutputStream("nuevoAlumnos.csv"))) {
             
            Object obj;
            while (true) { // Usamos un bucle infinito y manejamos la excepción para el fin del archivo
                try {
                    obj = ois.readObject();
                    pw.println((String) obj);
                } catch (EOFException eof) {
                    // Cuando llegamos al final del archivo, salimos del bucle
                    break;
                }
            }
            System.out.println("Conversión de binario a CSV completada.");
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}


