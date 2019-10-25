package app.dao;

import app.entity.*;
import java.util.*;
import org.springframework.stereotype.*;
import org.springframework.data.jpa.repository.*;
import org.springframework.data.domain.*;
import org.springframework.data.repository.query.*;
import org.springframework.transaction.annotation.*; 


/**
 * Realiza operação de Create, Read, Update e Delete no banco de dados.
 * Os métodos de create, edit, delete e outros estão abstraídos no JpaRepository
 * 
 * @see org.springframework.data.jpa.repository.JpaRepository
 * 
 * @generated
 */
@Repository("OficinaDAO")
@Transactional(transactionManager="app-TransactionManager")
public interface OficinaDAO extends JpaRepository<Oficina, java.lang.String> {

  /**
   * Obtém a instância de Oficina utilizando os identificadores
   * 
   * @param id
   *          Identificador 
   * @return Instância relacionada com o filtro indicado
   * @generated
   */    
  @Query("SELECT entity FROM Oficina entity WHERE entity.id = :id")
  public Oficina findOne(@Param(value="id") java.lang.String id);

  /**
   * Remove a instância de Oficina utilizando os identificadores
   * 
   * @param id
   *          Identificador 
   * @return Quantidade de modificações efetuadas
   * @generated
   */    
  @Modifying
  @Query("DELETE FROM Oficina entity WHERE entity.id = :id")
  public void delete(@Param(value="id") java.lang.String id);



  /**
   * OneToMany Relation
   * @generated
   */
  @Query("SELECT entity FROM Manutencao entity WHERE entity.oficina.id = :id")
  public Page<Manutencao> findManutencao(@Param(value="id") java.lang.String id, Pageable pageable);
  /**
   * ManyToOne Relation
   * @generated
   */
  @Query("SELECT entity.bicicleta FROM Manutencao entity WHERE entity.oficina.id = :id")
  public Page<Bicicleta> listBicicleta(@Param(value="id") java.lang.String id, Pageable pageable);

  /**
   * ManyToOne Relation Delete
   * @generated
   */
  @Modifying
  @Query("DELETE FROM Manutencao entity WHERE entity.oficina.id = :instanceId AND entity.bicicleta.id = :relationId")
  public int deleteBicicleta(@Param(value="instanceId") java.lang.String instanceId, @Param(value="relationId") java.lang.String relationId);

}
