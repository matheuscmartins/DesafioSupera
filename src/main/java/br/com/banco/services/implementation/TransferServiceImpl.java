package br.com.banco.services.implementation;

import br.com.banco.domain.entities.Transfer;
import br.com.banco.repositories.TransferRepository;
import br.com.banco.services.TransferService;
import br.com.banco.services.exceptions.ObjectNotFoundException;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class TransferServiceImpl implements TransferService {
    @Autowired
    private TransferRepository transferRepository;

    @Autowired
    private ModelMapper mapper;
    @Override
    public List<Transfer> findAll() {
        return transferRepository.findAll();
    }

    @Override
    public List<Transfer> findByDataTransfer(String dateTransfer) throws ObjectNotFoundException {
        Optional<List<Transfer>> optionalList = transferRepository.findByDataTransfer(dateTransfer);
        return optionalList.orElseThrow(() -> new ObjectNotFoundException("Objeto não encontrado na data : " + dateTransfer));
    }

    @Override
    public List<Transfer> findByAccountName(String name) throws ObjectNotFoundException {
        Optional<List<Transfer>> optionalList = transferRepository.findByAccountName(name);
        return optionalList.orElseThrow(() -> new ObjectNotFoundException("Objeto não encontrado no nome: " + name));
    }

    @Override
    public List<Transfer> findByAccountId(Integer accountId) throws ObjectNotFoundException {
        Optional<List<Transfer>> optionalList = transferRepository.findByAccountId(accountId);
        return optionalList.orElseThrow(() -> new ObjectNotFoundException("Objeto não encontrado no id : " + accountId));
    }
}
