package com.autor_libro.autor_libro.service;

import com.autor_libro.autor_libro.entity.Autor;
import com.autor_libro.autor_libro.repository.AutorRepository;
import jakarta.persistence.EntityNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.UUID;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class AutorServiceImplement implements  AutorService{


  private AutorRepository autorRepository;
  @Override
  public Autor findById(UUID id) {

    return autorRepository.findById(id).orElseThrow(
        () -> new EntityNotFoundException("El autor no existe") );
  }

  @Override
  public List<Autor> findByName(String name) {
    return autorRepository.findByName(name);
  }

  @Override
  public List<Autor> findBySexo(String sexo) {
    return autorRepository.findBySexo(sexo);
  }

  @Override
  public List<Autor> findByAnoNacimiento(Integer anoNacimiento) {
    return autorRepository.findByAnoNacimiento(anoNacimiento);
  }

  @Override
  public List<Autor> findAll() {
    return autorRepository.findAll();
  }

  @Override
  public Autor save(Autor autorInput) {
    return autorRepository.save(autorInput);
  }
}
