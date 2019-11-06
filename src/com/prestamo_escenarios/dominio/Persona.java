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
public class Persona {
    
    //----------Declaracion de atributos de la clase persona----------
    private String identificacion;
    private String nombres;
    private String apellidos;
    private String fecha_de_nacimiento;
    private String genero;
    private String celular;
    //-----------------------------------------------------------------

   //----------Constructores de la clase Persona----------
    
    public Persona() {
    }

    public Persona(String identificacion, String nombres, String apellidos, String fecha_de_nacimiento, String genero, String celular) {
        this.identificacion = identificacion;
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.fecha_de_nacimiento = fecha_de_nacimiento;
        this.genero = genero;
        this.celular = celular;
    }
    //-----------------------------------------------------------------

    
    //----------Metodos Get y Set para acceder a los atributos privados de la clase persona----------
    
    public String getCelular() {
        return celular;
    }

    public void setCelular(String celular) {
        this.celular = celular;
    }

    public String getIdentificacion() {
        return identificacion;
    }

    public void setIdentificacion(String identificacion) {
        this.identificacion = identificacion;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getFecha_de_nacimiento() {
        return fecha_de_nacimiento;
    }

    public void setFecha_de_nacimiento(String fecha_de_nacimiento) {
        this.fecha_de_nacimiento = fecha_de_nacimiento;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }
    //-----------------------------------------------------------------

    
}
