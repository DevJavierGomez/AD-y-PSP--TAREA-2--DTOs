package com.salesianos.dam.AD_y_PSP__TAREA_2__DTOs.Producto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Categoria {

    private Long id;
    private String nombre;

}
