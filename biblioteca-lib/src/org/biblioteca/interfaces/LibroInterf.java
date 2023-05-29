/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.biblioteca.interfaces;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import org.biblioteca.interfaces.Libro;


/**
 *
 * @author Erik
 */
public class LibroInterf implements Libro {
    
            private int id;
            private String titulo;
            private String descripcion;
            private int unidadesDisponibles;

    
    public LibroInterf(int id, String titulo, String descripcion, int unidadesDisponibles) {
        this.id = id;
        this.titulo = titulo;
        this.descripcion = descripcion;
        this.unidadesDisponibles = unidadesDisponibles;
    }

    //  mostrar info
    public void mostrarTabla() {
         
        Object[][] data = {
            {"Atributo", "Tipo de Dato"},
            {"Id", id},
            {"Titulo", titulo},
            {"Descripción", descripcion},
            {"Unidades Disponibles", unidadesDisponibles}
        };

        // nombres
        String[] columnNames = {"Atributo", "Valor"};

        // 
        JTable table = new JTable(data, columnNames);

        // scroll?
        JPanel panel = new JPanel();
        panel.add(new JScrollPane(table));

        // ventana muestra panel
        JFrame frame = new JFrame("Tabla");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.add(panel);
        frame.pack();
        frame.setVisible(true);
    }

    // obtiene info
            @Override
    public String getInformacion() {
        String informacion = "Atributo\tValor\n";
        informacion += "Id\t" + id + "\n";
        informacion += "Titulo\t" + titulo + "\n";
        informacion += "Descripción\t" + descripcion + "\n";
        informacion += "Unidades Disponibles\t" + unidadesDisponibles;
        return informacion;
    }
}
