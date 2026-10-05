package com.salesianos.dam.AD_y_PSP__TAREA_2__DTOs.Producto;

public record ProductoDTO(
        String nombre,
        double precio,
        String imagen,
        String categoria
) {

    public static ProductoDTO of(Producto p) {
        if (p == null) {
            return null;
        }

        String primeraImagen = null;
        if (p.getImagenes() != null && !p.getImagenes().isEmpty()) {
            primeraImagen = p.getImagenes().get(0);
        }

        String nombreCategoria = (p.getCategoria() != null) ? p.getCategoria().getNombre() : null;

        return new ProductoDTO(
                p.getNombre(),
                p.getPrecio(),
                primeraImagen,
                nombreCategoria
        );

    }

}
