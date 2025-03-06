package com.api.casas.infraestructura.adaptador.repositorio.implementacion;

import com.api.casas.dominio.modelo.entidad.Categoria;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.math.BigInteger;

@Repository
public interface CategoriaRepository extends JpaRepository<Categoria, BigInteger> {

    @Query(value = "INSERT INTO categoria_casa (nombre, descripcion) VALUES (?1, ?2)", nativeQuery = true)
    void guardarCategoria(String nombre, String descripcion);

}
