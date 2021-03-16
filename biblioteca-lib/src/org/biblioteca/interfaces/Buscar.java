package org.biblioteca.interfaces;

import java.util.List;


public interface Buscar {
    List<Libro> buscar(String ... palabrasClave) throws Exception;
}
