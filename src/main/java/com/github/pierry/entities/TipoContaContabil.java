package com.github.pierry.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

// por omissao, o nome da tabela que o vai ser buscado é tipo_conta_contabil
// Caso seja outro nome deve ser adicionada a notação @Table(name = "novo_nome")
@Entity public class TipoContaContabil {

  @Id @GeneratedValue @Column(name = "ID_TIPO_CONTA_CONTABIL") private long id;

  @Column(name = "NOME_TIPO_CONTA_CONTABIL") private String name;

  @Column(name = "ATIVO") private boolean active;

  public long getId() {
    return id;
  }

  public void setId(long id) {
    this.id = id;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public boolean isActive() {
    return active;
  }

  public void setActive(boolean active) {
    this.active = active;
  }
}
