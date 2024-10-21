/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.proyecto;

import java.io.File;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.text.Document;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import org.w3c.dom.NodeList;

/**
 *
 * @author nrg24
 */
public class Form extends javax.swing.JFrame {

    private ArrayList<Alumno> alumnos;

    public Form() {
        initComponents();
    jButton3.setVisible(false); // Ocultar el botón al inicio
    jComboBox1.addActionListener(e -> mostrarAlumnoSeleccionado());
    alumnos = new ArrayList<>();
    cargarDatosDesdeXML();

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jTextField4 = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        jComboBox1 = new javax.swing.JComboBox<>();
        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });

        jButton2.setText("Borrar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });

        jButton1.setText("Guardar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel1.setText("Nombre");

        jLabel2.setText("Apellidos");

        jLabel3.setText("Edad");

        jLabel4.setText("Matrícula");

        jButton3.setText("Sobreescribir");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(75, 75, 75)
                .addComponent(jButton1)
                .addGap(41, 41, 41)
                .addComponent(jButton2)
                .addGap(51, 51, 51)
                .addComponent(jButton3)
                .addContainerGap(96, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(44, 44, 44)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 66, Short.MAX_VALUE)
                                .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(138, 138, 138)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextField1)
                            .addComponent(jTextField2)
                            .addComponent(jTextField3)
                            .addComponent(jTextField4)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(88, 88, 88)
                        .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 273, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(53, 53, 53))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 44, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton2)
                    .addComponent(jButton1)
                    .addComponent(jButton3))
                .addGap(23, 23, 23))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
        int selectedIndex = jComboBox1.getSelectedIndex();

    // Verificar si hay elementos en el JComboBox (ignorando el primer ítem)
    if (jComboBox1.getItemCount() > 1) {
        jButton3.setVisible(selectedIndex > 0); // Solo mostrar si hay un elemento seleccionado distinto del primer ítem
    } else {
        jButton3.setVisible(false); // Ocultar si no hay elementos (o solo el vacío)
    }

    if (selectedIndex > 0) {
        // Obtener los datos del alumno seleccionado y mostrarlos en los JTextFields
        mostrarAlumnoSeleccionado();
    } else {
        // Limpiar los JTextFields si se selecciona el primer ítem
        jTextField1.setText("");
        jTextField2.setText("");
        jTextField3.setText("");
        jTextField4.setText("");
    }//GEN-LAST:event_jComboBox1ActionPerformed
  
    }
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
      añadirAlumnoAlXML(); 
      jComboBox1.removeAllItems();
     cargarDatosDesdeXML();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        eliminarAlumnoDelXML();
        cargarDatosDesdeXML();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        editarAlumnoEnXML();
        cargarDatosDesdeXML();
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed
  
    private void eliminarAlumnoDelXML() {
    // Obtener el índice seleccionado en el JComboBox
    int selectedIndex = jComboBox1.getSelectedIndex();

    // Si hay un elemento seleccionado
    if (selectedIndex > 0) { // Debes ignorar el primer ítem vacío
        // Obtener la matrícula del alumno seleccionado
        String item = (String) jComboBox1.getSelectedItem();
        String matricula = item.split("-")[0]; // Obtener la matrícula desde el JComboBox

        try {
            // Definir la ruta al archivo XML
            String rutaEscritorio = "src/main/resources/alumno.xml";
            File archivoXML = new File(rutaEscritorio);

            // Crear el parser de XML
            DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
            DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
            org.w3c.dom.Document doc = dBuilder.parse(archivoXML);
            doc.getDocumentElement().normalize();

            // Obtener los elementos <alumno> desde el XML
            NodeList nodeList = doc.getElementsByTagName("alumno");

            // Buscar el alumno con la matrícula seleccionada
            for (int i = 0; i < nodeList.getLength(); i++) {
                org.w3c.dom.Element alumnoElement = (org.w3c.dom.Element) nodeList.item(i);
                String matriculaXML = alumnoElement.getElementsByTagName("matricula").item(0).getTextContent();

                // Si las matrículas coinciden, eliminar el nodo del documento XML
                if (matricula.equals(matriculaXML)) {
                    alumnoElement.getParentNode().removeChild(alumnoElement); // Eliminar el nodo del alumno
                    break; // Salir del bucle una vez encontrado y eliminado
                }
            }

            // Guardar los cambios en el archivo XML
            TransformerFactory transformerFactory = TransformerFactory.newInstance();
            Transformer transformer = transformerFactory.newTransformer();
            DOMSource source = new DOMSource(doc);
            StreamResult result = new StreamResult(archivoXML);
            transformer.transform(source, result);

            // Eliminar el alumno de la lista de alumnos y del JComboBox
            alumnos.remove(selectedIndex - 1); // Restar 1 para obtener el índice correcto
            jComboBox1.removeItemAt(selectedIndex); // Eliminar el elemento del JComboBox

            // Limpiar los campos de texto
            jTextField1.setText("");
            jTextField2.setText("");
            jTextField3.setText("");
            jTextField4.setText("");
            cargarDatosDesdeXML();

            JOptionPane.showMessageDialog(this, "Alumno eliminado correctamente.");

        } catch (Exception e) {
            e.printStackTrace();
        }
    } else {
        JOptionPane.showMessageDialog(this, "No se ha seleccionado ningún alumno para eliminar.");
    }
}

    
   public void cargarDatosDesdeXML() {
    try {
        // Definir la ruta al archivo XML
        String rutaEscritorio = "src/main/resources/alumno.xml";
        File archivoXML = new File(rutaEscritorio);

        // Crear el parser de XML
        DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
        DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
        org.w3c.dom.Document doc = dBuilder.parse(archivoXML);
        doc.getDocumentElement().normalize();

        // Limpiar el JComboBox antes de cargar los datos
        jComboBox1.removeAllItems();

        // Agregar un primer ítem vacío
        jComboBox1.addItem("");

        // Obtener los elementos <alumno> desde el XML
        NodeList nodeList = doc.getElementsByTagName("alumno");

        // Recorrer los nodos <alumno> y obtener todos los datos de cada uno
        for (int i = 0; i < nodeList.getLength(); i++) {
            org.w3c.dom.Element alumnoElement = (org.w3c.dom.Element) nodeList.item(i);

            String nombre = alumnoElement.getElementsByTagName("nombre").item(0).getTextContent();
            String apellidos = alumnoElement.getElementsByTagName("apellidos").item(0).getTextContent();
            String edad = alumnoElement.getElementsByTagName("edad").item(0).getTextContent();
            String matricula = alumnoElement.getElementsByTagName("matricula").item(0).getTextContent();

            // Crear un objeto Alumno y almacenarlo en el ArrayList
            Alumno alumno = new Alumno(nombre, apellidos, edad, matricula);
            alumnos.add(alumno);

            // Agregar el formato "matricula-apellido, nombre" al JComboBox
            jComboBox1.addItem(matricula + "-" + apellidos + ", " + nombre);
        }

    } catch (Exception e) {
        e.printStackTrace();
    }
}

    public void añadirAlumnoAlXML() {
    try {
        // Definir la ruta al archivo XML
        String rutaEscritorio = "src/main/resources/alumno.xml";
        File archivoXML = new File(rutaEscritorio);

        // Crear el parser de XML
        DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
        DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
        org.w3c.dom.Document doc = dBuilder.parse(archivoXML);
        doc.getDocumentElement().normalize();

        // Obtener el elemento raíz <ieselrincon>
        org.w3c.dom.Element raiz = doc.getDocumentElement();

        // Crear un nuevo elemento <alumno>
        org.w3c.dom.Element nuevoAlumno = doc.createElement("alumno");

        // Crear y agregar el elemento <nombre>
        org.w3c.dom.Element nombreElement = doc.createElement("nombre");
        nombreElement.setTextContent(jTextField1.getText()); // Obtener el texto desde el JTextField
        nuevoAlumno.appendChild(nombreElement);

        // Crear y agregar el elemento <apellidos>
        org.w3c.dom.Element apellidosElement = doc.createElement("apellidos");
        apellidosElement.setTextContent(jTextField2.getText());
        nuevoAlumno.appendChild(apellidosElement);

        // Crear y agregar el elemento <edad>
        org.w3c.dom.Element edadElement = doc.createElement("edad");
        edadElement.setTextContent(jTextField3.getText());
        nuevoAlumno.appendChild(edadElement);

        // Crear y agregar el elemento <matricula>
        org.w3c.dom.Element matriculaElement = doc.createElement("matricula");
        matriculaElement.setTextContent(jTextField4.getText());
        nuevoAlumno.appendChild(matriculaElement);

        // Añadir el nuevo alumno al nodo raíz <ieselrincon>
        raiz.appendChild(nuevoAlumno);

        // Guardar los cambios en el archivo XML
        TransformerFactory transformerFactory = TransformerFactory.newInstance();
        Transformer transformer = transformerFactory.newTransformer();
        DOMSource source = new DOMSource(doc);
        StreamResult result = new StreamResult(archivoXML);
        transformer.transform(source, result);

        // Crear un nuevo objeto Alumno (igual que en cargarDatosDesdeXML)
        Alumno alumno = new Alumno(jTextField1.getText(), jTextField2.getText(), jTextField3.getText(), jTextField4.getText());
        alumnos.add(alumno); // Agregar el nuevo alumno al ArrayList

        // Agregar el nuevo alumno al JComboBox con el mismo formato
        jComboBox1.addItem(jTextField4.getText() + "-" + jTextField2.getText() + ", " + jTextField1.getText());

        // Mostrar mensaje de éxito
        JOptionPane.showMessageDialog(this, "Alumno añadido correctamente al XML.");

    } catch (Exception e) {
        e.printStackTrace();
    }
}

    // Método que se llama al seleccionar un elemento en el JComboBox
   private void mostrarAlumnoSeleccionado() {
    // Obtener el índice seleccionado del JComboBox
    int selectedIndex = jComboBox1.getSelectedIndex();

    if (selectedIndex == 0) {
        // Si se selecciona el primer ítem vacío, limpiar los JTextFields
        jTextField1.setText("");
        jTextField2.setText("");
        jTextField3.setText("");
        jTextField4.setText("");
    } else if (selectedIndex != -1) {
        // Obtener el alumno correspondiente al índice (restar 1 porque el primer ítem es vacío)
        Alumno alumno = alumnos.get(selectedIndex - 1);

        // Mostrar los datos del alumno en los JTextFields
        jTextField1.setText(alumno.getNombre());
        jTextField2.setText(alumno.getApellidos());
        jTextField3.setText(alumno.getEdad());
        jTextField4.setText(alumno.getMatricula());
    }
}

   private void editarAlumnoEnXML() {
    try {
        // Verificar si se ha seleccionado un alumno distinto al primer ítem vacío
        int selectedIndex = jComboBox1.getSelectedIndex();
        if (selectedIndex <= 0) { // El índice 0 es el ítem vacío
            JOptionPane.showMessageDialog(this, "Por favor, seleccione un alumno para editar.");
            return;
        }

        // Definir la ruta al archivo XML
        String rutaEscritorio = "src/main/resources/alumno.xml";
        File archivoXML = new File(rutaEscritorio);

        // Crear el parser de XML
        DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
        DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
        org.w3c.dom.Document doc = dBuilder.parse(archivoXML);
        doc.getDocumentElement().normalize();

        // Obtener el nodo del alumno que se va a editar
        NodeList nodeList = doc.getElementsByTagName("alumno");

        // Restar 1 al índice seleccionado porque el primer ítem es vacío
        org.w3c.dom.Element alumnoElement = (org.w3c.dom.Element) nodeList.item(selectedIndex - 1);

        // Actualizar los datos del alumno con los datos del JTextField
        alumnoElement.getElementsByTagName("nombre").item(0).setTextContent(jTextField1.getText());
        alumnoElement.getElementsByTagName("apellidos").item(0).setTextContent(jTextField2.getText());
        alumnoElement.getElementsByTagName("edad").item(0).setTextContent(jTextField3.getText());
        alumnoElement.getElementsByTagName("matricula").item(0).setTextContent(jTextField4.getText());

        // Guardar los cambios en el archivo XML
        TransformerFactory transformerFactory = TransformerFactory.newInstance();
        Transformer transformer = transformerFactory.newTransformer();
        DOMSource source = new DOMSource(doc);
        StreamResult result = new StreamResult(archivoXML);
        transformer.transform(source, result);

        // Actualizar el ArrayList de alumnos
        Alumno alumno = alumnos.get(selectedIndex - 1); // Restar 1 para obtener el alumno correcto
        alumno.setNombre(jTextField1.getText());
        alumno.setApellidos(jTextField2.getText());
        alumno.setEdad(jTextField3.getText());
        alumno.setMatricula(jTextField4.getText());

        // Actualizar el JComboBox con el nuevo formato del alumno
        jComboBox1.removeItemAt(selectedIndex); // Eliminar el ítem viejo
        jComboBox1.insertItemAt(jTextField4.getText() + "-" + jTextField2.getText() + ", " + jTextField1.getText(), selectedIndex); // Insertar el nuevo

        // Mostrar mensaje de éxito
        JOptionPane.showMessageDialog(this, "Alumno editado correctamente.");
    } catch (Exception e) {
        e.printStackTrace(); // Asegúrate de ver si hay algún error aquí
        JOptionPane.showMessageDialog(this, "Ocurrió un error al editar el alumno: " + e.getMessage());
    }
}


    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Form.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Form.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Form.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Form.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Form().setVisible(true);

            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    // End of variables declaration//GEN-END:variables
}
