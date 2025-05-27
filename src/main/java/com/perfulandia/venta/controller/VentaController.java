package com.perfulandia.venta.controller;

import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.perfulandia.venta.model.Venta;
import com.perfulandia.venta.service.VentaService;

@RestController
@RequestMapping("/ventas")
public class VentaController {

    @Autowired
    private VentaService ventaService;

    // CREATE: Este método llama al Service (VentaService), 
    //que internamente ya guarda la venta usando .save()
    @PostMapping
    public Venta crearVenta(@RequestBody Venta venta){
        return ventaService.crearVenta(venta);   
    }

     
    @GetMapping("/{id}")
    public Optional<Venta> obtenerVentaPorId(@PathVariable Long id){
        //"Busca una venta con ese ID. Si existe,la guardamos. Si no, es como una caja vacía
      return ventaService.buscarVentaPorId(id);
   } 
}
