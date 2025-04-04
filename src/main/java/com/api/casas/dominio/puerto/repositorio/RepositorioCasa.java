package com.api.casas.dominio.puerto.repositorio;


import com.api.casas.dominio.modelo.entidad.Casa;

public interface RepositorioCasa {

    void crear(Casa casa);

    Long existe(Long id, String nombre, String descripcion, String cantidadCuarto, String cantidadBanos, String ciudad, String departamento);

}
