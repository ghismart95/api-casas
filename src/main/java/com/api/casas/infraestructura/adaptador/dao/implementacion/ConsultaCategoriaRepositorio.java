package com.api.casas.infraestructura.adaptador.dao.implementacion;

import com.api.casas.dominio.modelo.dto.DtoCategoria;
import com.api.casas.dominio.modelo.entidad.Categoria;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface ConsultaCategoriaRepositorio extends JpaRepository<Categoria, Long> {

    @Query(value = "SELECT ID, NOMBRE, DESCRIPCION FROM categoria_casa WHERE nombre like %?1%", nativeQuery = true)
    Page<DtoCategoria> buscarTodos(String categoria, Pageable pageable);

}
