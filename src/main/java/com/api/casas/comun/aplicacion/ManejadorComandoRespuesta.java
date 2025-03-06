package com.api.casas.comun.aplicacion;

import org.springframework.transaction.annotation.Transactional;

public interface ManejadorComandoRespuesta<C, R> {

    @Transactional
    R ejecutar(C comando);

}
