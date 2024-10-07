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

public class FacturaController {
    //Respuesta para todas las facturas - Get
    @GetMapping
    public String listarFacturas(){
        return "listados de todas las facturas - GET";
    }

    //Respuesta para una factura por id - Get
    @GetMapping("/id")
    public String ObtenerFactura(@PathVariable int id){
        return "Obtener una factura - GET" + id;
    }

    //Agregar una nueva factura - Post
    @PostMapping
    public String CrearFactura(@RequestBody String factura){
        return "Crear un nuevo proveedor - POST: " + factura; 
    }

    //Actualizar una factura - Put
    @PutMapping("/id")
    public String EditarFactura(@PathVariable int id, @RequestBody String factura){
        return "Actualizar una factura - PUT: " + factura + "con id: " + id;
    }

    //Eliminar una factura - Delate
    @DeleteMapping("/id")
    public String EliminarFactura(@PathVariable int id){
        return "Eliminar una factura - DELATE: " + id;
    }
    
}
