package app.entity;

import java.io.*;
import javax.persistence.*;
import java.util.*;
import javax.xml.bind.annotation.*;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonFilter;
import cronapi.rest.security.CronappSecurity;


/**
 * Classe que representa a tabela OFICINA
 * @generated
 */
@Entity
@Table(name = "\"OFICINA\"")
@XmlRootElement
@CronappSecurity
@JsonFilter("app.entity.Oficina")
public class Oficina implements Serializable {

  /**
   * UID da classe, necessário na serialização
   * @generated
   */
  private static final long serialVersionUID = 1L;

  /**
   * @generated
   */
  @Id
  @Column(name = "id", nullable = false, insertable=true, updatable=true)
  private java.lang.String id = UUID.randomUUID().toString().toUpperCase();

  /**
  * @generated
  */
  @Column(name = "oficina", nullable = true, unique = false, insertable=true, updatable=true)
  
  private java.lang.String oficina;

  /**
  * @generated
  */
  @Column(name = "endereco", nullable = true, unique = false, insertable=true, updatable=true)
  
  private java.lang.String endereco;

  /**
  * @generated
  */
  @Column(name = "cidade", nullable = true, unique = false, insertable=true, updatable=true)
  
  private java.lang.String cidade;

  /**
  * @generated
  */
  @Column(name = "uf", nullable = true, unique = false, insertable=true, updatable=true)
  
  private java.lang.String uf;

  /**
   * Construtor
   * @generated
   */
  public Oficina(){
  }


  /**
   * Obtém id
   * return id
   * @generated
   */
  
  public java.lang.String getId(){
    return this.id;
  }

  /**
   * Define id
   * @param id id
   * @generated
   */
  public Oficina setId(java.lang.String id){
    this.id = id;
    return this;
  }

  /**
   * Obtém oficina
   * return oficina
   * @generated
   */
  
  public java.lang.String getOficina(){
    return this.oficina;
  }

  /**
   * Define oficina
   * @param oficina oficina
   * @generated
   */
  public Oficina setOficina(java.lang.String oficina){
    this.oficina = oficina;
    return this;
  }

  /**
   * Obtém endereco
   * return endereco
   * @generated
   */
  
  public java.lang.String getEndereco(){
    return this.endereco;
  }

  /**
   * Define endereco
   * @param endereco endereco
   * @generated
   */
  public Oficina setEndereco(java.lang.String endereco){
    this.endereco = endereco;
    return this;
  }

  /**
   * Obtém cidade
   * return cidade
   * @generated
   */
  
  public java.lang.String getCidade(){
    return this.cidade;
  }

  /**
   * Define cidade
   * @param cidade cidade
   * @generated
   */
  public Oficina setCidade(java.lang.String cidade){
    this.cidade = cidade;
    return this;
  }

  /**
   * Obtém uf
   * return uf
   * @generated
   */
  
  public java.lang.String getUf(){
    return this.uf;
  }

  /**
   * Define uf
   * @param uf uf
   * @generated
   */
  public Oficina setUf(java.lang.String uf){
    this.uf = uf;
    return this;
  }

  /**
   * @generated
   */
  @Override
  public boolean equals(Object obj) {
    if (this == obj) return true;
    if (obj == null || getClass() != obj.getClass()) return false;
    Oficina object = (Oficina)obj;
    if (id != null ? !id.equals(object.id) : object.id != null) return false;
    return true;
  }

  /**
   * @generated
   */
  @Override
  public int hashCode() {
    int result = 1;
    result = 31 * result + ((id == null) ? 0 : id.hashCode());
    return result;
  }

}
