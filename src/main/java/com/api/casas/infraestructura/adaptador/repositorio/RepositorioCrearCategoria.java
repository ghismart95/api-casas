package com.api.casas.infraestructura.adaptador.repositorio;

import com.api.casas.dominio.modelo.entidad.Categoria;
import com.api.casas.dominio.puerto.repositorio.RepositorioCategoria;
import com.api.casas.infraestructura.adaptador.repositorio.implementacion.CategoriaRepository;
import org.springframework.stereotype.Component;


@Component
public class RepositorioCrearCategoria implements RepositorioCategoria {

    private final CategoriaRepository categoriaRepository;

    public RepositorioCrearCategoria(CategoriaRepository categoriaRepository) {
        this.categoriaRepository = categoriaRepository;
    }

    @Override
    public void crear(Categoria categoria) {
        this.categoriaRepository.guardarCategoria(categoria.getNombre(), categoria.getDescripcion());
    }
}
