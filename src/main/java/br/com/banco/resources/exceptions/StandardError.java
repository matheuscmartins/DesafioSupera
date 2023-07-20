package br.com.banco.resources.exceptions;

import lombok.AllArgsConstructor;
import lombok.Getter;


import java.time.LocalDateTime;

//classe para tratamento de erro de exceptions
@Getter
@AllArgsConstructor
public class StandardError {
    private LocalDateTime timestamp;
    private Integer status;
    private String error;
    private String path;
}
