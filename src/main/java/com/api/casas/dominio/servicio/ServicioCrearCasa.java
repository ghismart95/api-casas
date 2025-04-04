package com.api.casas.dominio.servicio;


import com.api.casas.comun.dominio.excepcion.ExcepcionDuplicidad;
import com.api.casas.dominio.modelo.entidad.Casa;
import com.api.casas.dominio.puerto.repositorio.RepositorioCasa;

public class ServicioCrearCasa {

    public static final String LA_CASA_YA_EXISTE = "La casa ya existe.";
    public static final Long TRUE = 1L;
    private final RepositorioCasa repositorioCasa;

    public ServicioCrearCasa(RepositorioCasa repositorioCasa) {
        this.repositorioCasa = repositorioCasa;
    }

    public long ejecutar(Casa casa) {
        validarExistenciaPrevia(casa);
        this.repositorioCasa.crear(casa);
        return 1L;
    }

    private void validarExistenciaPrevia(Casa casa) {
        Long existe = repositorioCasa.existe(casa.getId(), casa.getNombre(), casa.getDescripcion(), casa.getCantidadCuarto(), casa.getCantidadBaños(), casa.getCiudad(), casa.getDepartamento());
        if(existe.equals(TRUE)) {
            throw new ExcepcionDuplicidad(LA_CASA_YA_EXISTE);
        }
    }
}
