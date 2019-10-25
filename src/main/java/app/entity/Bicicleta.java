package app.entity;

import java.io.*;
import javax.persistence.*;
import java.util.*;
import javax.xml.bind.annotation.*;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonFilter;
import cronapi.rest.security.CronappSecurity;


/**
 * Classe que representa a tabela BICICLETA
 * @generated
 */
@Entity
@Table(name = "\"BICICLETA\"" ,uniqueConstraints=@UniqueConstraint(columnNames={
"nSerie" }))
@XmlRootElement
@CronappSecurity
@JsonFilter("app.entity.Bicicleta")
public class Bicicleta implements Serializable {

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
  @Column(name = "nSerie", nullable = true, unique = true, insertable=true, updatable=true)
  
  private java.lang.String nserie;

  /**
  * @generated
  */
  @Column(name = "tipo", nullable = true, unique = false, insertable=true, updatable=true)
  
  private java.lang.String tipo;

  /**
  * @generated
  */
  @Column(name = "marca", nullable = true, unique = false, insertable=true, updatable=true)
  
  private java.lang.String marca;

  /**
  * @generated
  */
  @Column(name = "aro", nullable = true, unique = false, insertable=true, updatable=true)
  
  private java.lang.String aro;

  /**
  * @generated
  */
  @ManyToOne
  @JoinColumn(name="fk_user", nullable = true, referencedColumnName = "id", insertable=true, updatable=true)
  
  private User user;

  /**
   * Construtor
   * @generated
   */
  public Bicicleta(){
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
  public Bicicleta setId(java.lang.String id){
    this.id = id;
    return this;
  }

  /**
   * Obtém nserie
   * return nserie
   * @generated
   */
  
  public java.lang.String getNserie(){
    return this.nserie;
  }

  /**
   * Define nserie
   * @param nserie nserie
   * @generated
   */
  public Bicicleta setNserie(java.lang.String nserie){
    this.nserie = nserie;
    return this;
  }

  /**
   * Obtém tipo
   * return tipo
   * @generated
   */
  
  public java.lang.String getTipo(){
    return this.tipo;
  }

  /**
   * Define tipo
   * @param tipo tipo
   * @generated
   */
  public Bicicleta setTipo(java.lang.String tipo){
    this.tipo = tipo;
    return this;
  }

  /**
   * Obtém marca
   * return marca
   * @generated
   */
  
  public java.lang.String getMarca(){
    return this.marca;
  }

  /**
   * Define marca
   * @param marca marca
   * @generated
   */
  public Bicicleta setMarca(java.lang.String marca){
    this.marca = marca;
    return this;
  }

  /**
   * Obtém aro
   * return aro
   * @generated
   */
  
  public java.lang.String getAro(){
    return this.aro;
  }

  /**
   * Define aro
   * @param aro aro
   * @generated
   */
  public Bicicleta setAro(java.lang.String aro){
    this.aro = aro;
    return this;
  }

  /**
   * Obtém user
   * return user
   * @generated
   */
  
  public User getUser(){
    return this.user;
  }

  /**
   * Define user
   * @param user user
   * @generated
   */
  public Bicicleta setUser(User user){
    this.user = user;
    return this;
  }

  /**
   * @generated
   */
  @Override
  public boolean equals(Object obj) {
    if (this == obj) return true;
    if (obj == null || getClass() != obj.getClass()) return false;
    Bicicleta object = (Bicicleta)obj;
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
