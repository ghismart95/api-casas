package com.api.casas.infraestructura.controlador;

import com.api.casas.consulta.ManejadorListarCategoria;
import com.api.casas.dominio.modelo.dto.DtoCategoria;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/categoria")
public class ConsultaControladorCategoria  {

    private final ManejadorListarCategoria manejadorListarCategoria;

    public ConsultaControladorCategoria(ManejadorListarCategoria manejadorListarCategoria) {
        this.manejadorListarCategoria = manejadorListarCategoria;
    }

    @GetMapping
    public Page<DtoCategoria> Listar(Pageable pageable, String categoria) {
        return this.manejadorListarCategoria.ejecutar(pageable, categoria);
    }
}
