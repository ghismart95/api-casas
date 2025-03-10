package com.api.casas.dominio.servicio;

import com.api.casas.comun.dominio.excepcion.ExcepcionDuplicidad;
import com.api.casas.dominio.modelo.entidad.Categoria;
import com.api.casas.dominio.puerto.repositorio.RepositorioCategoria;

public class ServicioCrearCategoria {

    public static final String LA_CATEGORIA_YA_EXISTE = "La categoria ya existe.";
    public static final Long TRUE = 1L;
    private final RepositorioCategoria repositorioCategoria;


    public ServicioCrearCategoria(RepositorioCategoria repositorioCategoria) {
        this.repositorioCategoria = repositorioCategoria;
    }

    public long ejecutar(Categoria categoria) {
        validarExistenciaPrevia(categoria);
        this.repositorioCategoria.crear(categoria);
        return 1L;
    }

    private void validarExistenciaPrevia(Categoria categoria) {
        Long existe = repositorioCategoria.existe(categoria.getNombre());
        if(existe.equals(TRUE)) {
            throw new ExcepcionDuplicidad(LA_CATEGORIA_YA_EXISTE);
        }
    }

}
