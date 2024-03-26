package com.autor_libro.autor_libro.service;

import com.autor_libro.autor_libro.entity.Autor;
import java.util.List;
import java.util.UUID;

public interface AutorService {
 // Autor getById(UUID id);
  List<Autor> getAll();

  Autor findByName(String name);
}
