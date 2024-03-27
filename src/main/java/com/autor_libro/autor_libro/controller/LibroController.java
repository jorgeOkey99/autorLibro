package com.autor_libro.autor_libro.controller;

import com.autor_libro.autor_libro.entity.Autor;
import com.autor_libro.autor_libro.entity.Libro;
import com.autor_libro.autor_libro.service.LibroService;
import java.util.List;
import java.util.UUID;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/libros")
@AllArgsConstructor
public class LibroController {
  private LibroService libroService;

  @GetMapping("/{idLibro}")
  public Libro findById(@PathVariable("idLibro") UUID idLibro){
    return libroService.findById(idLibro);
  }


  @GetMapping("/titulo/{titulo}")
  public List<Libro> findByName(@PathVariable("titulo") String titulo){
    return libroService.findByTitulo(titulo);
  }


  @GetMapping("/anoPublicacion/{anoPublicacion}")
  public List<Libro> findByAnoPublicacion(@PathVariable("anoPublicacion") Integer anoPublicacion){
    return libroService.findByAnoPublicacion(anoPublicacion);
  }

  @GetMapping("/findall")
  public List<Libro> findall()
  {
    return libroService.findAll();
  }

}
