package com.api.casas.dominio.modelo.entidad;

import com.api.casas.comun.dominio.excepcion.ExcepcionValorInvalido;
import com.api.casas.comun.dominio.excepcion.ExcepcionValorObligatorio;
import com.api.casas.dominio.modelo.servicio.testdatabuilder.VendedorTestDataBuilder;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;

public class VendedorTest {

    @Test
    @DisplayName("Deberia crear el vendedor correctamente")
    void deberiaCrearCorrectamenteElVendedor() {
        Vendedor vendedor = null;

        vendedor = new VendedorTestDataBuilder().build();

        Assertions.assertEquals("Vendedor1", vendedor.getNombre());
        Assertions.assertEquals("Vende",vendedor.getApellido());
        Assertions.assertEquals("1234567890", vendedor.getDocumentoIdentidad());
        Assertions.assertEquals("3169765342", vendedor.getCelular());
        Assertions.assertEquals(LocalDate.now(), vendedor.getFechaNacimiento());
        Assertions.assertEquals("vendedor@gmail.com", vendedor.getCorreo());
        Assertions.assertEquals("1234567890", vendedor.getClave());
    }

    @Test
    @DisplayName("Deberia fallas debido a que falta el nombre")
    void deberiaFallarSinNombreVendedor() {
        VendedorTestDataBuilder vendedorTestDataBuilder = new VendedorTestDataBuilder().conNombre("");

        try {
            vendedorTestDataBuilder.build();
        } catch (ExcepcionValorObligatorio excepcionValorObligatorio) {
            Assertions.assertEquals("El nombre es un dato requerido.",excepcionValorObligatorio.getMessage());
        }
    }

    @Test
    @DisplayName("Deberia fallas debido a que falta el apellido")
    void deberiaFallarSinApellidoVendedor() {
        VendedorTestDataBuilder vendedorTestDataBuilder = new VendedorTestDataBuilder().conApellido("");

        try {
            vendedorTestDataBuilder.build();
        } catch (ExcepcionValorObligatorio excepcionValorObligatorio) {
            Assertions.assertEquals("El apellido es un dato requerido.",excepcionValorObligatorio.getMessage());
        }
    }

    @Test
    @DisplayName("Deberia fallas debido a que falta el Documento identidad")
    void deberiaFallarSinDocumentoIdentidadVendedor() {
        VendedorTestDataBuilder vendedorTestDataBuilder = new VendedorTestDataBuilder().conDocumentoIdentidad("");

        try {
            vendedorTestDataBuilder.build();
        } catch (ExcepcionValorObligatorio excepcionValorObligatorio) {
            Assertions.assertEquals("El documento de identidad es requerido.",excepcionValorObligatorio.getMessage());
        }
    }

    @Test
    @DisplayName("Deberia fallas debido a que falta el celular")
    void deberiaFallarSinCelularVendedor() {
        VendedorTestDataBuilder vendedorTestDataBuilder = new VendedorTestDataBuilder().conCelular("");

        try {
            vendedorTestDataBuilder.build();
        } catch (ExcepcionValorObligatorio excepcionValorObligatorio) {
            Assertions.assertEquals("El numero de celular es obligatorio.",excepcionValorObligatorio.getMessage());
        }
    }

    @Test
    @DisplayName("Deberia fallas debido a que falta la fecha de nacimiento")
    void deberiaFallarSinFechaNacimientoVendedor() {
        VendedorTestDataBuilder vendedorTestDataBuilder = new VendedorTestDataBuilder().conFechaNacimiento(null);

        try {
            vendedorTestDataBuilder.build();
        } catch (ExcepcionValorObligatorio excepcionValorObligatorio) {
            Assertions.assertEquals("La fecha de nacimiento es obligatorio.",excepcionValorObligatorio.getMessage());
        }
    }

    @Test
    @DisplayName("Deberia fallas debido a que falta el correo")
    void deberiaFallarSinCorreoVendedor() {
        VendedorTestDataBuilder vendedorTestDataBuilder = new VendedorTestDataBuilder().conCorreo("");

        try {
            vendedorTestDataBuilder.build();
        } catch (ExcepcionValorObligatorio excepcionValorObligatorio) {
            Assertions.assertEquals("El correo es requerido.",excepcionValorObligatorio.getMessage());
        }
    }

    @Test
    @DisplayName("Deberia fallas debido a que falta la clave")
    void deberiaFallarSinClaveVendedor() {
        VendedorTestDataBuilder vendedorTestDataBuilder = new VendedorTestDataBuilder().conClave("");

        try {
            vendedorTestDataBuilder.build();
        } catch (ExcepcionValorObligatorio excepcionValorObligatorio) {
            Assertions.assertEquals("La clave es obligatoria.",excepcionValorObligatorio.getMessage());
        }
    }

    @Test
    @DisplayName("Deberia de fallar porque el correo no cumple con la validacion de estructura")
    void deberiaFallarPorEstructuraDelCorreoInvalida() {
        VendedorTestDataBuilder vendedorTestDataBuilder = new VendedorTestDataBuilder().conCorreo("carlos.03@gmail..com");

        try {
            vendedorTestDataBuilder.build();
        } catch (ExcepcionValorInvalido excepcionValorInvalido) {
            Assertions.assertEquals("El correo es invalido porfavor verificarlo.", excepcionValorInvalido.getMessage());
        }
    }

    @Test
    @DisplayName("Deberia de fallar porque el celular no cumple con la validacion de estructura")
    void deberiaFallarPorEstructuraDelCelularInvalida() {
        VendedorTestDataBuilder vendedorTestDataBuilder = new VendedorTestDataBuilder().conCelular("+123123123a");

        try {
            vendedorTestDataBuilder.build();
        } catch (ExcepcionValorInvalido excepcionValorInvalido) {
            Assertions.assertEquals("El celular debe de tener maximo 13 caracteres y solo puede tener el simbolo mas(+).", excepcionValorInvalido.getMessage());
        }
    }

    @Test
    @DisplayName("Deberia de fallar porque el documento de identidad no cumple con la validacion de estructura")
    void deberiaFallarPorEstructuraDelDocumentoIdentidadInvalida() {
        VendedorTestDataBuilder vendedorTestDataBuilder = new VendedorTestDataBuilder().conDocumentoIdentidad("+123123123a");

        try {
            vendedorTestDataBuilder.build();
        } catch (ExcepcionValorInvalido excepcionValorInvalido) {
            Assertions.assertEquals("El documento de identidad debe de ser unicamente numerico.", excepcionValorInvalido.getMessage());
        }
    }

}
