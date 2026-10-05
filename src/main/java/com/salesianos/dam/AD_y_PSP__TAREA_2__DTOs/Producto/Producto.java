package com.salesianos.dam.AD_y_PSP__TAREA_2__DTOs.Producto;

import jakarta.persistence.ManyToOne;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Producto {

    private Long id;
    private String nombre;
    private double precio;
    private String descripcion;
    private List<String> imagenes;

    @ManyToOne
    private Categoria categoria;

}
