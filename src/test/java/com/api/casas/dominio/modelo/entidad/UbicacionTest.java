package com.api.casas.dominio.modelo.entidad;

import com.api.casas.comun.dominio.excepcion.ExcepcionLongitudValor;
import com.api.casas.comun.dominio.excepcion.ExcepcionValorObligatorio;
import com.api.casas.dominio.modelo.servicio.testdatabuilder.UbicacionTestDataBuilder;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class UbicacionTest {

    @Test
    @DisplayName("Deberia crear correctamente la ubicacion")
    void deberiaCrearCorrectamenteUbicacion() {
        Ubicacion ubicacion = null;

        ubicacion = new UbicacionTestDataBuilder().build();

        Assertions.assertEquals("Arjona", ubicacion.getCiudad());
        Assertions.assertEquals("Bolivar", ubicacion.getDepertamento());
        Assertions.assertEquals("Esta es la descripcion de la ciudad", ubicacion.getDescripcionCiudad());
        Assertions.assertEquals("Esta es la descripcion del departamento", ubicacion.getDescripcionDepartamento());
    }

    @Test
    @DisplayName("Deberia fallar por que la ciudad es obligatoria")
    void deberiaFallarPorCiudadObligatoria() {
        UbicacionTestDataBuilder ubicacionTestDataBuilder = new UbicacionTestDataBuilder().conCiudad("");
        try {
            ubicacionTestDataBuilder.build();
        } catch (ExcepcionValorObligatorio excepcionValorObligatorio) {
            Assertions.assertEquals("Se debe ingresar la ciudad.", excepcionValorObligatorio.getMessage());
        }
    }

    @Test
    @DisplayName("Deberia fallar debido a que falta el departamento")
    void deberiaFallarPorDepartamentoObligatorio() {
        UbicacionTestDataBuilder ubicacionTestDataBuilder = new UbicacionTestDataBuilder().conDepartamento("");
        try {
            ubicacionTestDataBuilder.build();
        } catch (ExcepcionValorObligatorio excepcionValorObligatorio) {
            Assertions.assertEquals("Se debe ingresar el departamento.", excepcionValorObligatorio.getMessage());
        }
    }

    @Test
    @DisplayName("Deberia fallar debido a la longitud maxima de la descripcion_ciudad excedida")
    void deberiaFallarPorDescripcionCiudadLongitudExcedida() {
        UbicacionTestDataBuilder ubicacionTestDataBuilder = new UbicacionTestDataBuilder().conDescripcionCiudad("aaaaaaadfsdfasdgadsgadsfgadsfgaerg34bwdnetymsfbgqergñsldknmqeribnq fñk jnwevioWEK  JWENW   EFNSdfknONDFksnf");
        try {
            ubicacionTestDataBuilder.build();
        } catch (ExcepcionLongitudValor excepcionLongitudValor) {
            Assertions.assertEquals("La longitud maxima del departamento es de 50 caracteres.", excepcionLongitudValor.getMessage());
        }
    }

    @Test
    @DisplayName("Deberia fallar debido a la longitud maxima de la descripcion_departamento excedida")
    void deberiaFallarPorDescripcionDepartamentoLongitudExcedida() {
        UbicacionTestDataBuilder ubicacionTestDataBuilder = new UbicacionTestDataBuilder().conDescripcionDepartamento("aaaaaaadfsdfasdgadsgadsfgadsfgaerg34bwdnetymsfbgqergñsldknmqeribnq fñk jnwevioWEK  JWENW   EFNSdfknONDFksnf");
        try {
            ubicacionTestDataBuilder.build();
        } catch (ExcepcionLongitudValor excepcionLongitudValor) {
            Assertions.assertEquals("La longitud maxima del departamento es de 50 caracteres.", excepcionLongitudValor.getMessage());
        }
    }

    @Test
    @DisplayName("Deberia fallar debido a la longitud maxima de la ciudad es excedida")
    void deberiaFallarPorCiudadLongitudExcedida() {
        UbicacionTestDataBuilder ubicacionTestDataBuilder = new UbicacionTestDataBuilder().conCiudad("aaaaaaadfsdfasdgadsgadsfgadsfgaerg34bwdnetymsfbgqergñsldknmqeribnq fñk jnwevioWEK  JWENW   EFNSdfknONDFksnf");
        try {
            ubicacionTestDataBuilder.build();
        } catch (ExcepcionLongitudValor excepcionLongitudValor) {
            Assertions.assertEquals("La longitud maxima de la ciudad es de 50 caracteres.", excepcionLongitudValor.getMessage());
        }
    }

    @Test
    @DisplayName("Deberia fallar debido a la longitud maxima del departamento es excedida")
    void deberiaFallarPorDepartamentoLongitudExcedida() {
        UbicacionTestDataBuilder ubicacionTestDataBuilder = new UbicacionTestDataBuilder().conDepartamento("aaaaaaadfsdfasdgadsgadsfgadsfgaerg34bwdnetymsfbgqergñsldknmqeribnq fñk jnwevioWEK  JWENW   EFNSdfknONDFksnf");
        try {
            ubicacionTestDataBuilder.build();
        } catch (ExcepcionLongitudValor excepcionLongitudValor) {
            Assertions.assertEquals("La longitud maxima del departamento es de 50 caracteres.", excepcionLongitudValor.getMessage());
        }
    }
}
