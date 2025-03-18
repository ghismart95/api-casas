package com.api.casas.dominio.servicio;

import com.api.casas.comun.dominio.excepcion.ExcepcionDuplicidad;
import com.api.casas.dominio.modelo.entidad.Vendedor;
import com.api.casas.dominio.puerto.repositorio.RepositorioVendedor;

public class ServicioCrearVendedor {

    public static final String EL_VENDEDOR_YA_EXISTE = "El vendedor ya existe.";
    public static final Long TRUE = 1L;
    public final RepositorioVendedor repositorioVendedor;

    public ServicioCrearVendedor(RepositorioVendedor repositorioVendedor) {
        this.repositorioVendedor = repositorioVendedor;
    }

    public Long ejecutar(Vendedor vendedor) {
        validarExistenciaPrevia(vendedor);
        this.repositorioVendedor.crear(vendedor);
        return 1L;
    }

    private void validarExistenciaPrevia(Vendedor vendedor) {
        Long existe = repositorioVendedor.existe(vendedor.getNombre(), vendedor.getApellido());
        if(existe.equals(TRUE)) {
            throw new ExcepcionDuplicidad(EL_VENDEDOR_YA_EXISTE);
        }
    }
}
