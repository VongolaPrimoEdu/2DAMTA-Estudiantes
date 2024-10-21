package com.mycompany.proyecto;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.PrintWriter;
import java.io.EOFException;

public class BinarioACSV {
    public static void main(String[] args) {
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream("src/main/resources/alumno.bin"));
             PrintWriter pw = new PrintWriter(new FileOutputStream("src/main/resources/nuevoAlumnos.csv"))) {

            // Escribir la cabecera del CSV
            pw.println("nombre,apellidos,edad,matricula");

            // Leer el objeto Alumnos desde el archivo binario
            Alumnos alumnos = (Alumnos) ois.readObject(); // Leer el objeto Alumnos

            // Iterar sobre la lista de alumnos
            for (Alumno alumno : alumnos.getAlumnos()) {
                pw.println(alumno); // Usar el método toString() de Alumno
            }

            System.out.println("Conversión de binario a CSV completada.");
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
