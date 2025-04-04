package com.api.casas.infraestructura.controlador;

import com.api.casas.aplicacion.comando.ComandoCasa;
import com.api.casas.aplicacion.comando.manejador.ManejadorCrearCasa;
import com.api.casas.comun.aplicacion.ComandoRespuesta;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/casa")
public class ComandoControladorCasa {

    private final ManejadorCrearCasa manejadorCrearCasa;

    public ComandoControladorCasa(ManejadorCrearCasa manejadorCrearCasa) {
        this.manejadorCrearCasa = manejadorCrearCasa;
    }

    @PostMapping(value = "/crear")
    public ComandoRespuesta<Long> crear(@RequestBody ComandoCasa comandoCasa) {
        return manejadorCrearCasa.ejecutar(comandoCasa);
    }
}
