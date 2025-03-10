package com.api.casas.dominio.modelo.servicio.testdatabuilder;

import com.api.casas.dominio.modelo.entidad.Categoria;

public class CategoriaTestDataBuilder {

    private String nombre;
    private String descripcion;

    public CategoriaTestDataBuilder() {
        nombre = "Juan";
        descripcion = "Esta es la descripcion";
    }

    public CategoriaTestDataBuilder conNombre(String nombre) {
        this.nombre = nombre;
        return this;
    }

    public CategoriaTestDataBuilder conDescripcion(String descripcion) {
        this.descripcion = descripcion;
        return this;
    }

    public Categoria build() {
        return new Categoria(nombre, descripcion);
    }

}
