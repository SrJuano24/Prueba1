/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Deber_03_05.Servicio;


import Deber_03_05.Modelo.Pelicula;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Juano
 */
public class PeliculaServiceImpl implements PeliculaService {

    private static List<Pelicula> peliculaList;

    public PeliculaServiceImpl() {
        this.peliculaList = new ArrayList<>();
    }

    @Override
    public void crear(Pelicula pelicula) {
        this.peliculaList.add(pelicula);
    }

    @Override
    public List<Pelicula> listar() {
        return this.peliculaList;
    }

    @Override
    public Pelicula buscarPorCodigo(int codigo) {
        Pelicula retorno = null;
        for (var pelicula : this.peliculaList) {
            if (codigo == pelicula.getCodigoPelicula()) {
                retorno = pelicula;
                break;
            }
        }
        return retorno;
    }

    @Override
    public Pelicula buscarPorNombre(String nombre) {
        Pelicula retorno = null;

        for (var pelicula : this.peliculaList) {
            if (nombre.equals(pelicula.getNombrePelicula())) {
                retorno = pelicula;
                break;
            }
        }

        return retorno;
    }

    @Override
    public void modificar(Pelicula pelicula, int codigo) {
        var indice = -1;
        for (var peliculas : this.peliculaList) {
            indice++;
            if (codigo == peliculas.getCodigoPelicula()) {
                this.peliculaList.set(indice, pelicula);
            }
        }
    }

    @Override
    public void eliminar(int codigo) {
        var indice = -1;
        for (var peliculas : this.peliculaList) {
            indice++;
            if (codigo == peliculas.getCodigoPelicula()) {
                this.peliculaList.remove(indice);

            }

        }
    }

}
