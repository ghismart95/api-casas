package com.api.casas.consulta;

import com.api.casas.dominio.modelo.dto.DtoCasa;
import com.api.casas.dominio.puerto.dao.DaoCasa;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Component;

@Component
public class ManejadorListarCasa {

    private final DaoCasa daoCasa;

    public ManejadorListarCasa(DaoCasa daoCasa) { this.daoCasa = daoCasa; }

    public Page<DtoCasa> ejecutar(Pageable pageable, String casa){
        return this.daoCasa.listar(pageable, casa);
    }
}
