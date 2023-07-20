package br.com.banco.domain.dtos;

import br.com.banco.domain.entities.Account;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class TransferDTO{

    private Integer id;
    private String dataTransfer;
    private Double value;
    private String type;
    private Account account;
}