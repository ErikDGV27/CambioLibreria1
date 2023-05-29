package org.biblioteca.Main;


import java.util.List;
import org.biblioteca.excepciones.LibroNoEncontradoException;
import org.biblioteca.interfaces.BuscadorLib;
import org.biblioteca.interfaces.Libro;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Erik
 */
public class Main {
   public static void main(String[] args) {
        // Instanciar la clase que implementa la interfaz Buscar
        BuscadorLib buscador = new BuscadorLib();

        try {
            // Invocar al método buscar usando palabras clave
            List<Libro> resultados = buscador.buscar("llano", "Juan Rulfo");

            if (resultados.isEmpty()) {
                // No se encontraron resultados
                System.out.println("No se encontraron libros que coincidan con las palabras clave.");
            } else {
                // Imprimir la lista de resultados
                for (Libro libro : resultados) {
                    System.out.println(libro.getInformacion());
                }
            }
        } catch (LibroNoEncontradoException e) {
            // La excepción LibroNoEncontradoException fue lanzada
            System.out.println("No se encontraron libros que coincidan con las palabras clave.");
        }
    }
}