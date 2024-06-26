package com.autor_libro.autor_libro.repository;

import com.autor_libro.autor_libro.entity.Autor;
import java.util.List;
import java.util.Optional;
import java.util.UUID;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AutorRepository  extends JpaRepository <Autor, UUID>
{
    List<Autor>  findByName(String name);
    List<Autor> findBySexo(String sexo);

    List<Autor> findByAnoNacimiento(Integer anoNacimiento);

}
