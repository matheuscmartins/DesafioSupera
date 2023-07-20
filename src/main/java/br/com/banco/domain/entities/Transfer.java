package br.com.banco.domain.entities;

import lombok.*;

import javax.persistence.*;
import java.io.Serializable;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "transferencia")
public class Transfer implements Serializable {
    private static final long serialVersionUID =1L;

    @Id
    private Integer id;
    @Column(name = "data_transferencia")
    private String dataTransfer;
    @Column(name = "valor")
    private Double value;
    @Column(name = "típo")
    private String type;
    @ManyToOne
    @JoinColumn(name = "conta_id")
    private Account account;
}
