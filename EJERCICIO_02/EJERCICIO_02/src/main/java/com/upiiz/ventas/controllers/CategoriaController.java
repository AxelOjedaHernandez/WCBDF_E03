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
@RequestMapping("/api/v1/categorias")

public class CategoriaController {
    //Respuesta para todas las categorias - Get
    @GetMapping
    public String listarCategorias(){
        return "listados de todas las categorias - GET";
    }
    
    //Respuesta para una categoria por id - Get
    @GetMapping("/{id}")
    public String ObtenerCategoria(@PathVariable int id){
        return "Obtener una categoria - GET" + id;
    }

    //Agregar una nueva categoria - Post
    @PostMapping
    public String CrearCategoria(@RequestBody String categoria){
        return "Crear una categoria - POST:" + categoria ;
    }

    //Actualizar una categoria - Put
    @PutMapping("/{id}")
    public String EditarCategoria(@PathVariable int id, @RequestBody String categoria){
        return "Actualizar una categoria - PUT:" + categoria + "Con id: " + id;
    }

    //Eliminar una categoria - Delate
    @DeleteMapping("/{id}")
    public String EliminarCategoria(@PathVariable int id){
        return "Eliminar una categoria - DELETE: " + id;
    }

}
