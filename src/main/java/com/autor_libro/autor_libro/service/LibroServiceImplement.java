package com.autor_libro.autor_libro.service;

import com.autor_libro.autor_libro.entity.Libro;
import com.autor_libro.autor_libro.repository.LibroRepository;
import jakarta.persistence.EntityNotFoundException;
import java.util.List;
import java.util.UUID;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class LibroServiceImplement implements LibroService{

  private LibroRepository libroRepository;

  @Override
  public Libro findById(UUID id) {

    return libroRepository.findById(id).orElseThrow(
        () -> new EntityNotFoundException("El libro no existe") );
  }

  @Override
  public List<Libro> findByTitulo(String titulo) {
    return libroRepository.findByTitulo(titulo);
  }

  @Override
  public List<Libro> findByAnoPublicacion(Integer anioPublicacion) {
    return libroRepository.findByAnoPublicacion(anioPublicacion);
  }

  @Override
  public List<Libro> findAll() {
    return libroRepository.findAll();
  }

  @Override
  public Libro save(Libro libroInput) {
    return null;
  }
}
