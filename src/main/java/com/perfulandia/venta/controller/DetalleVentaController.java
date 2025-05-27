package com.perfulandia.venta.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.perfulandia.venta.model.DetalleVenta;
import com.perfulandia.venta.service.DetalleVentaService;

@RestController
@RequestMapping("/detalle_venta")
public class DetalleVentaController {

    @Autowired
    private DetalleVentaService detalleVentaService;

    // POST /detalle_venta
    //Este método recibe un objeto DetalleVenta en formato JSON y lo guarda en la base de datos
     @PostMapping
    public DetalleVenta guardarDetalle(@RequestBody DetalleVenta detalleVenta) {
        return detalleVentaService.guardarDetalleVenta(detalleVenta);
    }

    //GET /detalle_venta
    //Este método devuelve una lista con todos los detalles de venta guardados en la base de datos
    @GetMapping
    public List<DetalleVenta> listarDetallesVentas() {
        return detalleVentaService.listarTodoDetalleVentas();
    }

     //GET/detalle_venta/venta/{ventaId}
    //Este método devuelve todos los detalles de venta que pertenecen a una venta específica (por su ID)
    @GetMapping("/venta/{ventaId}")
    public List<DetalleVenta> listarPorVentaId(@PathVariable Long ventaId) {
        return detalleVentaService.listarDetalleVentaId(ventaId);
    }

}
    
