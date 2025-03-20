package com.api.casas.dominio.modelo.servicio.testdatabuilder;

import com.api.casas.dominio.modelo.entidad.Ubicacion;

public class UbicacionTestDataBuilder {

    private Long id;
    private String ciudad;
    private String departamento;
    private String descripcionCiudad;
    private String descripcionDepartamento;

    public UbicacionTestDataBuilder() {
        id = 1L;
        ciudad = "Arjona";
        departamento = "Bolivar";
        descripcionCiudad = "Esta es la descripcion de la ciudad";
        descripcionDepartamento = "Esta es la descripcion del departamento";
    }

    public UbicacionTestDataBuilder conCiudad(String ciudad) {
        this.ciudad = ciudad;
        return this;
    }

    public UbicacionTestDataBuilder conDepartamento(String departamento) {
        this.departamento = departamento;
        return this;
    }

    public UbicacionTestDataBuilder conDescripcionCiudad(String descripcionCiudad) {
        this.descripcionCiudad = descripcionCiudad;
        return this;
    }

    public UbicacionTestDataBuilder conDescripcionDepartamento(String descripcionDepartamento) {
        this.descripcionDepartamento = descripcionDepartamento;
        return this;
    }

    public Ubicacion build() {
        return new Ubicacion(ciudad, departamento, descripcionCiudad, descripcionDepartamento);
    }
}
