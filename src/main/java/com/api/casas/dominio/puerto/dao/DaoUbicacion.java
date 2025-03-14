package com.api.casas.dominio.puerto.dao;

import com.api.casas.dominio.modelo.dto.DtoUbicacion;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface DaoUbicacion {

    Page<DtoUbicacion> listar(Pageable pageable, String ciudad, String departamento);

}
