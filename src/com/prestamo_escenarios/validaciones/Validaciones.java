/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.prestamo_escenarios.validaciones;

import com.prestamo_escenarios.dominio.Usuarios;
import java.util.ArrayList;

/**
 *
 * @author Usuario Final
 */
public class Validaciones {
    
        //------------------------Recorre con un bucle for la lista de usuarios y en cada ciclo hace un if donde pregunta
    //-----------------------si el usuario y contraseña ingresados en los parametros coincide con algun registro en la lista
    //-----------------------si existe una coincidencia retorna un true caso contrario un false y rompe el ciclo con break
    public static boolean Buscar_usuario(String usuario, String contrasenia, ArrayList<Usuarios> list) {
        boolean res = false;
        for (int i = 0; i < list.size(); i++) {
            if (usuario.equals(list.get(i).getUsuario()) && contrasenia.equals(list.get(i).getContrasenia())) {
                res = true;
                break;
            }
        }

        return res;
    }
    
    //------------------Recorre una lista de Usuarios y busca si el usuario coincide con el usuario ingresado-----------------

    public static int getPosUsuario(String usuario, ArrayList<Usuarios> list) {
        int res = -1;
        for (int i = 0; i < list.size(); i++) {
            if (usuario.equals(list.get(i).getUsuario())) {
                res = i;
                break;
            }
        }

        return res;
    }
}
