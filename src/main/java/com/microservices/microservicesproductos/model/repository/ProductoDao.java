package com.microservices.microservicesproductos.model.repository;

import com.microservices.microservicesproductos.model.entity.Producto;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductoDao extends JpaRepository<Producto,Long> {



}
