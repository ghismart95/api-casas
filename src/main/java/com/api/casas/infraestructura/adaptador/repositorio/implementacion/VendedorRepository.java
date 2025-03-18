package com.api.casas.infraestructura.adaptador.repositorio.implementacion;

import com.api.casas.dominio.modelo.entidad.Vendedor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.time.LocalDate;

@Repository
public interface VendedorRepository extends JpaRepository<Vendedor, Long> {

    @Modifying
    @Query(value = "INSERT INTO USUARIO (nombre, apellido, documento_identidad, celular, fecha_nacimiento, " +
            "correo, clave) VALUES (?1, ?2, ?3,?4, ?5, ?6, ?7)", nativeQuery = true)
    void guardarCategoria(String nombre, String apellido, String documento_identidad, String celular,
                          LocalDate fecha_nacimiento, String correo, String clave);

    @Query(value = "SELECT COUNT(*) >= 1 FROM USUARIO WHERE NOMBRE LIKE %?1% AND APELLIDO LIKE %?2%", nativeQuery = true)
    Long buscarPorNombre(String nombre, String apellido);
}
