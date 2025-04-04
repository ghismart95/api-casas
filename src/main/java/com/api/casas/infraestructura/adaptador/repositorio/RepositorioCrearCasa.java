package com.api.casas.infraestructura.adaptador.repositorio;

import com.api.casas.dominio.modelo.entidad.Casa;
import com.api.casas.dominio.puerto.repositorio.RepositorioCasa;
import com.api.casas.infraestructura.adaptador.repositorio.implementacion.CasaRepository;
import org.springframework.stereotype.Component;

@Component
public class RepositorioCrearCasa implements RepositorioCasa {

    private final CasaRepository casaRepository;

    public RepositorioCrearCasa(CasaRepository casaRepository) {
        this.casaRepository = casaRepository;
    }

    @Override
    public void crear(Casa casa) {
        this.casaRepository.guardarCasa(casa.getId(), casa.getNombre(), casa.getDescripcion(), casa.getCantidadCuarto(), casa.getCantidadBaños(), casa.getCiudad(), casa.getDepartamento());
    }

    @Override
    public Long existe(Long id, String nombre, String descripcion, String catidadCuarto, String cantidadBaños, String ciudad, String departamento) { return casaRepository.buscarPorNombre(nombre); }
}
