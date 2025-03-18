package com.api.casas.dominio.puerto.repositorio;

import com.api.casas.dominio.modelo.entidad.Vendedor;

public interface RepositorioVendedor {

    void crear(Vendedor vendedor);

    Long existe(String nombre, String apellido);

}
