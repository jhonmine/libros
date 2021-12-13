/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

/**
 *
 * @author crimi
 */
public class librito {
        private String nombre_libro;
        private int isbn_libro;
        private String nombre_autor;
        private Double costo_libro;
        private String formato_libro;
        private String genero_libro;

    public librito(String nombre_libro, int isbn_libro, String nombre_autor, Double costo_libro, String formato_libro, String genero_libro) {
        this.nombre_libro = nombre_libro;
        this.isbn_libro = isbn_libro;
        this.nombre_autor = nombre_autor;
        this.costo_libro = costo_libro;
        this.formato_libro = formato_libro;
        this.genero_libro = genero_libro;
    }

    public String getNombre_libro() {
        return nombre_libro;
    }

    public void setNombre_libro(String nombre_libro) {
        this.nombre_libro = nombre_libro;
    }

    public int getIsbn_libro() {
        return isbn_libro;
    }

    public void setIsbn_libro(int isbn_libro) {
        this.isbn_libro = isbn_libro;
    }

    public String getNombre_autor() {
        return nombre_autor;
    }

    public void setNombre_autor(String nombre_autor) {
        this.nombre_autor = nombre_autor;
    }

    public Double getCosto_libro() {
        return costo_libro;
    }

    public void setCosto_libro(Double costo_libro) {
        this.costo_libro = costo_libro;
    }

    public String getFormato_libro() {
        return formato_libro;
    }

    public void setFormato_libro(String formato_libro) {
        this.formato_libro = formato_libro;
    }

    public String getGenero_libro() {
        return genero_libro;
    }

    public void setGenero_libro(String genero_libro) {
        this.genero_libro = genero_libro;
    }
        
}
