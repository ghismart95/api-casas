package com.api.casas.infraestructura.adaptador.repositorio.implementacion;

import com.api.casas.dominio.modelo.entidad.Casa;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface CasaRepository extends JpaRepository<Casa, Long> {

    @Modifying
    @Query(value = "INSERT INTO casa (nombre, descripcion, cantidadCuarto, cantidadBaños, ciudad, despartamento) VALUES (?1, ?2)", nativeQuery = true)
    void guardarCasa(Long id, String nombre, String descripcion, String cantidaCuartos, String cantidadBaños, String ciudad, String departamento);

    @Query(value = "SELECT COUNT(*) >= 1 FROM casa WHERE NOMBRE LIKE %?1%",nativeQuery = true)
    Long buscarPorNombre(String nombre);
}
