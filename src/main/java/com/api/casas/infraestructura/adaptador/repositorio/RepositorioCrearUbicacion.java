package com.api.casas.infraestructura.adaptador.repositorio;

import com.api.casas.dominio.modelo.entidad.Ubicacion;
import com.api.casas.dominio.puerto.repositorio.RepositorioUbicacion;
import com.api.casas.infraestructura.adaptador.repositorio.implementacion.UbicacionRepository;
import org.springframework.stereotype.Component;

@Component
public class RepositorioCrearUbicacion implements RepositorioUbicacion {

    private final UbicacionRepository ubicacionRepository;

    public RepositorioCrearUbicacion(UbicacionRepository ubicacionRepository) {
        this.ubicacionRepository = ubicacionRepository;
    }

    @Override
    public void crear(Ubicacion ubicacion) {
        this.ubicacionRepository.guardarUbicacion(ubicacion.getCiudad(),
                ubicacion.getDescripcionCiudad(),
                ubicacion.getDescripcionCiudad(),
                ubicacion.getDescripcionDepartamento());
    }

    @Override
    public Long existe(String ciudad, String departamento) {
        return ubicacionRepository.buscarPorNombre(ciudad, departamento);
    }
}
