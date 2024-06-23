package org.cbecerra.app.hogar;

public class Persona {
    private String nombre;
    private String apellido;
    private ColorPelo colorPelo;

    public static final String GENERO_FEMENINO = "Mujer";
    public static final String GENERO_MASCULINO = "Hombre";

    public String getNombre() {
        return nombre;

    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public ColorPelo getColorPelo() {
        return colorPelo;
    }

    public void setColorPelo(ColorPelo colorPelo) {
        this.colorPelo = colorPelo;
    }
}
