package com.autor_libro.autor_libro.repository;

import com.autor_libro.autor_libro.entity.Autor;
import com.autor_libro.autor_libro.entity.Libro;
import java.util.List;
import java.util.UUID;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LibroRepository extends JpaRepository<Libro, UUID>
{
  List<Libro> findByTitulo(String titulo);

  List<Libro> findByAnoPublicacion(Integer anioPublicacion);

}
