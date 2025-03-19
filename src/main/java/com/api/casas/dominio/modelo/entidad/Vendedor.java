package com.api.casas.dominio.modelo.entidad;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;

import java.time.LocalDate;

import static com.api.casas.comun.dominio.ValidadorArgumento.validarRegex;
import static com.api.casas.comun.dominio.ValidadorArgumento.validarObligatorio;

@Getter
@Entity
@Table(name = "usuario")
public class Vendedor {

    public static final String EL_NOMBRE_ES_UN_DATO_REQUERIDO = "El nombre es un dato requerido.";
    public static final String EL_APELLIDO_ES_UN_DATO_REQUERIDO = "El apellido es un dato requerido.";
    public static final String EL_DOCUMENTO_DE_IDENTIDAD_ES_REQUERIDO = "El documento de identidad es requerido.";
    public static final String EL_NUMERO_DE_CELULAR_ES_OBLIGATORIO = "El numero de celular es obligatorio.";
    public static final String LA_FECHA_DE_NACIMIENTO_ES_OBLIGATORIO = "La fecha de nacimiento es obligatorio.";
    public static final String EL_CORREO_ES_REQUERIDO = "El correo es requerido.";
    public static final String LA_CLAVE_ES_OBLIGATORIA = "La clave es obligatoria.";
    public static final String VALIDACION_CORREO = "^[a-zA-Z0-9._%+-]+@[a-zA-Z0-9-]+\\.[a-zA-Z]{2,}$";
    public static final String EL_CORREO_ES_INVALIDO_PORFAVOR_VERIFICARLO = "El correo es invalido porfavor verificarlo.";
    public static final String VALIDACION_NUMERO_CELULAR = "^\\+?\\d{0,12}$";
    public static final String EL_CELULAR_DEBE_DE_TENER_MAXIMO_13_CARACTERES_Y_SOLO_PUEDE_TENER_EL_SIMBOLO_MAS = "El celular debe de tener maximo 13 caracteres y solo puede tener el simbolo mas(+).";
    public static final String EL_DOCUMENTO_DE_IDENTIDAD_DEBE_DE_SER_UNICAMENTE_NUMERICO = "El documento de identidad debe de ser unicamente numerico.";
    public static final String VALIDACION_DOCUMENTO_IDENTIDAD = "^[0-9]+$";
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "nombre")
    private String nombre;

    @Column(name = "apellido")
    private String apellido;

    @Column(name = "documento_identidad")
    private String documentoIdentidad;

    @Column(name = "celular")
    private String celular;

    @Column(name = "fecha_nacimiento")
    private LocalDate fechaNacimiento;

    @Column(name = "correo")
    private String correo;

    @Column(name = "clave")
    private String clave;

    public Vendedor(String nombre, String apellido, String documentoIdentidad, String celular, LocalDate fechaNacimiento, String correo, String clave) {
        validarObligatorio(nombre, EL_NOMBRE_ES_UN_DATO_REQUERIDO);
        validarObligatorio(apellido, EL_APELLIDO_ES_UN_DATO_REQUERIDO);
        validarObligatorio(documentoIdentidad, EL_DOCUMENTO_DE_IDENTIDAD_ES_REQUERIDO);
        validarObligatorio(celular, EL_NUMERO_DE_CELULAR_ES_OBLIGATORIO);
        validarObligatorio(fechaNacimiento, LA_FECHA_DE_NACIMIENTO_ES_OBLIGATORIO);
        validarObligatorio(correo, EL_CORREO_ES_REQUERIDO);
        validarObligatorio(clave, LA_CLAVE_ES_OBLIGATORIA);

        validarRegex(correo, VALIDACION_CORREO, EL_CORREO_ES_INVALIDO_PORFAVOR_VERIFICARLO);
        validarRegex(celular, VALIDACION_NUMERO_CELULAR, EL_CELULAR_DEBE_DE_TENER_MAXIMO_13_CARACTERES_Y_SOLO_PUEDE_TENER_EL_SIMBOLO_MAS);
        validarRegex(documentoIdentidad, VALIDACION_DOCUMENTO_IDENTIDAD, EL_DOCUMENTO_DE_IDENTIDAD_DEBE_DE_SER_UNICAMENTE_NUMERICO);

        this.nombre = nombre;
        this.apellido = apellido;
        this.documentoIdentidad = documentoIdentidad;
        this.celular = celular;
        this.fechaNacimiento = fechaNacimiento;
        this.correo = correo;
        this.clave = clave;
    }
}
