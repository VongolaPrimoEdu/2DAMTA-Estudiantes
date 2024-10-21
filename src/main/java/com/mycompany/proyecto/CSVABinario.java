/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.proyecto;

/**
 *
 * @author Eduardo
 */
//Cambiar la ruta del buffered reader
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStreamReader;
import java.io.ObjectOutputStream;
public class CSVABinario {
 public static void main(String[] args) {
    
 try (BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream("src/main/resources/alumno.csv")));
 FileOutputStream fos = new FileOutputStream("alumnoscsv.bin");
 ObjectOutputStream oos = new ObjectOutputStream(fos)) {
 String linea;
 while ((linea = br.readLine()) != null) {
 oos.writeObject(linea);
 }
 System.out.println("Conversión de CSV a binario completada.");
 } catch (Exception e) {
 System.out.println("Error: " + e.getMessage());
 }
 }
}