package com.api.casas.comun.dominio;

import com.api.casas.comun.dominio.excepcion.ExcepcionLongitudValor;
import com.api.casas.comun.dominio.excepcion.ExcepcionValorInvalido;
import com.api.casas.comun.dominio.excepcion.ExcepcionValorObligatorio;
import org.apache.logging.log4j.util.Strings;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidadorArgumento {

    private ValidadorArgumento() {}

    public static void validarObligatorio(Object valor, String mensaje) {
        if (valor == null || Strings.isBlank(valor.toString())) {
            throw new ExcepcionValorObligatorio(mensaje);
        }
    }

    public static void validarLongitud(String valor,int longitud,String mensaje){
        if(valor.length() > longitud){
            throw new ExcepcionLongitudValor(mensaje);
        }
    }

    public static void validarRegex(String correoElectronico, String regex, String mensaje) {
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(correoElectronico);

        if (!matcher.matches()) {
            throw new ExcepcionValorInvalido(mensaje);
        }
    }
}
