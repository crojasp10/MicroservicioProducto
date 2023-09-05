package com.microservices.microservicesproductos.model.controller;


import com.microservices.microservicesproductos.model.entity.Producto;
import com.microservices.microservicesproductos.model.service.ProductoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.concurrent.TimeUnit;

@RestController
public class ProductoController {


    @Autowired
    private ProductoService productoService;

    @GetMapping("/listar")
    public List<Producto> listarProductos(){
        return productoService.findAll();
    }

    @GetMapping("/ver/{id}")
    public Producto detalleProducto(@PathVariable Long id) throws InterruptedException {
        if (id.equals(10L)){
            throw new IllegalStateException("Producto no encontrado");
        }
        if (id.equals(7L)){
            TimeUnit.SECONDS.sleep(5L);
        }
        return productoService.findById(id);
    }

    @PostMapping("/agregar")
    public Producto addProducto(@RequestBody Producto producto){
        return productoService.saveProducto(producto);
    }

}
