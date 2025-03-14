package com.api.casas.dominio.modelo.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public class DtoUbicacion {

    private Long id;
    private String ciudad;
    private String depertamento;
    private String descripcionCiudad;
    private String descripcionDepartamento;

}
