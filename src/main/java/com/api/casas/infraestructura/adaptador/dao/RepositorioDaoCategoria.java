package com.api.casas.infraestructura.adaptador.dao;

import com.api.casas.dominio.modelo.dto.DtoCategoria;
import com.api.casas.dominio.puerto.dao.DaoCategoria;
import com.api.casas.infraestructura.adaptador.dao.implementacion.ConsultaCategoriaRepositorio;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class RepositorioDaoCategoria implements DaoCategoria {

    private final ConsultaCategoriaRepositorio consultaCategoriaRepositorio;

    public RepositorioDaoCategoria(ConsultaCategoriaRepositorio consultaCategoriaRepositorio) {
        this.consultaCategoriaRepositorio = consultaCategoriaRepositorio;
    }

    @Override
    public Page<DtoCategoria> listar(Pageable pageable, String categoria) {
        return this.consultaCategoriaRepositorio.buscarTodos(categoria, pageable);
    }
}
