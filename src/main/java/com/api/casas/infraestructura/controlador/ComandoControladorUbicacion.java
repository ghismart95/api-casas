package com.api.casas.infraestructura.controlador;

import com.api.casas.aplicacion.comando.ComandoUbicacion;
import com.api.casas.aplicacion.comando.manejador.ManejadorCrearUbicacion;
import com.api.casas.comun.aplicacion.ComandoRespuesta;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/ubicacion")
public class ComandoControladorUbicacion {

    private final ManejadorCrearUbicacion manejadorCrearUbicacion;

    public ComandoControladorUbicacion(ManejadorCrearUbicacion manejadorCrearUbicacion) {
        this.manejadorCrearUbicacion = manejadorCrearUbicacion;
    }

    @PostMapping(value = "/crear")
    public ComandoRespuesta<Long> crear(@RequestBody ComandoUbicacion comandoUbicacion) {
        return manejadorCrearUbicacion.ejecutar(comandoUbicacion);
    }
}
