package com.api.casas.dominio.modelo.servicio.testdatabuilder;

import com.api.casas.dominio.modelo.entidad.Vendedor;

import java.time.LocalDate;

public class VendedorTestDataBuilder {

    private String nombre;
    private String apellido;
    private String documentoIdentidad;
    private String celular;
    private LocalDate fechaNacimiento;
    private String correo;
    private String clave;

    public VendedorTestDataBuilder() {
        nombre = "Vendedor1";
        apellido = "Vende";
        documentoIdentidad = "1234567890";
        celular = "3169765342";
        fechaNacimiento = LocalDate.now();
        correo = "vendedor@gmail.com";
        clave = "1234567890";
    }

    public VendedorTestDataBuilder conNombre(String nombre) {
        this.nombre = nombre;
        return this;
    }

    public VendedorTestDataBuilder conApellido(String apellido) {
        this.apellido = apellido;
        return this;
    }

    public VendedorTestDataBuilder conDocumentoIdentidad(String documentoIdentidad) {
        this.documentoIdentidad = documentoIdentidad;
        return this;
    }

    public VendedorTestDataBuilder conCelular(String celular) {
        this.celular = celular;
        return this;
    }

    public VendedorTestDataBuilder conFechaNacimiento(LocalDate fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
        return this;
    }

    public VendedorTestDataBuilder conCorreo(String correo) {
        this.correo = correo;
        return this;
    }

    public VendedorTestDataBuilder conClave(String clave) {
        this.clave = clave;
        return this;
    }

    public Vendedor build() {
        return new Vendedor(nombre, apellido, documentoIdentidad, celular, fechaNacimiento, correo, clave);
    }
}
