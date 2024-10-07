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
@RequestMapping("/api/v1/ventas")

public class VentasController {
    //Obtener todas las ventas - Get
    @GetMapping
    public String ListarVentas(){
        return "listado de todas las ventas - GET";
    }

    //Obtener una venta por id - Get
    @GetMapping("/{id}")
    public String ObtenerVenta(@PathVariable int id){
        return "Obtener una venta - GET: " + id;
    }

    //Agregar una nueva venta - Post
    @PostMapping
    public String CrearVenta(@RequestBody String venta){
        return "crear una venta - POST: " + venta;
    }

    //Actualizar una venta - Put
    @PutMapping("/id")
    public String EditarVenta(@PathVariable int id, @RequestBody String venta){
        return "Actualizar una venta - PUT: " + venta + "con id: " + id;
    }

    //Eliminar una venta - Delate
    @DeleteMapping("/id")
    public String EliminarVenta(@PathVariable int id){
        return "Eliminar una venta - DELETE: " + id;
    }
    
    
}
