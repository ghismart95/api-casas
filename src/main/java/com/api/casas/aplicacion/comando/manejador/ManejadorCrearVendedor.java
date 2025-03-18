package com.api.casas.aplicacion.comando.manejador;

import com.api.casas.aplicacion.comando.ComandoVendedor;
import com.api.casas.aplicacion.comando.fabrica.FabricaVendedor;
import com.api.casas.comun.aplicacion.ComandoRespuesta;
import com.api.casas.comun.aplicacion.ManejadorComandoRespuesta;
import com.api.casas.dominio.modelo.entidad.Vendedor;
import com.api.casas.dominio.servicio.ServicioCrearVendedor;
import org.springframework.stereotype.Component;

@Component
public class ManejadorCrearVendedor implements ManejadorComandoRespuesta<ComandoVendedor, ComandoRespuesta<Long>> {

    private final FabricaVendedor fabricaVendedor;
    private final ServicioCrearVendedor servicioCrearVendedor;

    public ManejadorCrearVendedor(FabricaVendedor fabricaVendedor,
                                  ServicioCrearVendedor servicioCrearVendedor) {
        this.fabricaVendedor = fabricaVendedor;
        this.servicioCrearVendedor = servicioCrearVendedor;
    }

    @Override
    public ComandoRespuesta<Long> ejecutar(ComandoVendedor comando) {
        Vendedor vendedor = fabricaVendedor.crear(comando);
        return new ComandoRespuesta<>(this.servicioCrearVendedor.ejecutar(vendedor));
    }
}
