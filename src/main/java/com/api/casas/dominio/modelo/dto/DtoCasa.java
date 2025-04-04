package com.api.casas.dominio.modelo.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public class DtoCasa {

    private Long id;
    private String nombre;
    private String descripcion;
    private int cantidadCuartos;
    private int cantidadBaños;
    private double precio;
    private String ciudad;
    private String departamento;

}
