package com.api.casas.dominio.servicio;

import com.api.casas.dominio.modelo.entidad.Categoria;
import com.api.casas.dominio.puerto.repositorio.RepositorioCategoria;

public class ServicioCrearCategoria {

    private final RepositorioCategoria repositorioCategoria;


    public ServicioCrearCategoria(RepositorioCategoria repositorioCategoria) {
        this.repositorioCategoria = repositorioCategoria;
    }

    public long ejecutar(Categoria categoria) {
        this.repositorioCategoria.crear(categoria);
        return 1L;
    }


}
