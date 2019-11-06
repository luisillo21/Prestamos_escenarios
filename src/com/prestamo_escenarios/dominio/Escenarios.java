/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.prestamo_escenarios.dominio;

/**
 *
 * @author Usuario Final
 */
public class Escenarios {
 //nombre de escenario, descripción y observaciones.
    //-----------------------Atributos de la clase scenario----------------------------
    private String nombre_escenario;
    private String descripcion;
    private String observaciones;
    //---------------------------------------------------
    
    
    //---------------------Constructores de la clase Escenarios--------------------------
    
    
    public Escenarios() {
    }

    public Escenarios(String nombre_escenario, String descripcion, String observaciones) {
        this.nombre_escenario = nombre_escenario;
        this.descripcion = descripcion;
        this.observaciones = observaciones;
    }

    //-----------------------------------------------------------------------------------
    
    //--------------------------Metodos Get y Set para acceder a los atributos de ña clase Escenarios-----------------------------

    public String getNombre_escenario() {
        return nombre_escenario;
    }

    public void setNombre_escenario(String nombre_escenario) {
        this.nombre_escenario = nombre_escenario;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getObservaciones() {
        return observaciones;
    }

    public void setObservaciones(String observaciones) {
        this.observaciones = observaciones;
    }
    
    //-------------------------------------------------------------------------------------------------------------------------------
    
}
