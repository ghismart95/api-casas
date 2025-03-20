package com.api.casas.dominio.modelo.entidad;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;

import static com.api.casas.comun.dominio.ValidadorArgumento.validarLongitud;
import static com.api.casas.comun.dominio.ValidadorArgumento.validarObligatorio;


@Getter
@Entity
@Table(name = "categoria_casa")
public class Ubicacion {

    public static final String SE_DEBE_INGRESAR_LA_CIUDAD = "Se debe ingresar la ciudad.";
    public static final String SE_DEBE_INGRESAR_EL_DEPARTAMENTO = "Se debe ingresar el departamento.";
    public static final String LA_LONGITUD_MAXIMA_DE_LA_DESCRIPCION_ES_DE_120_CARACTERES = "La longitud maxima de la descripcion es de 120 caracteres.";
    public static final int LONGITUD_MAXIMA_120 = 120;
    public static final String LA_LONGITUD_MAXIMA_DE_LA_DESCRIPCION_ES_DE_120_CARACTERES1 = "La longitud maxima de la descripcion es de 120 caracteres.";
    public static final int LONGITUD_MAXIMA_50 = 50;
    public static final String LA_LONGITUD_MAXIMA_DE_LA_CIUDAD_ES_DE_50_CARACTERES = "La longitud maxima de la ciudad es de 50 caracteres.";
    public static final String LA_LONGITUD_MAXIMA_DEL_DEPARTAMENTO_ES_DE_50_CARACTERES = "La longitud maxima del departamento es de 50 caracteres.";
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "ciudad")
    private String ciudad;

    @Column(name = "departamento")
    private String depertamento;

    @Column(name = "descripcion_ciudad")
    private String descripcionCiudad;

    @Column(name = "descripcion_departamento")
    private String descripcionDepartamento;

    public Ubicacion(String ciudad, String depertamento, String descripcionCiudad, String descripcionDepartamento) {
        validarObligatorio(ciudad, SE_DEBE_INGRESAR_LA_CIUDAD);
        validarObligatorio(depertamento, SE_DEBE_INGRESAR_EL_DEPARTAMENTO);
        validarLongitud(ciudad, LONGITUD_MAXIMA_50, LA_LONGITUD_MAXIMA_DE_LA_CIUDAD_ES_DE_50_CARACTERES);
        validarLongitud(depertamento, LONGITUD_MAXIMA_50, LA_LONGITUD_MAXIMA_DEL_DEPARTAMENTO_ES_DE_50_CARACTERES);
        validarLongitud(descripcionCiudad, LONGITUD_MAXIMA_120, LA_LONGITUD_MAXIMA_DE_LA_DESCRIPCION_ES_DE_120_CARACTERES);
        validarLongitud(descripcionDepartamento, LONGITUD_MAXIMA_120, LA_LONGITUD_MAXIMA_DE_LA_DESCRIPCION_ES_DE_120_CARACTERES1);

        this.ciudad = ciudad;
        this.depertamento = depertamento;
        this.descripcionCiudad = descripcionCiudad;
        this.descripcionDepartamento = descripcionDepartamento;
    }
}
