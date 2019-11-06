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
public class Usuarios extends Persona{
    
    //-----------------------Atributos de la clase Usuarios-------------------------------------------------------
    private String usuario;
    private String contrasenia;
    private String tipo_usuario;
    
    
    //------------------------Constructores de la clase Usuario--------------------------------------------------

    public Usuarios() {
    }
    
    //------------------------------La palabra super() es la primera línea de un constructor---------------------
    //------------------------------e invoca al constructor de la clase superior---------------------------------
    //------------------------------que comparta el mismo tipo de parametrización.-------------------------------
    public Usuarios(String nombres, String usuario, String contrasenia, String tipo_usuario, String identificacion, String apellidos, String fecha_de_nacimiento, String genero, String celular) {
        super(identificacion, nombres, apellidos, fecha_de_nacimiento, genero, celular);
        this.usuario = usuario;
        this.contrasenia = contrasenia;
        this.tipo_usuario = tipo_usuario;
    }
    //------------------------------------------------------------------------------------------------------------------
    
    //-----------------------------------Metodos Ges y Set para acceder a los atributos de la clase Usuario-----
    
    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getContrasenia() {
        return contrasenia;
    }

    public void setContrasenia(String contrasenia) {
        this.contrasenia = contrasenia;
    }

    public String getTipo_usuario() {
        return tipo_usuario;
    }

    public void setTipo_usuario(String tipo_usuario) {
        this.tipo_usuario = tipo_usuario;
    }
    
    
    
}
