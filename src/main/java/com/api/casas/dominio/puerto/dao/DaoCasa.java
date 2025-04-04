package com.api.casas.dominio.puerto.dao;

import com.api.casas.dominio.modelo.dto.DtoCasa;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface DaoCasa {

    Page<DtoCasa> listar(Pageable pageable, String Casa);
}
