package br.com.banco.domain.entities;

import lombok.*;

import javax.persistence.*;
import java.io.Serializable;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "conta")
public class Account implements Serializable {
    private static final long serialVersionUID =1L;
    @Id
    @Column(name = "id_conta")
    private Integer id;
    @Column(name = "nome_responsavel")
    private String name;
}
