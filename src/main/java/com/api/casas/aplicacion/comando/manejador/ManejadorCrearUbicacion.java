package com.api.casas.aplicacion.comando.manejador;

import com.api.casas.aplicacion.comando.ComandoUbicacion;
import com.api.casas.aplicacion.comando.fabrica.FabricaUbicacion;
import com.api.casas.comun.aplicacion.ComandoRespuesta;
import com.api.casas.comun.aplicacion.ManejadorComandoRespuesta;
import com.api.casas.dominio.modelo.entidad.Ubicacion;
import com.api.casas.dominio.servicio.ServicioCrearUbicacion;
import org.springframework.stereotype.Component;

@Component
public class ManejadorCrearUbicacion implements ManejadorComandoRespuesta<ComandoUbicacion, ComandoRespuesta<Long>> {

    private final FabricaUbicacion fabricaUbicacion;
    private final ServicioCrearUbicacion servicioCrearUbicacion;

    public ManejadorCrearUbicacion(FabricaUbicacion fabricaUbicacion,
                                   ServicioCrearUbicacion servicioCrearUbicacion) {
        this.fabricaUbicacion = fabricaUbicacion;
        this.servicioCrearUbicacion = servicioCrearUbicacion;
    }

    @Override
    public ComandoRespuesta<Long> ejecutar(ComandoUbicacion comando) {
        Ubicacion ubicacion = fabricaUbicacion.crear(comando);
        return new ComandoRespuesta<>(this.servicioCrearUbicacion.ejecutar(ubicacion));
    }
}
