package com.Leuch.CrudDeClientes.services.exceptions;

public class ResourceNotFoundException extends  RuntimeException{
    public ResourceNotFoundException(String msg)
    {
        super(msg);
    }
}
