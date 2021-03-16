package org.biblioteca.excepciones;

import java.io.Serializable;

/**
 *
 * @author user
 */
public class LibroNoEncontradoException extends Exception implements Serializable {

    public LibroNoEncontradoException() {
        super("No hay resultados para la busqueda realizada.");
    }

    public LibroNoEncontradoException(String message) {
        super(message);
    }
    
}
