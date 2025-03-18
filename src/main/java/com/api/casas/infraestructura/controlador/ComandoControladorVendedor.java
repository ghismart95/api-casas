package com.api.casas.infraestructura.controlador;

import com.api.casas.aplicacion.comando.ComandoVendedor;
import com.api.casas.aplicacion.comando.manejador.ManejadorCrearVendedor;
import com.api.casas.comun.aplicacion.ComandoRespuesta;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/vendedor")
public class ComandoControladorVendedor {

    private final ManejadorCrearVendedor manejadorCrearVendedor;

    public ComandoControladorVendedor(ManejadorCrearVendedor manejadorCrearVendedor) {
        this.manejadorCrearVendedor = manejadorCrearVendedor;
    }

    @PostMapping(value = "/crear")
    public ComandoRespuesta<Long> crear(@RequestBody ComandoVendedor comandoVendedor) {
        return manejadorCrearVendedor.ejecutar(comandoVendedor);
    }
}
