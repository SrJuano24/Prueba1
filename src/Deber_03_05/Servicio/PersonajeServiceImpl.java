    /*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Deber_03_05.Servicio;



import Deber_03_05.Modelo.Personaje;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Juano
 */
public class PersonajeServiceImpl implements PersonajeService {

        private static List<Personaje> personajeList;

    public PersonajeServiceImpl() {
        this.personajeList = new ArrayList<>();
        
    }

    @Override
    public void crear(Personaje personaje) {
        this.personajeList.add(personaje);
        
    }

    @Override
    public List<Personaje> listar() {
        return this.personajeList;
    }

    @Override
    public void modificar(Personaje personaje, int codigo) {
    var indice = -1;
        for (var personajes : this.personajeList) {
            indice++;
            if (codigo == personajes.getCodigoPersonaje()) {
                this.personajeList.set(indice, personaje);
            }
        } }

    @Override
    public void eliminar(int codigo) {
        var indice = -1;
        for (var personajes : this.personajeList) {
            indice++;
            if (codigo == personajes.getCodigoPersonaje()) {
                this.personajeList.remove(indice);

            }

        }
    }

}
