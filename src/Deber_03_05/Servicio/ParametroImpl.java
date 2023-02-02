/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Deber_03_05.Servicio;


import Deber_03_05.Modelo.Parametro;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Juano
 */
public class ParametroImpl implements Parametroservice {

    private static List<Parametro> peliculaList;

    public ParametroImpl() {
        this.peliculaList = new ArrayList<>();
    }

    @Override
    public void crear(Parametro pelicula) {
        this.peliculaList.add(pelicula);
    }

    @Override
    public List<Parametro> listar() {
        return this.peliculaList;
    }
}
