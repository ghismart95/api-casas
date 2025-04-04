package com.api.casas.aplicacion.comando.fabrica;

import com.api.casas.aplicacion.comando.ComandoCasa;
import com.api.casas.dominio.modelo.entidad.Casa;
import org.springframework.stereotype.Component;

@Component
public class FabricaCasa {

    public Casa crear(ComandoCasa comandoCasa) {
        return new Casa(
                comandoCasa.getId(),
                comandoCasa.getNombre(),
                comandoCasa.getDescripcion(),
                comandoCasa.getCantidadCuarto(),
                comandoCasa.getCantidadBaños(),
                comandoCasa.getCiudad(),
                comandoCasa.getDepartamento()
        );
    }
}
