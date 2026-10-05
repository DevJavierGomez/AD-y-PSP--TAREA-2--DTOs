package com.salesianos.dam.AD_y_PSP__TAREA_2__DTOs.Alumno;

public record AlumnoDTO(
        String nombre,
        String apellidos,
        String email,
        String curso,
        String direccion
) {

    public static AlumnoDTO fromEntity(Alumno a) {
        if (a == null) {
            return null;

        }

        String apellidosJuntos = a.getApellido1() + " " + a.getApellido2();

        String nombreCurso = (a.getCurso() != null ? a.getCurso().getNombre() : null);

        String direccionTexto = null;
        if (a.getDireccion() != null) {
            direccionTexto = a.getDireccion().getTipoVia() + " " +
                             a.getDireccion().getLinea1() + ", " +
                             a.getDireccion().getPoblacion();
        }

        return new AlumnoDTO(
                a.getNombre(),
                apellidosJuntos,
                a.getEmail(),
                nombreCurso,
                direccionTexto
        );

    }

}
