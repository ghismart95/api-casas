package com.api.casas.dominio.modelo.entidad;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;

import static com.api.casas.comun.dominio.ValidadorArgumento.validarObligatorio;
import static com.api.casas.comun.dominio.ValidadorArgumento.validarLongitud;

@Getter
@Entity
@Table(name = "casa")
public class Casa {


    public static final String SE_DEBE_INGRESAR_EL_NOMBRE_DE_LA_CASA = "Se debe ingresar el nombre de la casa";
    public static final String LA_LONGITUD_MAXIMA_DE_LA_DESCRIPCION_DEBE_SER_DE_90 = "La longitud maxima de la descripcion debe ser de 90";
    public static final int LONGITUD_MAXIMA_DE_90 = 90;
    public static final String LA_LONGITUD_MAXIMA_DEL_NOMBRE_DEBE_SER_DE_50 = "La longitud maxima del nombre debe ser de 50";
    public static final int LONGITUD_MAXIMA_DE_50 = 50;
    public static final String SE_DEBE_INGRESAR_EL_ID_CORRECTAMENTE = "Se debe ingresar el id correctamente";
    public static final String SE_DEBE_INGRESAR_LA_CANTIDAD_DE_CUARTOS_QUE_REQUIERA = "Se debe ingresar la cantidad de cuartos que requiera";
    public static final String SE_DEBE_INGRESAR_LA_CANTIDAD_DE_BAÑOS_QUE_REQUIERA = "Se debe ingresar la cantidad de Baños que requiera";
    public static final String SE_DEBE_INGRESAR_LA_CIUDAD = "Se debe ingresar la ciudad";
    public static final String SE_DEBE_INGRESAR_EL_DEPARTAMENTO = "Se debe ingresar el departamento";
    public static final String LA_LONGITUD_MAXIMA_DE_LA_CIUDAD_ES_DE_50 = "La longitud maxima de la ciudad es de 50";
    public static final String LA_LONGITUD_MAXIMA_DEL_DEPARTAMENTO_ES_DE_50 = "La longitud maxima del departamento es de 50";

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "nombre")
    private String nombre;

    @Column(name = "desripcion")
    private String descripcion;

    @Column(name = "cantidadCuarto")
    private String cantidadCuarto;

    @Column(name = "cantidadBaños")
    private String cantidadBaños;

    @Column(name = "ciudad")
    private String ciudad;

    @Column(name = "departamento")
    private String departamento;

    public Casa(Long id, String nombre, String departamento, String ciudad, String cantidadBaños, String cantidadCuarto, String descripcion) {
        validarObligatorio(nombre, SE_DEBE_INGRESAR_EL_NOMBRE_DE_LA_CASA);
        validarLongitud(descripcion, LONGITUD_MAXIMA_DE_90, LA_LONGITUD_MAXIMA_DE_LA_DESCRIPCION_DEBE_SER_DE_90);
        validarLongitud(nombre, LONGITUD_MAXIMA_DE_50, LA_LONGITUD_MAXIMA_DEL_NOMBRE_DEBE_SER_DE_50);
        validarObligatorio(id, SE_DEBE_INGRESAR_EL_ID_CORRECTAMENTE);
        validarObligatorio(cantidadCuarto, SE_DEBE_INGRESAR_LA_CANTIDAD_DE_CUARTOS_QUE_REQUIERA);
        validarObligatorio(cantidadBaños, SE_DEBE_INGRESAR_LA_CANTIDAD_DE_BAÑOS_QUE_REQUIERA);
        validarObligatorio(ciudad, SE_DEBE_INGRESAR_LA_CIUDAD);
        validarObligatorio(departamento, SE_DEBE_INGRESAR_EL_DEPARTAMENTO);
        validarLongitud(ciudad, 50, LA_LONGITUD_MAXIMA_DE_LA_CIUDAD_ES_DE_50);
        validarLongitud(departamento, 50, LA_LONGITUD_MAXIMA_DEL_DEPARTAMENTO_ES_DE_50);
        this.id = id;
        this.nombre = nombre;
        this.departamento = departamento;
        this.ciudad = ciudad;
        this.cantidadBaños = cantidadBaños;
        this.cantidadCuarto = cantidadCuarto;
        this.descripcion = descripcion;
    }
}

