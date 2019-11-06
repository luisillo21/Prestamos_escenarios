/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prestamo_escenarios;

import com.prestamo_escenarios.archivos.Archivo_Usuarios;
import com.prestamo_escenarios.dominio.Usuarios;
import java.util.ArrayList;
import org.apache.commons.codec.digest.DigestUtils;

/**
 *
 * @author Usuario Final
 */
public class Prestamo_escenarios {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Archivo_Usuarios obj = new Archivo_Usuarios();
        obj.eliminar();
        
        
        ArrayList<Usuarios> lista = obj.leerUsuarios("directorio/Archivo_usuarios.csv");
//      Usurarios obj1= new Usuarios(nombres, usuario, contrasenia, tipo_usuario, identificacion, apellidos, fecha_de_nacimiento, genero, celular);
        System.out.println("LISTA DE USUARIOS EN EL SISTEMA: ");
        for (int i = 0; i < lista.size(); i++) {
            System.out.println("--------------------"+"No:"+lista.get(i).getIdentificacion()+"---------------------------");
            System.out.println("Nombre:" + lista.get(i).getNombres());
            System.out.println("Usuario:" + lista.get(i).getUsuario());
            System.out.println("Tipo usuario:" + lista.get(i).getTipo_usuario());
            System.out.println("Apellidos:" + lista.get(i).getApellidos());
            System.out.println("-----------------------------------------------");
        }
        
        
    }
    
}
