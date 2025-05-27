package com.perfulandia.venta.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.perfulandia.venta.model.Venta;

public interface VentaRepository extends JpaRepository<Venta, Long> {

    List<Venta>findByClienteId(Long clienteId);
    
}
