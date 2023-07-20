package br.com.banco.services;

import br.com.banco.domain.entities.Transfer;
import br.com.banco.services.exceptions.ObjectNotFoundException;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public interface TransferService {
    List<Transfer> findAll();
    List<Transfer> findByDataTransfer(String dateTransfer) throws ObjectNotFoundException;
    List<Transfer> findByAccountName(String name) throws ObjectNotFoundException;
    List<Transfer> findByAccountId(Integer accountId) throws ObjectNotFoundException;
}
