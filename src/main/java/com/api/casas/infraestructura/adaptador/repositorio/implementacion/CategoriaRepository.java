package com.api.casas.infraestructura.adaptador.repositorio.implementacion;

import com.api.casas.dominio.modelo.entidad.Categoria;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface CategoriaRepository extends JpaRepository<Categoria, Long> {

    @Modifying
    @Query(value = "INSERT INTO categoria_casa (nombre, descripcion) VALUES (?1, ?2)", nativeQuery = true)
    void guardarCategoria(String nombre, String descripcion);

    @Query(value = "SELECT COUNT(*) >= 1 FROM categoria_casa WHERE NOMBRE LIKE %?1%", nativeQuery = true)
    Long buscarPorNombre(String nombre);

}
