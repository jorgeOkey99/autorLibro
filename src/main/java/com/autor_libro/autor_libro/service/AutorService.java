package com.autor_libro.autor_libro.service;

import com.autor_libro.autor_libro.entity.Autor;
import java.util.List;
import java.util.UUID;

public interface AutorService {

  Autor findById(UUID id);

  List<Autor> findByName(String name);

  List<Autor> findBySexo(String sexo);

  List<Autor> findByAnoNacimiento(Integer anoNacimiento);

  List<Autor> findAll();

  Autor save(Autor autorInput);
}
