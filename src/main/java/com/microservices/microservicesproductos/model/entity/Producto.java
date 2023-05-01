package com.microservices.microservicesproductos.model.entity;


import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "productos")
@Setter
@Getter
public class Producto {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String nombre;
    private Double precio;
    private Date createAt;



}
