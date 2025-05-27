package com.perfulandia.venta.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.perfulandia.venta.model.DetalleVenta;
import com.perfulandia.venta.model.Venta;
import com.perfulandia.venta.repository.VentaRepository;

@Service
public class VentaService {

    // Repository permite acceder a los datos de ventas de la BD
    @Autowired
    private VentaRepository ventaRepository;

    // Metodo obtener una venta, lista que devuelve todas las ventas
    public List<Venta> listarVentas() {
        return ventaRepository.findAll();
    }

    // Crear una venta con sus detalles (relación correcta)
    public Venta crearVenta(Venta venta) {
        double total = 0.0;
        if (venta.getDetalles() != null) {
            for (DetalleVenta detalle : venta.getDetalles()) {
                detalle.setVenta(venta);
                // Calcula el subtotal de cada detalle y súma al total general
                total += detalle.getCantidad() * detalle.getPrecioUnitario();
            }
        }
        venta.setTotal(total); // Asigna el total calculado
        return ventaRepository.save(venta);
    }

    // Buscar una venta por ID
    public Optional<Venta> buscarVentaPorId(Long id) {

        return ventaRepository.findById(id);
    }

}
