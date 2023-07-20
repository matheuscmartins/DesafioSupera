package br.com.banco.resources;

import br.com.banco.domain.dtos.TransferDTO;
import br.com.banco.services.exceptions.ObjectNotFoundException;
import br.com.banco.services.TransferService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping(value = "/transfers")
public class TransferResource {
    @Autowired
    private ModelMapper mapper;
    @Autowired
    private TransferService transferService;

    @GetMapping
    public ResponseEntity<List<TransferDTO>> findAll() {
        return ResponseEntity.ok().body(transferService.findAll().stream().map(
                x -> mapper.map(x, TransferDTO.class)).collect(Collectors.toList()));
    }

    @GetMapping("/date/{date}")
    public ResponseEntity<List<TransferDTO>> findByDataTransfer(@PathVariable String dateTransfer) throws ObjectNotFoundException {
        return ResponseEntity.ok(transferService.findByDataTransfer(dateTransfer).stream().map(
                x -> mapper.map(x, TransferDTO.class)).collect(Collectors.toList()));
    }

    @GetMapping("/name/{name}")
    public ResponseEntity<List<TransferDTO>> findByAccountName(@PathVariable String name) throws ObjectNotFoundException {
        return ResponseEntity.ok(transferService.findByAccountName(name).stream().map(
                x -> mapper.map(x, TransferDTO.class)).collect(Collectors.toList()));
    }

    @GetMapping("/account/{id}")
    public ResponseEntity<List<TransferDTO>> findByAccountId(@PathVariable Integer id) throws ObjectNotFoundException {
        return ResponseEntity.ok(transferService.findByAccountId(id).stream().map(
                x -> mapper.map(x, TransferDTO.class)).collect(Collectors.toList()));
    }
}
