/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Deber_03_05.Servicio;


import Deber_03_05.Modelo.Pelicula;

import java.util.List;

/**
 *
 * @author Juano
 */
public interface PeliculaService {

    public abstract void crear(Pelicula pelicula);

    public Pelicula buscarPorCodigo(int codigo);

    public Pelicula buscarPorNombre(String nombre);

    public void modificar(Pelicula pelicula, int codigo);

    public void eliminar(int codigo);

    public abstract List<Pelicula> listar();

}
