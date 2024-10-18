package com.mycompany.proyecto;


class Alumno {
     private String nombre;
        private String apellidos;
        private String edad;
        private String matricula;

        public Alumno(String nombre, String apellidos, String edad, String matricula) {
            this.nombre = nombre;
            this.apellidos = apellidos;
            this.edad = edad;
            this.matricula = matricula;
        }

        public String getNombre() {
            return nombre;
        }

        public String getApellidos() {
            return apellidos;
        }

        public String getEdad() {
            return edad;
        }

        public String getMatricula() {
            return matricula;
        }
    
}
