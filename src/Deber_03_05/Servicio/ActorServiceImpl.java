/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Deber_03_05.Servicio;

import Deber_03_05.Modelo.Actor;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Juano
 */
public class ActorServiceImpl implements ActorService {

    private static List<Actor> actorList;

    public ActorServiceImpl() {
        this.actorList = new ArrayList<>();
    }

    @Override
    public void crear(Actor actor) {
        this.actorList.add(actor);
    }

    @Override
    public Actor buscarPorCodigo(int codigo) {
        Actor retorno = null;
        for (var actor : this.actorList) {
            if (codigo == actor.getCodigoActor()) {
                retorno = actor;
                break;
            }
        }
        return retorno;
    }

    @Override
    public List<Actor> listar() {
        return this.actorList;
    }

    @Override
    public Actor buscarPorNombre(String nombre) {
        Actor retorno = null;

        for (var actor : this.actorList) {
            if (nombre.equals(actor.getNombreActor())) {
                retorno = actor;
                break;
            }
        }

        return retorno;
    }

    @Override
    public void modificar(Actor actor, int codigo) {
        var indice = -1;
        for (var actores : this.actorList) {
            indice++;
            if (codigo == actores.getCodigoActor()) {
                this.actorList.set(indice, actor);
            }
        }
    }

    @Override
    public void eliminar(int codigo) {
        var indice = -1;
        for (var actores : this.actorList) {
            indice++;
            if (codigo == actores.getCodigoActor()) {
                this.actorList.remove(indice);

            }

        }
    }
}
