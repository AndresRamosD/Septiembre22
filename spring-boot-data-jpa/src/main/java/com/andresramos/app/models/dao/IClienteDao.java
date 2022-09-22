package com.andresramos.app.models.dao;

import com.andresramos.app.models.entity.Cliente;

import java.util.List;

public interface IClienteDao {

    public List<Cliente> findAll(); //Pues una lista de Clientes llamada findAll
}
