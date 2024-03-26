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
@RequestMapping("/autor")
@AllArgsConstructor
public class AutorController {
  private AutorRepository autorRepository;
  private AutorService autorService;
//  public AutorController(AutorRepository autorRepositoryInput) {
//    this.autorRepository=autorRepositoryInput;
//  }

  @PostMapping
  public Autor save(@RequestBody Autor autor){
    Autor autorSaved=autorRepository.save(autor);
    return autorSaved;
  }
  @GetMapping
  public List<Autor> getAll()
  {
    List <Autor> people= autorRepository.findAll();
    return people;
  }
  //get all alterno
  @GetMapping("/getAll")
  public List<Autor> getAll2()
  {
    List <Autor> people= autorRepository.findAll();
    return people;
  }
  //ACTUALIZAR
  @PutMapping("/{idAutor}")
  public Autor update(@PathVariable("idAutor") Long id,@RequestBody Autor autorInput)
  {

    Autor autorFound= autorRepository.findById(id).get();
    autorFound.setName(autorInput.getName());
    autorFound.setSexo(autorInput.getSexo());
    autorFound.setAno_defuncion(autorInput.getAno_defuncion());
    autorFound.setAno_nacimiento(autorInput.getAno_nacimiento());
    return (autorRepository.save(autorFound));
  }

  @DeleteMapping("/{idAutor}")
  public void delete (@PathVariable("idAutor")  Long id)
  {
    autorRepository.deleteById(id);
  }


  //GETID
  @GetMapping("/getId/{idAutor}")
  public Autor getId(@PathVariable("idAutor") Long id)
  {

    Autor autorFound= autorRepository.findById(id).get();
    return (autorFound);
  }

  @GetMapping("/findByName/{nameAutor}")
  public Autor getByNombre(@PathVariable("nameAutor") String nameAutor)
  {

    Autor autorFound= autorRepository.findByName(nameAutor);
    return (autorFound);
  }

}
