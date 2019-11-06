
package com.prestamo_escenarios.archivos;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;


public class Archivo {
    
    
    //----------------------Este metodo me permite agregar un registro al archivo----------------------------------
     public static void crearArchivo(String nombre_archivo, 
            String contenido, boolean tipo) {
        // tipo si es "false" se sobre escribe si es "true" añade registro-
        try {
            File archivo = new File(nombre_archivo);//Crea Archivo vacio
            FileWriter escribir = new FileWriter(archivo, tipo); //crea objeto de escritura
            escribir.write(contenido);// escribe contenido en el Archivo
            escribir.close();// cierra Archivo
        } catch (IOException e) {
                System.out.println(e);
        }
}
     //------------------------------------------------------------------------------------------------------------

}
