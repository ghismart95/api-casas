package com.api.casas.aplicacion.comando.manejador;

import com.api.casas.aplicacion.comando.ComandoCategoria;
import com.api.casas.aplicacion.comando.fabrica.FabricaCategoria;
import com.api.casas.comun.aplicacion.ComandoRespuesta;
import com.api.casas.comun.aplicacion.ManejadorComandoRespuesta;
import com.api.casas.dominio.modelo.entidad.Categoria;
import com.api.casas.dominio.servicio.ServicioCrearCategoria;
import org.springframework.stereotype.Component;

@Component
public class ManejadorCrearCategoria implements ManejadorComandoRespuesta<ComandoCategoria, ComandoRespuesta<Long>> {

    private final FabricaCategoria fabricaCategoria;
    private final ServicioCrearCategoria servicioCrearCategoria;

    public ManejadorCrearCategoria(FabricaCategoria fabricaCategoria,
                                   ServicioCrearCategoria servicioCrearCategoria) {
        this.fabricaCategoria = fabricaCategoria;
        this.servicioCrearCategoria = servicioCrearCategoria;
    }


    public ComandoRespuesta<Long> ejecutar(ComandoCategoria comando) {
        Categoria categoria = fabricaCategoria.crear(comando);
        return new ComandoRespuesta<>(this.servicioCrearCategoria.ejecutar(categoria));
    }
}
