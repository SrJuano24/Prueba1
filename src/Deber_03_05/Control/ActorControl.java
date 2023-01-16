/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Deber_03_05.Control;

import Deber_03_05.Modelo.Actor;
import Deber_03_05.Servicio.ActorServiceImpl;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author Juano
 */
public class ActorControl {

    private ActorServiceImpl actorServiceImpl;

    public ActorControl() {
        this.actorServiceImpl = new ActorServiceImpl();
    }

    public String crear(String[] data) {
        try {
            var retorno = "No se pudo crear el actor:";

            var codigoActor = Integer.valueOf(data[0]).intValue();
            var nombreActor = data[1];
            var lugarNacimiento = data[2];
            var edad = Integer.valueOf(data[3]).intValue();
            var genero = data[4];
            var nominaciones = data[5];
            var numeroNominaciones = Integer.valueOf(data[6]).intValue();

            if (edad < 1) {
                retorno += " Edad incorrecta.";

            } else {
                if (numeroNominaciones < 1) {
                    retorno += " Numero de nominaciones incorrecto.";

                } else {
                    var actor = new Actor(codigoActor, nombreActor, lugarNacimiento, edad, genero, nominaciones, numeroNominaciones);
                }

                if (this.codigoExiste(codigoActor)) {
                    throw new RuntimeException("Código existe");
                } else {
                    var actor = new Actor(codigoActor, nombreActor, lugarNacimiento, edad, genero, nominaciones, numeroNominaciones);
                    this.actorServiceImpl.crear(actor);
                    retorno = "Actor: " + actor.getNombreActor() + " Creado correctamente: ";
                }
            }
        } catch (NumberFormatException e1) {
            throw new NumberFormatException("Error al convertir el formato");
        }
        return null;

    }

    // this.actorServiceImpl.crear(actor);
    //           retorno = "Actor: " + actor.getNombreActor() + " Creado correctamente: ";
    public boolean codigoExiste(int codigoActual) {
        var retorno = false;
        for (var actor : this.actorServiceImpl.listar()) {
            if (actor.getCodigoActor() == codigoActual) {
                retorno = true;
            }
        }
        return retorno;
    }

    public String modifcar(String[] data) {
        try {
            var retorno = "No se pudo crear el actor:";
            var codigoActor = Integer.valueOf(data[0]).intValue();
            var nombreActor = data[1];
            var lugarNacimiento = data[2];
            var edad = Integer.valueOf(data[3]).intValue();
            var genero = data[4];
            var nominaciones = data[5];
            var numeroNominaciones = Integer.valueOf(data[6]).intValue();
            var actorModificado = Integer.valueOf(data[7]).intValue();

            if (edad < 1) {
                return " Edad incorrecta.";

            } else {
                if (numeroNominaciones < 1) {
                    return " Numero de nominaciones incorrecto.";

                } else {
                    if (!this.codigoExiste(actorModificado)) {
                        throw new RuntimeException("Código no existe");

                    } else {
                        var actor = new Actor(codigoActor, nombreActor, lugarNacimiento, edad, genero, nominaciones, numeroNominaciones);
                        this.actorServiceImpl.modificar(actor, actorModificado);
                        retorno = "Actor: " + actor.getNombreActor() + " Modificado correctamente: ";
                    }
                }
            }
        } catch (NumberFormatException e1) {
            throw new NumberFormatException("Error al convertir el formato");
        }
        return null;

    }

    public List<Actor> Listar() {
        return this.actorServiceImpl.listar();

    }

    public void eliminar(String codigos) {
        try {
            var codigo = Integer.valueOf(codigos).intValue();
            if (this.codigoExiste(codigo)) {
                this.actorServiceImpl.eliminar(codigo);

            } else {
                throw new RuntimeException("Código no existe");

            }
        } catch (NumberFormatException e1) {
            throw new NumberFormatException("Error al convertir el formato");
        }
    }
}
