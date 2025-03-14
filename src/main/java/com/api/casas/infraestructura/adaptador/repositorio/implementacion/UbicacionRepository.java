package com.api.casas.infraestructura.adaptador.repositorio.implementacion;

import com.api.casas.dominio.modelo.entidad.Ubicacion;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface UbicacionRepository extends JpaRepository<Ubicacion, Long> {

    @Modifying
    @Query(value = "INSERT INTO hogar.ubicacion (ciudad, departamento, descripcion_ciudad, descripcion_departamento) VALUES (?1, ?2, ?3, ?4)", nativeQuery = true)
    void guardarUbicacion(String ciudad, String departamento, String descripcionCiudad, String descripcionDepartamento);

    @Query(value = "SELECT COUNT(*) >= 1 FROM categoria_casa WHERE CIUDAD LIKE %?1% AND DEPARTAMENTO LIKE %?2%", nativeQuery = true)
    Long buscarPorNombre(String ciudad, String departamento);
}
