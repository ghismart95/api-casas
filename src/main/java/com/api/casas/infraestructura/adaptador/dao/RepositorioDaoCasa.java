package com.api.casas.infraestructura.adaptador.dao;

import com.api.casas.dominio.modelo.dto.DtoCasa;
import com.api.casas.dominio.puerto.dao.DaoCasa;
import com.api.casas.infraestructura.adaptador.dao.implementacion.ConsultarCasaRepositorio;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Component;

@Component
public class RepositorioDaoCasa implements DaoCasa {

    private final ConsultarCasaRepositorio consultarCasaRepositorio;

    public RepositorioDaoCasa(ConsultarCasaRepositorio consultarCasaRepositorio) {
        this.consultarCasaRepositorio = consultarCasaRepositorio;
    }

    @Override
    public Page<DtoCasa> listar(Pageable pageable, String casa) {
        return this.consultarCasaRepositorio.buscarTodos(casa, pageable);
    }
}
