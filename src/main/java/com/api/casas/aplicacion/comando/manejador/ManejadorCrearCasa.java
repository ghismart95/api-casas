package com.api.casas.aplicacion.comando.manejador;

import com.api.casas.aplicacion.comando.ComandoCasa;
import com.api.casas.aplicacion.comando.fabrica.FabricaCasa;
import com.api.casas.comun.aplicacion.ComandoRespuesta;
import com.api.casas.comun.aplicacion.ManejadorComandoRespuesta;
import com.api.casas.dominio.modelo.entidad.Casa;
import com.api.casas.dominio.servicio.ServicioCrearCasa;
import org.springframework.stereotype.Component;

@Component
public class ManejadorCrearCasa implements ManejadorComandoRespuesta<ComandoCasa, ComandoRespuesta<Long>> {

    private final FabricaCasa fabricaCasa;
    private final ServicioCrearCasa servicioCrearCasa;

    public ManejadorCrearCasa(FabricaCasa fabricaCasa,
                              ServicioCrearCasa servicioCrearCasa) {
        this.fabricaCasa = fabricaCasa;
        this.servicioCrearCasa = servicioCrearCasa;
    }

    public ComandoRespuesta<Long> ejecutar(ComandoCasa comando) {
        Casa casa = fabricaCasa.crear(comando);
        return new ComandoRespuesta<>(this.servicioCrearCasa.ejecutar(casa));
    }
}
