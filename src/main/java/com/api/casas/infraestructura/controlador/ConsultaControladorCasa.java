package com.api.casas.infraestructura.controlador;

import com.api.casas.consulta.ManejadorListarCasa;
import com.api.casas.dominio.modelo.dto.DtoCasa;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/casa")
public class ConsultaControladorCasa {

    private final ManejadorListarCasa manejadorListarCasa;

    public ConsultaControladorCasa(ManejadorListarCasa manejadorListarCasa) {
        this.manejadorListarCasa = manejadorListarCasa;
    }

    @GetMapping
    public Page<DtoCasa> listar(Pageable pageable, String casa) {
        return this.manejadorListarCasa.ejecutar(pageable,casa);
    }
}
