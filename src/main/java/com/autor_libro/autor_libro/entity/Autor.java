package com.autor_libro.autor_libro.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import java.util.UUID;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

//@NoArgsConstructor
@Entity
//@Table(name="categories")
@Getter
@Setter
public class Autor {
  @Id
  @GeneratedValue(strategy = GenerationType.SEQUENCE)
  private long id;

  private  String name;
  private String sexo;
  private Integer ano_defuncion;
  private Integer ano_nacimiento;
  private  String pais_origen;
//
//  public Autor() {
//  }
//
//  public long getId() {
//    return id;
//  }
//
//  public void setId(long id) {
//    this.id = id;
//  }
//
//  public Autor(String name, String sexo, Integer ano_defuncion, Integer ano_nacimiento,
//      String pais_origen) {
//    this.name = name;
//    this.sexo = sexo;
//    this.ano_defuncion = ano_defuncion;
//    this.ano_nacimiento = ano_nacimiento;
//    this.pais_origen = pais_origen;
//  }
//
//
//
//  public String getName() {
//    return name;
//  }
//
//  public void setName(String name) {
//    this.name = name;
//  }
//
//  public String getSexo() {
//    return sexo;
//  }
//
//  public void setSexo(String sexo) {
//    this.sexo = sexo;
//  }
//
//  public Integer getAno_defuncion() {
//    return ano_defuncion;
//  }
//
//  public void setAno_defuncion(Integer ano_defuncion) {
//    this.ano_defuncion = ano_defuncion;
//  }
//
//  public Integer getAno_nacimiento() {
//    return ano_nacimiento;
//  }
//
//  public void setAno_nacimiento(Integer ano_nacimiento) {
//    this.ano_nacimiento = ano_nacimiento;
//  }
//
//  public String getPais_origen() {
//    return pais_origen;
//  }
//
//  public void setPais_origen(String pais_origen) {
//    this.pais_origen = pais_origen;
//  }
}
