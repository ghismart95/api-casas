package com.api.casas.dominio.modelo.entidad;


import com.api.casas.comun.dominio.excepcion.ExcepcionLongitudValor;
import com.api.casas.comun.dominio.excepcion.ExcepcionValorObligatorio;
import com.api.casas.dominio.modelo.servicio.testdatabuilder.CasaTestDataBuilder;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class CasaTest {

    @Test
    @DisplayName("Deberia crear correctamente la categoria")
    void deberiaCrearCorrectamenteLaCasa() {

       Casa casa = null;

       casa = new CasaTestDataBuilder().build();

        Assertions.assertEquals("CDF1234",casa.getId());
        Assertions.assertEquals("Casa de Campo",casa.getNombre());
        Assertions.assertEquals("Esta es la descripcion", casa.getDescripcion());
        Assertions.assertEquals("");
    }

    @Test
    @DisplayName("Deberia fallar a que falta el nombre")
    void deberiaFallarSinNombreCasa() {
        CasaTestDataBuilder casaTestDataBuilder = new CasaTestDataBuilder().conNombre("");

        try {
            casaTestDataBuilder.build();
        } catch (ExcepcionValorObligatorio excepcionValorObligatorio) {
            Assertions.assertEquals("Se debe ingresar el nombre de la casa", excepcionValorObligatorio.getMessage());
        }
    }

    @Test
    @DisplayName("Deberia fallar debido a que excede la longitud maxima del nombre")
    void deberiaFallarExcedeLongitudMaximaNombre() {
        CasaTestDataBuilder casaTestDataBuilder = new CasaTestDataBuilder().conNombre("q11111wertyuiopasdfghjklñzxcvbnm,.-ñ{}´+1234567890'¿<qwer");

        try {
            casaTestDataBuilder.build();
        } catch (ExcepcionLongitudValor excepccionValorObligatorio) {
            Assertions.assertEquals("La longitud maxima del nombre debe ser de 50", excepccionValorObligatorio.getMessage());
        }
    }

    @Test
    @DisplayName("Deberia fallar debido a que excede la longitud maxima de la descripcion")
    void deberiaFallarExcedeLongitudMaximaDescripcion() {
        CasaTestDataBuilder casaTestDataBuilder = new CasaTestDataBuilder().conDescripcion("2222222222222222222222222222222222222222222222222222222222222222222222222222222222222q11111wertyuiopasdfghjklñzxcvbnm,.-ñ{}´+1234567890'¿<qwer");

        try {
            casaTestDataBuilder.build();
        } catch (ExcepcionLongitudValor excepcionValorObligatorio) {
            Assertions.assertEquals("La longitud maxima de la descripcion debe ser de 90", excepcionValorObligatorio.getMessage());
        }
    }


}
