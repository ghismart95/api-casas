package com.api.casas.consulta;

import com.api.casas.dominio.modelo.dto.DtoCategoria;
import com.api.casas.dominio.puerto.dao.DaoCategoria;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class ManejadorListarCategoria {

    private final DaoCategoria daoCategoria;

    public ManejadorListarCategoria(DaoCategoria daoCategoria) { this.daoCategoria = daoCategoria; }

    public Page<DtoCategoria> ejecutar(Pageable pageable, String categoria){
        return this.daoCategoria.listar(pageable, categoria);
    }
}
