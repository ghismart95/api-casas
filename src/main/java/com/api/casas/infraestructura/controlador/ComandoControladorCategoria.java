package com.api.casas.infraestructura.controlador;

import com.api.casas.aplicacion.comando.ComandoCategoria;
import com.api.casas.aplicacion.comando.manejador.ManejadorCrearCategoria;
import com.api.casas.comun.aplicacion.ComandoRespuesta;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/usuarios")
//@Api(tags = { "Controlador comando usuario"})
public class ComandoControladorCategoria {

    private final ManejadorCrearCategoria manejadorCrearCategoria;

    public ComandoControladorCategoria(ManejadorCrearCategoria manejadorCrearCategoria) {
        this.manejadorCrearCategoria = manejadorCrearCategoria;
    }

    @PostMapping
    //@ApiOperation("Crear Usuario")
    public ComandoRespuesta<Long> crear(@RequestBody ComandoCategoria comandoCategoria) {
        return manejadorCrearCategoria.ejecutar(comandoCategoria);
    }

}
