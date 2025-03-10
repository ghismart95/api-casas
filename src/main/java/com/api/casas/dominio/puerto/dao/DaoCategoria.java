package com.api.casas.dominio.puerto.dao;

import com.api.casas.dominio.modelo.dto.DtoCategoria;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;


public interface DaoCategoria {

    Page<DtoCategoria> listar(Pageable pageable, String categoria);
}
