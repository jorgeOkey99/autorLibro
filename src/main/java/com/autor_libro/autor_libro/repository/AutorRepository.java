package com.autor_libro.autor_libro.repository;

import com.autor_libro.autor_libro.entity.Autor;
import java.util.Optional;
import java.util.UUID;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AutorRepository  extends JpaRepository <Autor, Long>
{

 // Autor getById(UUID idInput);

  //Optional<Object> findById(UUID id);
  Autor findByName(String nameInput);

}
