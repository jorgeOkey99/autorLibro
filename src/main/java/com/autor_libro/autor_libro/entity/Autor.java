package com.autor_libro.autor_libro.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import java.util.UUID;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name="autores")
public class Autor {

  @Id
  @GeneratedValue(strategy = GenerationType.UUID)
  private UUID id;

  @Column(name="name")
  private String name;

  @Column(name="sexo")
  private String sexo;

  @Column(name="ano_defuncion")
  private Integer anoDefuncion;

  @Column(name="ano_nacimiento")
  private Integer anoNacimiento;

  @Column(name="pais_origen")
  private String paisOrigen;

}
