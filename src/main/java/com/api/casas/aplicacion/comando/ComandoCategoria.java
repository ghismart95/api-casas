package com.api.casas.aplicacion.comando;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.math.BigInteger;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class ComandoCategoria {

    private Long id;

    @NotBlank
    @Size(min = 0, max = 50)
    private String nombre;

    @Size(min = 0, max = 90)
    private String descripcion;

}
