package com.upiiz.ventas.controllers;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping

public class ClienteController {
    //Respuesta para todos los clientes - Get
    @GetMapping
    public String listarClietes(){
        return "listados de todos los clientes - GET";
    }

    //Respuesta para un cliente por id - Get
    @GetMapping("/id")
    public String ObtenerCliente(@PathVariable int id){
        return "Obtener un cliente - GET" + id;
    }

    //Agregar un nuevo cliente - Post
    @PostMapping
    public String CrearCliente(@RequestBody String cliente){
        return "Crear un nuevo cliente - POST: " + cliente; 
    }

    //Actualizar un cliente - Put
    @PutMapping("/id")
    public String EditarCliente(@PathVariable int id, @RequestBody String cliente){
        return "Actualizar un cliente - PUT: " + cliente + "con id: " + id;
    }

    //Eliminar un cliente - Delate
    @DeleteMapping("/id")
    public String EliminarCliente(@PathVariable int id){
        return "Eliminar un cliente - DELATE: " + id;
    }
}
