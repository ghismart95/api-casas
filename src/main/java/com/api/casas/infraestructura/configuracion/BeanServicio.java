package com.api.casas.infraestructura.configuracion;

import com.api.casas.dominio.puerto.repositorio.RepositorioCasa;
import com.api.casas.dominio.puerto.repositorio.RepositorioCategoria;
import com.api.casas.dominio.puerto.repositorio.RepositorioUbicacion;
import com.api.casas.dominio.puerto.repositorio.RepositorioVendedor;
import com.api.casas.dominio.servicio.ServicioCrearCasa;
import com.api.casas.dominio.servicio.ServicioCrearCategoria;
import com.api.casas.dominio.servicio.ServicioCrearUbicacion;
import com.api.casas.dominio.servicio.ServicioCrearVendedor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BeanServicio {

    @Bean
    public ServicioCrearCategoria servicioCrearCategoria(RepositorioCategoria repositorioCategoria) {
        return new ServicioCrearCategoria(repositorioCategoria);
    }

    @Bean
    public ServicioCrearVendedor servicioCrearVendedor(RepositorioVendedor repositorioVendedor) {
        return new ServicioCrearVendedor(repositorioVendedor);
    }

    @Bean
    public ServicioCrearUbicacion servicioCrearUbicacion(RepositorioUbicacion repositorioUbicacion) {
        return new ServicioCrearUbicacion(repositorioUbicacion);
    }

    @Bean
    public ServicioCrearCasa servicioCrearCasa(RepositorioCasa repositorioCasa) {
        return new ServicioCrearCasa(repositorioCasa);
    }

}
