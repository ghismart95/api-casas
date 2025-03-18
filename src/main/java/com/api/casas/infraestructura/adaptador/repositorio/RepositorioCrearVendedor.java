package com.api.casas.infraestructura.adaptador.repositorio;

import com.api.casas.dominio.modelo.entidad.Vendedor;
import com.api.casas.dominio.puerto.repositorio.RepositorioVendedor;
import com.api.casas.infraestructura.adaptador.repositorio.implementacion.VendedorRepository;
import org.springframework.stereotype.Component;

@Component
public class RepositorioCrearVendedor implements RepositorioVendedor {

    private final VendedorRepository vendedorRepository;

    public RepositorioCrearVendedor(VendedorRepository vendedorRepository) {
        this.vendedorRepository = vendedorRepository;
    }

    @Override
    public void crear(Vendedor vendedor) {
        this.vendedorRepository.guardarCategoria(vendedor.getNombre(), vendedor.getApellido(), vendedor.getDocumentoIdentidad(),
                vendedor.getCelular(), vendedor.getFechaNacimiento(), vendedor.getCorreo(), vendedor.getClave());
    }

    @Override
    public Long existe(String nombre, String apellido) {
        return this.vendedorRepository.buscarPorNombre(nombre, apellido);
    }
}
