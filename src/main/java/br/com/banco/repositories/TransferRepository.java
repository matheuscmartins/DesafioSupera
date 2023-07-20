package br.com.banco.repositories;

import br.com.banco.domain.entities.Transfer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface TransferRepository  extends JpaRepository<Transfer, Integer> {

    Optional<List<Transfer>> findByDataTransfer(String dateTransfer);
   Optional<List<Transfer>> findByAccountName(String name);
    @Query(value ="SELECT * FROM transferencia t WHERE t.conta_id = :contaId", nativeQuery = true)
    Optional<List<Transfer>> findByAccountId(@Param("contaId") Integer contaId);


}
