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
public class Categoria {

    private static final String SE_DEBE_INGRESAR_EL_NOMBRE_DE_LA_CATEGORIA = "Se debe ingresar el nombre de la categoria.";
    public static final String LA_LONGITUD_MINIMA_DE_LA_DESCRIPCION_DEBE_SER_DE_90 = "La longitud minima de la descripcion debe ser de 90";
    public static final int LONGITUD_MINIMA_DE_90 = 90;
    public static final String LA_LONGITUD_MAXIMA_DEL_NOMBRE_DEBE_SER_DE_50 = "La longitud maxima del nombre debe ser de 50";
    public static final int LONGITUD_MAXIMA_DE_50 = 50;


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "nombre")
    private String nombre;

    @Column(name = "descripcion")
    private String descripcion;

    public Categoria(String nombre, String descripcion) {
        validarObligatorio(nombre, SE_DEBE_INGRESAR_EL_NOMBRE_DE_LA_CATEGORIA);
        validarLongitud(descripcion, LONGITUD_MINIMA_DE_90, LA_LONGITUD_MINIMA_DE_LA_DESCRIPCION_DEBE_SER_DE_90);
        validarLongitud(nombre, LONGITUD_MAXIMA_DE_50, LA_LONGITUD_MAXIMA_DEL_NOMBRE_DEBE_SER_DE_50);
        this.nombre = nombre;
        this.descripcion = descripcion;
    }

}
