package com.api.casas.infraestructura.adaptador.dao.implementacion;

import com.api.casas.dominio.modelo.dto.DtoUbicacion;
import com.api.casas.dominio.modelo.entidad.Ubicacion;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface ConsultaUbicacionRepositorio extends JpaRepository<Ubicacion, Long> {

    @Query(value = "SELECT CIUDAD, DEPARTAMENTO, DESCRIPCION_CIUDAD, DESCRIPCION_DEPARTAMENTO, FROM UBICACION WHERE CIUDAD LIKE %?1% and departamento like %?2%", nativeQuery = true)
    Page<DtoUbicacion> buscarTodos(String ciudad, String departamento, Pageable pageable);

}
