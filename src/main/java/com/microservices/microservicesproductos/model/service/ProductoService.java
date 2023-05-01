package com.microservices.microservicesproductos.model.service;

import com.microservices.microservicesproductos.model.entity.Producto;

import java.util.List;

public interface ProductoService {

    public List<Producto>  findAll();
    public  Producto findById(Long id);
    public Producto saveProducto(Producto producto);
}
