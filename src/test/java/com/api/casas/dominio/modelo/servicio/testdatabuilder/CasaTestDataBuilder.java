package com.api.casas.dominio.modelo.servicio.testdatabuilder;


import com.api.casas.dominio.modelo.entidad.Casa;

public class CasaTestDataBuilder {

    private Long id;
    private String nombre;
    private String descripcion;
    private String cantidadCuarto;
    private String cantidadBaños;
    private String ciudad;
    private String departamento;

    public CasaTestDataBuilder() {
       id = 1L;
       nombre = "Casa de Campo";
       descripcion = "Esta es la descripcion";
       cantidadCuarto = "La cantidad de cuartos es ";
       cantidadBaños = "La cantidad de baños es ";
       ciudad = "La ciudad es";
       departamento = "El departamento es";
    }

    public CasaTestDataBuilder conId(Long id) {
        this.id = id;
        return this;
    }

    public CasaTestDataBuilder conNombre(String nombre) {
        this.nombre = nombre;
        return this;
    }

    public CasaTestDataBuilder conDescripcion(String descripcion) {
        this.descripcion = descripcion;
        return this;
    }

    public CasaTestDataBuilder conCantidadCuarto(String cantidadCuarto) {
        this.cantidadCuarto = cantidadCuarto;
        return this;
    }

    public CasaTestDataBuilder conCantidadBaños(String cantidadBaños) {
        this.cantidadBaños = cantidadBaños;
        return this;
    }

    public CasaTestDataBuilder conCiudad(String ciudad) {
        this.ciudad = ciudad;
        return this;
    }

    public CasaTestDataBuilder conDepartamento(String departamento) {
        this.departamento = departamento;
        return this;
    }

    public Casa build() { return new Casa(null, nombre, descripcion, cantidadCuarto,cantidadBaños, ciudad, departamento); }
}
