package com.autor_libro.autor_libro.controller;

import com.autor_libro.autor_libro.entity.Autor;
import com.autor_libro.autor_libro.repository.AutorRepository;
import com.autor_libro.autor_libro.service.AutorService;
import java.util.List;
import java.util.UUID;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/autores")
@AllArgsConstructor
public class AutorController {

  private AutorService autorService;

  @GetMapping("/{idAutor}")
  public Autor findById(@PathVariable("idAutor") UUID idAutor){
    return autorService.findById(idAutor);
  }

  @GetMapping("/name/{name}")
  public List<Autor> findByName(@PathVariable("name") String name){
    return autorService.findByName(name);
  }


   @GetMapping("/sexo/{sx}")
   public List<Autor> findBySexo(@PathVariable("sx") String name){
      return autorService.findBySexo(name);
   }

   @GetMapping("/findall")
   public List<Autor> findall()
   {
       return autorService.findAll();
   }

  @GetMapping("/anioNacimiento/{nc}")
  public List<Autor> findByAnoNacimiento(@PathVariable("nc") Integer anio){
    return autorService.findByAnoNacimiento(anio);
  }

  @PutMapping("/{idAutor}")
  public Autor update(@PathVariable("idAutor")  UUID id,@RequestBody Autor autorInput)
  {
    Autor autorFound= autorService.findById(id);
    return (autorService.save(autorFound));
  }
}
