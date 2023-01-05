/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Deber_03_05.Control;



import Deber_03_05.Modelo.Pelicula;
import Deber_03_05.Servicio.PeliculaServiceImpl;
import java.util.List;

/**
 *
 * @author Juano
 */
public class PeliculaControl {

    private final PeliculaServiceImpl peliculaServiceImpl;

    public PeliculaControl() {
        this.peliculaServiceImpl = new PeliculaServiceImpl();

    }

    public String crear(String[] data) {
        var retorno = "No se pudo crear la pelicula:";

        var codigoPelicula = Integer.valueOf(data[0]).intValue();
        var nombrePelicula = data[1];
        var Genero = data[2];
        var yearLanzamiento = Integer.valueOf(data[3]).intValue();
        var idioma = data[4];
        var clasificacion = data[5];
        var duracion = Integer.valueOf(data[6]).intValue();
        var reseña = data[7];

        if (yearLanzamiento < 1980) {
            retorno += " Año de lanzamiento incorrecto.";

        } else {
            if (duracion < 0) {
                retorno += " Duracion de pelicula incorrecto.";

            } else {
                var pelicula = new Pelicula(codigoPelicula, nombrePelicula, Genero, yearLanzamiento, idioma, clasificacion, duracion, reseña);

                this.peliculaServiceImpl.crear(pelicula);
                retorno = "Pelicula: " + pelicula.getNombrePelicula() + " Creada correctamente: ";
            }
        }
        return retorno;

    }
     public String modificar(String[] data) {
        var retorno = "No se pudo crear la pelicula:";

        var codigoPelicula = Integer.valueOf(data[0]).intValue();
        var nombrePelicula = data[1];
        var Genero = data[2];
        var yearLanzamiento = Integer.valueOf(data[3]).intValue();
        var idioma = data[4];
        var clasificacion = data[5];
        var duracion = Integer.valueOf(data[6]).intValue();
        var reseña = data[7];
        var peliculaModificada = Integer.valueOf(data[8]).intValue();

        if (yearLanzamiento < 1980) {
            retorno += " Año de lanzamiento incorrecto.";

        } else {
            if (duracion < 0) {
                retorno += " Duracion de pelicula incorrecto.";

            } else {
                var pelicula = new Pelicula(codigoPelicula, nombrePelicula, Genero, yearLanzamiento, idioma, clasificacion, duracion, reseña);
                 this.peliculaServiceImpl.modificar(pelicula, peliculaModificada);
                retorno = "Pelicula: " + pelicula.getNombrePelicula() + " Moficada correctamente: ";
            }
        }
        return retorno;

    }
     public void eliminar(String codigos){
        var codigo=Integer.valueOf(codigos).intValue();
        this.peliculaServiceImpl.eliminar(codigo);
    
    
    }

    public List<Pelicula> Listar() {
        return this.peliculaServiceImpl.listar();

    }

}
