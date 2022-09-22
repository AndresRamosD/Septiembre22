package com.andresramos.app.controllers;

import com.andresramos.app.models.dao.IClienteDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class ClienteController {

    @Autowired//Para inyectar directamente, busca el componente en el contenedor, bean con esa interfaz (Lo encuentra gracias a la anotación @Repository del ClienteDaoImpl)
    private IClienteDao clienteDao;//Atributo del cliente DAO para poder realizar la consulta JPA

    @RequestMapping(value="listar",method= RequestMethod.GET)//Mapeo (Get viene por defecto si no se especifica
        public String listar(Model model){  //Importamos la clase Model para pasar datos a la vista
        model.addAttribute("titulo","Listado de clientes");
        model.addAttribute("clientes",clienteDao.findAll());//Otro atributo llamado clientes que nos da como resultado la ejecución del método findAll procedente de la interface IClienteDao
        return "listar"; //retornamos el nombre de la lista
    }
}
