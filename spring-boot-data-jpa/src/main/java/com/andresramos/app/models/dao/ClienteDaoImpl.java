package com.andresramos.app.models.dao;

import com.andresramos.app.models.entity.Cliente;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

@Repository
public class ClienteDaoImpl implements IClienteDao{

    @PersistenceContext//Anotación para asociar a la unidad de persistencia
    private EntityManager em;

    @Override
    @Transactional(readOnly = true)//Anotación para que sólo LEA
    public List<Cliente> findAll() {//Método de la interface immplementado obligatoriamente
        return em.createQuery("from Cliente").getResultList();//OJO AL MANOJO
                                                                    //En esa Query decimos que from la clase Cliente dame una lista de resultados, getResultList
    }
}
