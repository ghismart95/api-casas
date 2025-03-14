package com.api.casas.dominio.servicio;

import com.api.casas.comun.dominio.excepcion.ExcepcionDuplicidad;
import com.api.casas.dominio.modelo.entidad.Ubicacion;
import com.api.casas.dominio.puerto.repositorio.RepositorioUbicacion;

public class ServicioCrearUbicacion {

    public static final Long TRUE = 1L;
    private final RepositorioUbicacion repositorioUbicacion;

    public ServicioCrearUbicacion(RepositorioUbicacion repositorioUbicacion) {
        this.repositorioUbicacion = repositorioUbicacion;
    }

    public long ejecutar(Ubicacion ubicacion) {
        this.repositorioUbicacion.crear(ubicacion);
        return 1L;
    }

    private void validarExistenciaPrevia(Ubicacion ubicacion) {
        Long existe = repositorioUbicacion.existe(ubicacion.getCiudad(), ubicacion.getDepertamento());
        if(TRUE.equals(existe)) {
            throw new ExcepcionDuplicidad("La ubicacion ya existe.");
        }
    }

}
