/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Deber_03_05.Servicio;


import Deber_03_05.Modelo.Personaje;
import java.util.List;

/**
 *
 * @author Juano
 */
public interface PersonajeService {

    public abstract void crear(Personaje personaje);

    public abstract List<Personaje> listar();

    public void modificar(Personaje personaje, int codigo);

    public void eliminar(int codigo);

}
