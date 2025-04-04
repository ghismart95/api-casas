package com.api.casas.aplicacion.comando;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class ComandoCasa {

    private Long id;

    @NotBlank
    @Size(min = 0, max = 50)
    private String nombre;

    @Size(min = 0, max = 90)
    private String descripcion;

    @Size(min = 0, max = 50)
    private String cantidadCuarto;

    @Size(min = 0, max = 50)
    private String cantidadBaños;

    @Size(min = 0, max = 50)
    private String precio;

    @Size(min = 0, max = 50)
    private String ciudad;

    @Size (min = 0, max = 50)
    private String departamento;
}
