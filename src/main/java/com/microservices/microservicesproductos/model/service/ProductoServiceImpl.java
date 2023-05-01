package com.microservices.microservicesproductos.model.service;

import com.microservices.microservicesproductos.model.entity.Producto;
import com.microservices.microservicesproductos.model.repository.ProductoDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class ProductoServiceImpl implements ProductoService {

    @Autowired
    private ProductoDao productoDao;

    @Override
    @Transactional(readOnly = true)
    public List<Producto> findAll() {
       return (List<Producto>) productoDao.findAll();
    }

    @Override
    @Transactional(readOnly = true)
    public Producto findById(Long id) {
        return (Producto) productoDao.findById(id).orElse(null);
    }

    @Override
    public Producto saveProducto(Producto producto) {
        return productoDao.save(producto);
    }


}
