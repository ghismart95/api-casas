package com.api.casas.aplicacion.comando.fabrica;

import com.api.casas.aplicacion.comando.ComandoCategoria;
import com.api.casas.dominio.modelo.entidad.Categoria;
import org.springframework.stereotype.Component;

@Component
public class FabricaCategoria {

    public Categoria crear(ComandoCategoria comandoCategoria) {
        return new Categoria(
                comandoCategoria.getId(),
                comandoCategoria.getNombre(),
                comandoCategoria.getDescripcion()
        );
    }

}
