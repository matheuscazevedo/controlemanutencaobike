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
@Repository("ManutencaoDAO")
@Transactional(transactionManager="app-TransactionManager")
public interface ManutencaoDAO extends JpaRepository<Manutencao, java.lang.String> {

  /**
   * Obtém a instância de Manutencao utilizando os identificadores
   * 
   * @param id
   *          Identificador 
   * @return Instância relacionada com o filtro indicado
   * @generated
   */    
  @Query("SELECT entity FROM Manutencao entity WHERE entity.id = :id")
  public Manutencao findOne(@Param(value="id") java.lang.String id);

  /**
   * Remove a instância de Manutencao utilizando os identificadores
   * 
   * @param id
   *          Identificador 
   * @return Quantidade de modificações efetuadas
   * @generated
   */    
  @Modifying
  @Query("DELETE FROM Manutencao entity WHERE entity.id = :id")
  public void delete(@Param(value="id") java.lang.String id);



  /**
   * Foreign Key bicicleta
   * @generated
   */
  @Query("SELECT entity FROM Manutencao entity WHERE entity.bicicleta.id = :id")
  public Page<Manutencao> findManutencaosByBicicleta(@Param(value="id") java.lang.String id, Pageable pageable);

  /**
   * Foreign Key oficina
   * @generated
   */
  @Query("SELECT entity FROM Manutencao entity WHERE entity.oficina.id = :id")
  public Page<Manutencao> findManutencaosByOficina(@Param(value="id") java.lang.String id, Pageable pageable);

}
