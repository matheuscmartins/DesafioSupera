package br.com.banco.services.exceptions;

//classe criada para retornar uma exception de DataIntegraty
public class DataIntegratyViolationException extends RuntimeException{
    public DataIntegratyViolationException(String message) {
        super(message);
    }
}
