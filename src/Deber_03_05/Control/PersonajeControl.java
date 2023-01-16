/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Deber_03_05.Control;

import Deber_03_05.Modelo.Personaje;
import Deber_03_05.Servicio.ActorServiceImpl;
import Deber_03_05.Servicio.PeliculaServiceImpl;
import Deber_03_05.Servicio.PersonajeServiceImpl;
import java.util.List;

/**
 *
 * @author Juano
 */
public class PersonajeControl {

    private PeliculaServiceImpl peliculaServiceImpl = new PeliculaServiceImpl();
    private ActorServiceImpl actorServiceImpl = new ActorServiceImpl();
    private PersonajeServiceImpl personajeServiceImpl = new PersonajeServiceImpl();

    public String crear(String[] data) {
        try {
            var retorno = "No se pudo crear la pelicula:";

            var codigoPersonaje = Integer.valueOf(data[0]).intValue();;
            var nombrePersonaje = data[1];
            var film = this.peliculaServiceImpl.buscarPorNombre(data[2]);
            var interprete = this.actorServiceImpl.buscarPorNombre(data[3]);
            var edadPersonaje = Integer.valueOf(data[4]).intValue();
            var rol = data[5];
            var calificacion = data[6];
            var descripcionPersonaje = data[7];

            if (edadPersonaje < 0) {
                retorno += " Edad del personaje incorrecto.";

            } else {
                if (edadPersonaje < 0) {
                    retorno += " Calificacion del perosonaje incorrecto.";

                } else {
                    if (this.codigoExiste(codigoPersonaje)) {
                        throw new RuntimeException("Código existe");
                    } else {
                        var personaje = new Personaje(codigoPersonaje, nombrePersonaje, film, interprete, edadPersonaje, rol, calificacion, descripcionPersonaje);
                        this.personajeServiceImpl.crear(personaje);

                        retorno = "Personaje: " + personaje.getNombrePersonaje() + " Creado correctamente: ";
                    }
                }

            }

        } catch (NumberFormatException e1) {
            throw new NumberFormatException("Error al convertir el formato");
        }
        return null;
    }

    public boolean codigoExiste(int codigoActual) {
        var retorno = false;
        for (var personaje : this.personajeServiceImpl.listar()) {
            if (personaje.getCodigoPersonaje() == codigoActual) {
                retorno = true;
            }
        }
        return retorno;
    }

    public String modificar(String[] data) {
        try {
            var retorno = "No se pudo crear la pelicula:";

            var codigoPersonaje = Integer.valueOf(data[0]).intValue();;
            var nombrePersonaje = data[1];
            var film = this.peliculaServiceImpl.buscarPorNombre(data[2]);
            var interprete = this.actorServiceImpl.buscarPorNombre(data[3]);
            var edadPersonaje = Integer.valueOf(data[4]).intValue();
            var rol = data[5];
            var calificacion = data[6];
            var descripcionPersonaje = data[7];
            var personajeModificado = Integer.valueOf(data[8]).intValue();;

            if (edadPersonaje < 0) {
                retorno += " Edad del personaje incorrecto.";

            } else {
                if (edadPersonaje < 0) {
                    retorno += " Calificacion del perosonaje incorrecto.";

                } else {
                    if (!this.codigoExiste(personajeModificado)) {
                        throw new RuntimeException("Código no existe");
                    } else {
                        var personaje = new Personaje(codigoPersonaje, nombrePersonaje, film, interprete, edadPersonaje, rol, calificacion, descripcionPersonaje);
                        this.personajeServiceImpl.modificar(personaje, personajeModificado);

                        retorno = "Personaje: " + personaje.getNombrePersonaje() + " Modificado correctamente: ";
                    }
                }
            }
        } catch (NumberFormatException e1) {
            throw new NumberFormatException("Error al convertir el formato");
        }
        return null;

    }

    public void eliminar(String codigos) {
        try {
            var codigo = Integer.valueOf(codigos).intValue();
            if (this.codigoExiste(codigo)) {
                this.personajeServiceImpl.eliminar(codigo);
            } else {
                throw new RuntimeException("Código no existe");

            }
        } catch (NumberFormatException e1) {
            throw new NumberFormatException("Error al convertir el formato");
        }
    }

    public List<Personaje> Listar() {
        return this.personajeServiceImpl.listar();

    }
}
