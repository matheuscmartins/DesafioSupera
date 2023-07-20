package br.com.banco.services.exceptions;

public class ObjectNotFoundException extends Exception{
    private static final long serialVersionUID = 1L;
    public ObjectNotFoundException(String msg){
        super(msg);

    }
}
