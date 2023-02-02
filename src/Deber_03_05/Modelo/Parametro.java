/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Deber_03_05.Modelo;

import java.time.LocalDate;

/**
 *
 * @author Juano
 */
public class Parametro {
    int codigo;
    String descripcion ;
        LocalDate   
                fecha;

    public Parametro(int codigo, String descripcion, LocalDate fecha) {
        this.codigo = codigo;
        this.descripcion = descripcion;
        this.fecha = fecha;
    }

    @Override
    public String toString() {
        return "Parametro{" + "codigo=" + codigo + ", descripcion=" + descripcion + ", fecha=" + fecha + '}';
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }

    public int getCodigo() {
        return codigo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public LocalDate getFecha() {
        return fecha;
    }
        
        
}