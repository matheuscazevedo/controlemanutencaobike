package app.entity;

import java.io.*;
import javax.persistence.*;
import java.util.*;
import javax.xml.bind.annotation.*;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonFilter;
import cronapi.rest.security.CronappSecurity;


/**
 * Classe que representa a tabela MANUTENCAO
 * @generated
 */
@Entity
@Table(name = "\"MANUTENCAO\"")
@XmlRootElement
@CronappSecurity
@JsonFilter("app.entity.Manutencao")
public class Manutencao implements Serializable {

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
  @ManyToOne
  @JoinColumn(name="fk_bicicleta", nullable = true, referencedColumnName = "id", insertable=true, updatable=true)
  
  private Bicicleta bicicleta;

  /**
  * @generated
  */
  @ManyToOne
  @JoinColumn(name="fk_oficina", nullable = true, referencedColumnName = "id", insertable=true, updatable=true)
  
  private Oficina oficina;

  /**
  * @generated
  */
  @Temporal(TemporalType.DATE)
  @Column(name = "data", nullable = true, unique = false, insertable=true, updatable=true)
  
  private java.util.Date data;

  /**
  * @generated
  */
  @Column(name = "preco", nullable = true, unique = false, precision=8, scale=2, insertable=true, updatable=true)
  
  private java.lang.Double preco;

  /**
  * @generated
  */
  @Column(name = "status", nullable = true, unique = false, insertable=true, updatable=true)
  
  private java.lang.String status;

  /**
  * @generated
  */
  @Column(name = "observacao", nullable = true, unique = false, insertable=true, updatable=true)
  
  private java.lang.String observacao;

  /**
   * Construtor
   * @generated
   */
  public Manutencao(){
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
  public Manutencao setId(java.lang.String id){
    this.id = id;
    return this;
  }

  /**
   * Obtém bicicleta
   * return bicicleta
   * @generated
   */
  
  public Bicicleta getBicicleta(){
    return this.bicicleta;
  }

  /**
   * Define bicicleta
   * @param bicicleta bicicleta
   * @generated
   */
  public Manutencao setBicicleta(Bicicleta bicicleta){
    this.bicicleta = bicicleta;
    return this;
  }

  /**
   * Obtém oficina
   * return oficina
   * @generated
   */
  
  public Oficina getOficina(){
    return this.oficina;
  }

  /**
   * Define oficina
   * @param oficina oficina
   * @generated
   */
  public Manutencao setOficina(Oficina oficina){
    this.oficina = oficina;
    return this;
  }

  /**
   * Obtém data
   * return data
   * @generated
   */
  
  public java.util.Date getData(){
    return this.data;
  }

  /**
   * Define data
   * @param data data
   * @generated
   */
  public Manutencao setData(java.util.Date data){
    this.data = data;
    return this;
  }

  /**
   * Obtém preco
   * return preco
   * @generated
   */
  
  public java.lang.Double getPreco(){
    return this.preco;
  }

  /**
   * Define preco
   * @param preco preco
   * @generated
   */
  public Manutencao setPreco(java.lang.Double preco){
    this.preco = preco;
    return this;
  }

  /**
   * Obtém status
   * return status
   * @generated
   */
  
  public java.lang.String getStatus(){
    return this.status;
  }

  /**
   * Define status
   * @param status status
   * @generated
   */
  public Manutencao setStatus(java.lang.String status){
    this.status = status;
    return this;
  }

  /**
   * Obtém observacao
   * return observacao
   * @generated
   */
  
  public java.lang.String getObservacao(){
    return this.observacao;
  }

  /**
   * Define observacao
   * @param observacao observacao
   * @generated
   */
  public Manutencao setObservacao(java.lang.String observacao){
    this.observacao = observacao;
    return this;
  }

  /**
   * @generated
   */
  @Override
  public boolean equals(Object obj) {
    if (this == obj) return true;
    if (obj == null || getClass() != obj.getClass()) return false;
    Manutencao object = (Manutencao)obj;
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
