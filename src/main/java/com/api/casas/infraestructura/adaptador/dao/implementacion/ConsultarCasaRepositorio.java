package com.api.casas.infraestructura.adaptador.dao.implementacion;

import com.api.casas.dominio.modelo.dto.DtoCasa;
import com.api.casas.dominio.modelo.entidad.Casa;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface ConsultarCasaRepositorio extends JpaRepository<Casa, Long> {

    @Query(value = "SELECT ID, NOMBRE, DESCRIPCION FROM casa WHERE nombre like %?1%", nativeQuery = true)
    Page<DtoCasa> buscarTodos(String casa, Pageable pageable);
}
