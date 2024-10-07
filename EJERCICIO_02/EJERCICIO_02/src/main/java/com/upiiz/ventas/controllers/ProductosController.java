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
@RequestMapping("/api/v1/productos")

public class ProductosController {
    //Respuesta para todas las categorias - Get
    @GetMapping
    public String listarProductos(){
        return "listados de todos los productos - GET";
    }

    //Respuesta para una categoria por id - Get
    @GetMapping("/id")
    public String ObtenerProducto(@PathVariable int id){
        return "Obtener un producto - GET" + id;
    }

    //Agregar una nueva categoria - Post
    @PostMapping
    public String CrearProducto(@RequestBody String producto){
        return "Crear un nuevo producto - POST: " + producto; 
    }

    //Actualizar una categoria - Put
    @PutMapping("/id")
    public String EditarProducto(@PathVariable int id, @RequestBody String producto){
        return "Actualizar un producto - PUT: " + producto + "con id: " + id;
    }

    //Eliminar una categoria - Delate
    @DeleteMapping("/id")
    public String EliminarProducto(@PathVariable int id){
        return "Eliminar un producto - DELATE: " + id;
    }
    
}
