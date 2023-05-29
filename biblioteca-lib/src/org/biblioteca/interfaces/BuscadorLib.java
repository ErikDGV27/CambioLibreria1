package org.biblioteca.interfaces;

import java.util.ArrayList;
import java.util.List;
import org.biblioteca.excepciones.LibroNoEncontradoException;

public class BuscadorLib implements Buscar {

    private List<Libro> libros; // Simulación de la base de datos

    public BuscadorLib() {
        // Inicializar la lista de libros con datos de ejemplo
        libros = new ArrayList<>();
        libros.add(new LibroInterf(1, "El llano en Llamas", "Compilación de cuentos escritos por Juan Rulfo", 150));
        libros.add(new LibroInterf(2, "Cien años de soledad", "Novela escrita por Gabriel García Márquez", 200));
        libros.add(new LibroInterf(3, "Don Quijote de la Mancha", "Novela escrita por Miguel de Cervantes", 180));
    }

    @Override
    public List<Libro> buscar(String... palabrasClaves) throws LibroNoEncontradoException {
        List<Libro> resultados = new ArrayList<>();

        for (Libro libro : libros) {
            for (String palabraClave : palabrasClaves) {
                if (libro.getInformacion().toLowerCase().contains(palabraClave.toLowerCase())) {
                    resultados.add(libro);
                    break;
                }
            }
        }

        if (resultados.isEmpty()) {
            throw new LibroNoEncontradoException("No se encontraron libros con las palabras claves proporcionadas");
        }

        return resultados;
    }
}
