package com.api.casas.infraestructura.configuracion;

import com.api.casas.dominio.puerto.repositorio.RepositorioCategoria;
import com.api.casas.dominio.servicio.ServicioCrearCategoria;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BeanServicio {

    @Bean
    public ServicioCrearCategoria servicioCrearCategoria(RepositorioCategoria repositorioCategoria) {
        return new ServicioCrearCategoria(repositorioCategoria);
    }

}
