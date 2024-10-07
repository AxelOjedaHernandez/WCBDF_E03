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

public class ProveedoresController {
    //Respuesta para todas los proveedores - Get
    @GetMapping
    public String listarProveedores(){
        return "listados de todos los proveedores - GET";
    }

    //Respuesta para un proveedor por id - Get
    @GetMapping("/id")
    public String ObtenerProveedor(@PathVariable int id){
        return "Obtener un proveedor - GET" + id;
    }

    //Agregar un nuevo proveedor - Post
    @PostMapping
    public String CrearProveedor(@RequestBody String proveedor){
        return "Crear un nuevo proveedor - POST: " + proveedor; 
    }

    //Actualizar un proveedor - Put
    @PutMapping("/id")
    public String EditarProveedor(@PathVariable int id, @RequestBody String proveedor){
        return "Actualizar un proveedor - PUT: " + proveedor + "con id: " + id;
    }

    //Eliminar un proveedor - Delate
    @DeleteMapping("/id")
    public String EliminarProveedor(@PathVariable int id){
        return "Eliminar un proveedor - DELATE: " + id;
    }
    
}
