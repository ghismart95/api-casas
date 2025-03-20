package com.api.casas.consulta;

import com.api.casas.dominio.modelo.dto.DtoUbicacion;
import com.api.casas.dominio.puerto.dao.DaoUbicacion;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Component;

@Component
public class ManejadorListarUbicacion {

    private final DaoUbicacion daoUbicacion;

    public ManejadorListarUbicacion(DaoUbicacion daoUbicacion) {
        this.daoUbicacion = daoUbicacion;
    }

    public Page<DtoUbicacion> ejecutar(Pageable pageable, String ciudad, String departamento) {
        return this.daoUbicacion.listar(pageable, ciudad, departamento);
    }
}
