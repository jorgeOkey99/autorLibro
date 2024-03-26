package com.autor_libro.autor_libro.service;

import com.autor_libro.autor_libro.entity.Autor;
import com.autor_libro.autor_libro.repository.AutorRepository;
import jakarta.persistence.EntityNotFoundException;
import java.util.List;
import java.util.UUID;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class AutorServiceImplement implements  AutorService{

  private AutorRepository autorRepository;



//  @Override
//  public Autor getById(UUID id) {
//    //return null;
//    Autor autor = (Autor) autorRepository.findById(id).orElseThrow(()-> new EntityNotFoundException("Autor no Encontrado"));
//    return autor;
//  }

  @Override
  public List<Autor> getAll() {
    return null;
  }

  @Override
  public Autor findByName(String name) {

     return autorRepository.findByName(name);

  }

//  @Override
//  public Autor getNameAutor(String name) {
//    List <Autor> list = autorRepository.findAll();
//    //for indicamos la variable indice en 0 para recorrer toda la lista, de inicio a fin al final de cada iteracion el indice se incrementa en uno
//    for(int indice = 0;indice<list.size();indice++)
//    {
//      System.out.println(list.get(indice));
//    }
//    return null;
//  }

}
