package com.api.casas.aplicacion.comando.fabrica;

import com.api.casas.aplicacion.comando.ComandoVendedor;
import com.api.casas.dominio.modelo.entidad.Vendedor;
import org.springframework.stereotype.Component;

@Component
public class FabricaVendedor {

    public Vendedor crear(ComandoVendedor comandoVendedor) {
        return new Vendedor(
                comandoVendedor.getNombre(),
                comandoVendedor.getApellido(),
                comandoVendedor.getDocumentoIdentidad(),
                comandoVendedor.getCelular(),
                comandoVendedor.getFechaNacimiento(),
                comandoVendedor.getCorreo(),
                comandoVendedor.getClave()
        );
    }

}
