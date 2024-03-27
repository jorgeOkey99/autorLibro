package com.autor_libro.autor_libro.service;


import com.autor_libro.autor_libro.entity.Autor;
import com.autor_libro.autor_libro.entity.Libro;
import java.util.List;
import java.util.UUID;

public interface LibroService {
  Libro findById(UUID id);
  List<Libro> findByTitulo(String titulo);

  List<Libro> findByAnoPublicacion(Integer anioPublicacion);

  List<Libro> findAll();

  Libro save(Libro libroInput);
}
