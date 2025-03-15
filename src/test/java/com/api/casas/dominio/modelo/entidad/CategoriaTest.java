package com.api.casas.dominio.modelo.entidad;

import com.api.casas.comun.dominio.excepcion.ExcepcionLongitudValor;
import com.api.casas.comun.dominio.excepcion.ExcepcionValorObligatorio;
import com.api.casas.dominio.modelo.servicio.testdatabuilder.CategoriaTestDataBuilder;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class CategoriaTest {

    @Test
    @DisplayName("Deberia crear correctamente la categoria")
    void deberiaCrearCorrectamenteLaCategoria() {
        // arrange
        Categoria categoria = null;
        // act
        categoria = new CategoriaTestDataBuilder().build();
        // assert
        Assertions.assertEquals("Juan", categoria.getNombre());
        Assertions.assertEquals("Esta es la descripcion", categoria.getDescripcion());
    }

    @Test
    @DisplayName("Deberia fallar debido a que falta el nombre")
    void deberiaFallarSinNombreCategoria() {
        CategoriaTestDataBuilder categoriaTestDataBuilder = new CategoriaTestDataBuilder().conNombre("");
        // Act - Assert
        try {
            categoriaTestDataBuilder.build();
        } catch (ExcepcionValorObligatorio excepcionValorObligatorio) {
            Assertions.assertEquals("Se debe ingresar el nombre de la categoria.", excepcionValorObligatorio.getMessage());
        }

    }

    @Test
    @DisplayName("Deberia fallar debido a que excede la longitud maxima del nombre")
    void deberiaFallarExcedeLongitudMaximaNombre() {
        CategoriaTestDataBuilder categoriaTestDataBuilder = new CategoriaTestDataBuilder().conNombre("q11111wertyuiopasdfghjklñzxcvbnm,.-ñ{}´+1234567890'¿<qwer");
        // Act - Assert
        try {
            categoriaTestDataBuilder.build();
        } catch (ExcepcionLongitudValor excepcionValorObligatorio) {
            Assertions.assertEquals("La longitud maxima del nombre debe ser de 50", excepcionValorObligatorio.getMessage());
        }
    }

    @Test
    @DisplayName("Deberia fallar debido a que excede la longitud maxima de la Descripcion")
    void deberiaFallarExcedeLongitudMaximaDescripcion() {
        CategoriaTestDataBuilder categoriaTestDataBuilder = new CategoriaTestDataBuilder().conDescripcion("2222222222222222222222222222222222222222222222222222222222222222222222222222222222222q11111wertyuiopasdfghjklñzxcvbnm,.-ñ{}´+1234567890'¿<qwer");
        // Act - Assert
        try {
            categoriaTestDataBuilder.build();
        } catch (ExcepcionLongitudValor excepcionValorObligatorio) {
            Assertions.assertEquals("La longitud minima de la descripcion debe ser de 90", excepcionValorObligatorio.getMessage());
        }
    }
}
