package com.api.casas.infraestructura.adaptador.dao;

import com.api.casas.dominio.modelo.dto.DtoUbicacion;
import com.api.casas.dominio.puerto.dao.DaoUbicacion;
import com.api.casas.infraestructura.adaptador.dao.implementacion.ConsultaUbicacionRepositorio;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Component;

@Component
public class RepositorioDaoUbicacion implements DaoUbicacion {

    private final ConsultaUbicacionRepositorio consultaUbicacionRepositorio;

    public RepositorioDaoUbicacion(ConsultaUbicacionRepositorio consultaUbicacionRepositorio) {
        this.consultaUbicacionRepositorio = consultaUbicacionRepositorio;
    }

    @Override
    public Page<DtoUbicacion> listar(Pageable pageable, String ciudad, String departamento) {
        return this.consultaUbicacionRepositorio.buscarTodos(ciudad, departamento, pageable);
    }
}
