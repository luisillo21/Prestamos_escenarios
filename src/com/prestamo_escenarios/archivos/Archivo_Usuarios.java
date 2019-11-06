/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.prestamo_escenarios.archivos;

import com.prestamo_escenarios.dominio.Persona;
import com.prestamo_escenarios.archivos.Archivo;
import com.prestamo_escenarios.dominio.Usuarios;
import static com.prestamo_escenarios.validaciones.Validaciones.Buscar_usuario;
import static com.prestamo_escenarios.validaciones.Validaciones.getPosUsuario;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;
import org.apache.commons.codec.digest.DigestUtils;

/**
 *
 * @author Usuario Final
 */
public class Archivo_Usuarios {

    static ArrayList<Usuarios> lista = new ArrayList<Usuarios>();

    public ArrayList<Usuarios> leerUsuarios(String archivo) {

        StringBuilder sb = new StringBuilder();
        try {
            BufferedReader lector = new BufferedReader(new FileReader(archivo));
            String linea;
            while ((linea = lector.readLine()) != null) {
                sb.append(linea).append("\n");
                String[] arreglo = linea.split(";");
                Usuarios objeto = new Usuarios(arreglo[0],
                        arreglo[1],
                        arreglo[2],
                        arreglo[3],
                        arreglo[4],
                        arreglo[5],
                        arreglo[6],
                        arreglo[7],
                        arreglo[8]);
                lista.add(objeto);
            }
        } catch (IOException e) {
        }
        return lista;
    }

    public void insertar_Usuario() {

        //---------------------------Objeto que sirve para pedir datos por consola
        Scanner l = new Scanner(System.in);

        //---------------------------Variables que contendran los valores a insertar en el archivo usuario
        String nombre, usuario, contrasenia, tipo_usuario, identificacion, apellidos, fecha_de_nacimiento, genero, celular, contrasenia_encriptada;
        //------------------------------------------------------------------------------------------------

        //---------------------------Pide por consola los datos y usa el objeto Scanner para guardar los datos
        //--------------------------ingresados en las las variables declaradas en la linea 54
        System.out.println("Por favor ingrese los datos solicitados para crear un nuevo usuario:");

        System.out.println("Nombre: ");
        nombre = l.next();

        System.out.println("Usuario: ");
        usuario = l.next();

        System.out.println("Contrasenia: ");
        contrasenia = l.next();

        //contrasenia_encriptada =DigestUtils.md5Hex(contrasenia);
        System.out.println("Tipo_usuario: ");
        tipo_usuario = l.next();

        System.out.println("Cedula o pasaporte: ");
        identificacion = l.next();

        System.out.println("apellidos: ");
        apellidos = l.next();

        System.out.println("fecha de nacimiento: ");
        fecha_de_nacimiento = l.next();
        
        System.out.println("genero: ");
        genero = l.next();
        
        System.out.println("celular: ");
        celular = l.next();

        //------------------------------------------------------------------------------------------------
        //------------------------Valido si el usuario y contraseña ya estan siendo utilizados por otro usuario
        //------------------------usando el metodo Buscar_usuario
        //------------------------Si existe, no registrara el usuario. 
        //------------------------Si no, registra el usuario
        if (Buscar_usuario(usuario, contrasenia, lista) == true) {
            System.out.println("Usuario ya existe");

        } else {
            //-----------------------Para registrar un usuario realiza el siguiente proceso:

            //----------------------1.- creo un objeto de tipo usuario y le agrego los valores agregados en las variables de la linea 63
            Usuarios obj = new Usuarios(nombre, usuario, contrasenia, tipo_usuario, identificacion, apellidos, fecha_de_nacimiento, genero,celular);
            //---------------------------------------------------------------------------------------------------------------------------

            //-----------------------2.- Creo una variable tipo String y concateno los valores agregados en el objeto
            String cadena = obj.getNombres() + ";"
                    + obj.getUsuario() + ";"
                    + obj.getContrasenia() + ";"
                    + obj.getTipo_usuario() + ";"
                    + obj.getIdentificacion()+";"
                    +obj.getApellidos()+";"
                    +obj.getFecha_de_nacimiento()+";"
                    +obj.getGenero()+";"
                    + obj.getCelular()+ "\n";
            //------------------------------------------------------------------------------------------------------------

            //------------------------------------3.- utilizo el metodo crearArchivo de la clase Archivo para registrar el nuevo usuario:
            //------------------------------------El primer parametro es el nombre del archivo
            //------------------------------------El segundo parametro es la cadena que creamos en la linea 100
            //------------------------------------El tercer parametro es tipo true para sobrescribir en el archivo(si es false borrara los registros agregados anteriormente)
            Archivo.crearArchivo("directorio/Archivo_usuarios.csv", cadena, true);
            //------------------------------------------------------------------------------------------------------------------------------------------------------------

        }
        //---------------------------------------------------------------------------------------------------

    }

    public void eliminar() {

        Scanner l = new Scanner(System.in);
        String usuario;
        System.out.print("Ingrese nombre de usuario a eliminar:");
        usuario = l.next();
        int pos = getPosUsuario(usuario, lista);
        if (pos == -1) {
            System.out.println("Archivo Eliminado exisotsamente");
        } else {

            lista.remove(pos);

            String cadena = "";
            for (int i = 0; i < lista.size(); i++) {
                cadena = cadena
                        + lista.get(i).getNombres() + ";"
                        + lista.get(i).getUsuario() + ";"
                        + lista.get(i).getContrasenia() + "\n";
            }

            System.out.println("Usuario Eliminado Exitosamente");

            Archivo.crearArchivo("Archivos_usuarios.csv", cadena, false);

        }

    }

}
