// package com.perfulandia.venta.service;

// import java.util.List;
// import java.util.Optional;

// import org.springframework.beans.factory.annotation.Autowired;
// import org.springframework.stereotype.Service;

// import com.perfulandia.venta.model.Cupon;
// import com.perfulandia.venta.repository.CuponRepository;

// @Service
// public class CuponService {
//     //Repository permite acceder a los datos de los cupones en la BD
//     @Autowired
//     private CuponRepository cuponRepository;

//     // Listar todos los cupones existentes
//     public List<Cupon> listarTodosCupones(){
//         return cuponRepository.findAll();   
//     }

//     //Metodo para guardar los cupones
//     public Cupon guardarCupon(Cupon cupon){
//         return cuponRepository.save(cupon);
//     }

//     // Buscar un cupón por su ID
//     public Optional<Cupon> buscarCuponPorId(Integer id){
//         return cuponRepository.findById(id);
//     }

//     // Buscar un cupón por codigo
//     public Optional<Cupon> buscarCuponPorCodigo(String codigo){
//         return cuponRepository.findByCodigo(codigo);
//     }
    
// }
