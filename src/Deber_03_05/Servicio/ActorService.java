/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Deber_03_05.Servicio;



import Deber_03_05.Modelo.Actor;
import java.util.List;

/**
 *
 * @author Juano
 */
public interface ActorService {

    public abstract void crear(Actor actor);

    public Actor buscarPorCodigo(int codigo);
    public Actor buscarPorNombre(String nombre);
    public void modificar(Actor actor, int codigo);

    public void eliminar(int codigo);

    public abstract List<Actor> listar();

}
