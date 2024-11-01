package com.example.Parcial.Modelo;

import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "autores")
public class Autor {

        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        @Column(name = "autor_id")
        private Long idAutor;
        private String nombre;
        private String apellido;
        private String nacionalidad;
        private Integer añoNacimiento;

        @OneToMany(mappedBy = "autor", cascade = CascadeType.ALL, orphanRemoval = true)
        private List<Libro> libros = new ArrayList<>();

        public Autor() {
        }

        public Autor(Long idAutor, String nombre, String apellido, String nacionalidad, Integer añoNacimiento) {
            this.idAutor = idAutor;
            this.nombre = nombre;
            this.apellido = apellido;
            this.nacionalidad = nacionalidad;
            this.añoNacimiento = añoNacimiento;
        }

    public Long getIdAutor() {
        return idAutor;
    }

    public void setIdAutor(Long idAutor) {
        this.idAutor = idAutor;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getNacionalidad() {
        return nacionalidad;
    }

    public void setNacionalidad(String nacionalidad) {
        this.nacionalidad = nacionalidad;
    }

    public Integer getAñoNacimiento() {
        return añoNacimiento;
    }

    public void setAñoNacimiento(Integer añoNacimiento) {
        this.añoNacimiento = añoNacimiento;
    }

    public List<Libro> getLibros() {
        return libros;
    }

    public void setLibros(List<Libro> libros) {
        this.libros = libros;
    }

    @Override
        public String toString() {
            return "Autor{" +
                    "idAutor=" + idAutor +
                    ", nombre='" + nombre + '\'' +
                    ", apellido='" + apellido + '\'' +
                    ", nacionalidad='" + nacionalidad + '\'' +
                    ", añoNacimiento=" + añoNacimiento +
                    '}';
        }
    }
