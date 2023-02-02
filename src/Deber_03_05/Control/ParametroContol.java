/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Deber_03_05.Control;

import Deber_03_05.Modelo.Parametro;
import Deber_03_05.Servicio.ParametroImpl;
import java.time.LocalDate;
import java.util.List;

/**
 *
 * @author Juano
 */
public class ParametroContol {

    private final ParametroImpl peliculaServiceImpl;

    public ParametroContol() {
        this.peliculaServiceImpl = new ParametroImpl();

    }

    public String crear(String[] data) {
        try {
            var retorno = "No se pudo crear la pelicula:";

            var codigoPelicula = Integer.valueOf(data[0]).intValue();
            var nombrePelicula = data[1];
            var year = Integer.valueOf(data[2]).intValue();
            var mes = Integer.valueOf(data[3]).intValue();
            var dia = Integer.valueOf(data[4]).intValue();
           

            if (false) {
                retorno += " Año de lanzamiento incorrecto.";

            } else {
                if (false) {
                    retorno += " Duracion de pelicula incorrecto.";

                } else {
                    if (false) {
                        throw new RuntimeException("Código existe");
                    } else {
                        var pelicula = new Parametro(codigoPelicula,nombrePelicula,LocalDate.of(year,mes,dia));
                        this.peliculaServiceImpl.crear(pelicula);
                        
                    }
                }

            }

        } catch (NumberFormatException e1) {
            throw new NumberFormatException("Error al convertir el formato");
        }
        return null;
    }

    

    
    public List<Parametro> Listar() {
        return this.peliculaServiceImpl.listar();

    }

}
