/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Deber_03_05.Modelo;

/**
 *
 * @author Juano
 */
public class Personaje {

    private int codigoPersonaje;
    private String nombrePersonaje;
    private Pelicula film;
    private Actor interprete;
    private int edadPersonaje;
    private String rol;
    private String calificacion;
    private String descripcionPersonaje;

    public Personaje(int codigoPersonaje, String nombrePersonaje, Pelicula film, Actor interprete, int edadPersonaje, String rol, String calificacion, String descripcionPersonaje) {
        this.codigoPersonaje = codigoPersonaje;
        this.nombrePersonaje = nombrePersonaje;
        this.film = film;
        this.interprete = interprete;
        this.edadPersonaje = edadPersonaje;
        this.rol = rol;
        this.calificacion = calificacion;
        this.descripcionPersonaje = descripcionPersonaje;
    }

    public int getCodigoPersonaje() {
        return codigoPersonaje;
    }

    public void setCodigoPersonaje(int codigoPersonaje) {
        this.codigoPersonaje = codigoPersonaje;
    }

    public String getNombrePersonaje() {
        return nombrePersonaje;
    }

    public void setNombrePersonaje(String nombrePersonaje) {
        this.nombrePersonaje = nombrePersonaje;
    }

    public String getRol() {
        return rol;
    }

    public void setRol(String rol) {
        this.rol = rol;
    }

    public Actor getInterprete() {
        return interprete;
    }

    public void setInterprete(Actor interprete) {
        this.interprete = interprete;
    }

    public Pelicula getFilm() {
        return film;
    }

    public void setFilm(Pelicula film) {
        this.film = film;
    }

    public int getEdadPersonaje() {
        return edadPersonaje;
    }

    public void setEdadPersonaje(int edadPersonaje) {
        this.edadPersonaje = edadPersonaje;
    }

    public String getCalificacion() {
        return calificacion;
    }

    public void setCalificacion(String calificacion) {
        this.calificacion = calificacion;
    }

    public String getDescripcionPersonaje() {
        return descripcionPersonaje;
    }

    public void setDescripcionPersonaje(String descripcionPersonaje) {
        this.descripcionPersonaje = descripcionPersonaje;
    }

    private String SeleccionRol() {
        var retorno = "";

        switch (this.rol) {
            case "PROTAGONISTA":
                retorno = "Es un personaje principal";
                break;
            case "ANTAGONISTA":
                retorno = "Es un personaje secundario";
                break;
            case "COPROTAGONISTA":
                retorno = "Es un personaje de reparto";
                break;
        }

        return retorno;
    }

    @Override
    public String toString() {
        return "Personaje{" + "codigoPersonaje=" + codigoPersonaje
                + "nombrePersonaje=" + nombrePersonaje
                + ", film=" + film.getNombrePelicula() + ", interprete="
                + interprete.getNombreActor() + ", edadPersonaje="
                + edadPersonaje + ", rol=" + rol + " el personaje: " 
                + this.SeleccionRol() + ", calificacion=" + calificacion
                + ", descripcionPersonaje=" + descripcionPersonaje + '}';
    }

}
