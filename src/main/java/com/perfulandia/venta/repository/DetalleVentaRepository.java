package com.perfulandia.venta.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.perfulandia.venta.model.DetalleVenta;

public interface DetalleVentaRepository extends JpaRepository<DetalleVenta, Long> {

    List<DetalleVenta>findByVentaId(Long venta_id);
    
}
