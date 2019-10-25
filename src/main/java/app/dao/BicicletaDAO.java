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
@Repository("BicicletaDAO")
@Transactional(transactionManager="app-TransactionManager")
public interface BicicletaDAO extends JpaRepository<Bicicleta, java.lang.String> {

  /**
   * Obtém a instância de Bicicleta utilizando os identificadores
   * 
   * @param id
   *          Identificador 
   * @return Instância relacionada com o filtro indicado
   * @generated
   */    
  @Query("SELECT entity FROM Bicicleta entity WHERE entity.id = :id")
  public Bicicleta findOne(@Param(value="id") java.lang.String id);

  /**
   * Remove a instância de Bicicleta utilizando os identificadores
   * 
   * @param id
   *          Identificador 
   * @return Quantidade de modificações efetuadas
   * @generated
   */    
  @Modifying
  @Query("DELETE FROM Bicicleta entity WHERE entity.id = :id")
  public void delete(@Param(value="id") java.lang.String id);



  /**
   * OneToMany Relation
   * @generated
   */
  @Query("SELECT entity FROM Manutencao entity WHERE entity.bicicleta.id = :id")
  public Page<Manutencao> findManutencao(@Param(value="id") java.lang.String id, Pageable pageable);
  /**
   * ManyToOne Relation
   * @generated
   */
  @Query("SELECT entity.oficina FROM Manutencao entity WHERE entity.bicicleta.id = :id")
  public Page<Oficina> listOficina(@Param(value="id") java.lang.String id, Pageable pageable);

  /**
   * ManyToOne Relation Delete
   * @generated
   */
  @Modifying
  @Query("DELETE FROM Manutencao entity WHERE entity.bicicleta.id = :instanceId AND entity.oficina.id = :relationId")
  public int deleteOficina(@Param(value="instanceId") java.lang.String instanceId, @Param(value="relationId") java.lang.String relationId);

  /**
   * Foreign Key user
   * @generated
   */
  @Query("SELECT entity FROM Bicicleta entity WHERE entity.user.id = :id")
  public Page<Bicicleta> findBicicletasByUser(@Param(value="id") java.lang.String id, Pageable pageable);

}
