package com.api.casas.dominio.puerto.repositorio;

import com.api.casas.dominio.modelo.entidad.Ubicacion;

public interface RepositorioUbicacion {

    void crear(Ubicacion ubicacion);

    Long existe(String ciudad, String departamento);

}
