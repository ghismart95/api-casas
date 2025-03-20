package com.api.casas.aplicacion.comando;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class ComandoUbicacion {

    private Long id;
    private String ciudad;
    private String departamento;
    private String descripcionCiudad;
    private String descripcionDepartamento;

}
