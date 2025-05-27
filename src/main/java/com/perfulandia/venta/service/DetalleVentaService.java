package com.perfulandia.venta.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.perfulandia.venta.model.DetalleVenta;
import com.perfulandia.venta.repository.DetalleVentaRepository;


@Service
public class DetalleVentaService {
    // Repository permite acceder a los datos de detalle de venta en la BD
    @Autowired
    private DetalleVentaRepository detalleVentaRepository;

    //vamos a listar todos los detalles de las ventas
    public List<DetalleVenta> listarTodoDetalleVentas(){
        return detalleVentaRepository.findAll();   
    }

    //Metodo para guardar los detalles de las ventas
    public DetalleVenta guardarDetalleVenta(DetalleVenta detalleVen){
        return detalleVentaRepository.save(detalleVen);
    }

    //listar u obtener detalles de una venta especifica
    public List<DetalleVenta> listarDetalleVentaId(Long ventaId){
        return detalleVentaRepository.findByVentaId(ventaId);
    }
    
}
