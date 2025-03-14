package com.api.casas.infraestructura.controlador;

import com.api.casas.consulta.ManejadorListarUbicacion;
import com.api.casas.dominio.modelo.dto.DtoUbicacion;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/ubicacion")
public class ConsultaControladorUbicacion {

    private final ManejadorListarUbicacion manejadorListarUbicacion;

    public ConsultaControladorUbicacion(ManejadorListarUbicacion manejadorListarUbicacion) {
        this.manejadorListarUbicacion = manejadorListarUbicacion;
    }

    @GetMapping
    public Page<DtoUbicacion> listar(Pageable pageable, String ciudad, String departamento) {
        return this.manejadorListarUbicacion.ejecutar(pageable, ciudad, departamento);
    }
}
