package com.api.casas.infraestructura.adaptador.dao.implementacion;

import com.api.casas.dominio.modelo.dto.DtoCategoria;
import com.api.casas.dominio.modelo.entidad.Categoria;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.math.BigInteger;

@Repository
public interface ConsultaCategoriaRepositorio extends JpaRepository<Categoria, BigInteger> {

    @Query(value = "SELECT ID, NOMBRE, DESCRIPCION FROM categoria_casa WHERE nombre = ?2", nativeQuery = true)
    Page<DtoCategoria> buscarTodos(Pageable pageable, String categoria);

}
