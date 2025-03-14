package com.api.casas.aplicacion.comando.fabrica;

import com.api.casas.aplicacion.comando.ComandoUbicacion;
import com.api.casas.dominio.modelo.entidad.Ubicacion;
import org.springframework.stereotype.Component;

@Component
public class FabricaUbicacion {

    public Ubicacion crear(ComandoUbicacion comandoUbicacion) {
        return new Ubicacion(
                comandoUbicacion.getCiudad(),
                comandoUbicacion.getDepartamento(),
                comandoUbicacion.getDescripcionCiudad(),
                comandoUbicacion.getDescripcionDepartamento()
        );
    }

}
