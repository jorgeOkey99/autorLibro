package com.autor_libro.autor_libro.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import java.util.UUID;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@Entity
public class Libro {
  @Id
  @GeneratedValue
  private UUID id;
  private  String titulo;
  private Integer ano_publicacion;

  public Libro(String titulo, Integer ano_publicacion) {
    this.titulo = titulo;
    this.ano_publicacion = ano_publicacion;
  }

  public String getTitulo() {
    return titulo;
  }

  public void setTitulo(String titulo) {
    this.titulo = titulo;
  }

  public Integer getAno_publicacion() {
    return ano_publicacion;
  }

  public void setAno_publicacion(Integer ano_publicacion) {
    this.ano_publicacion = ano_publicacion;
  }
}
