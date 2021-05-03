/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package imad.filesej_imad;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author MSI
 */
public class ServicioFicheroJSON {

    public static void generarFichero(App apli, String ruta) throws IOException {
        ObjectMapper mapeador = new ObjectMapper();

        mapeador.configure(SerializationFeature.INDENT_OUTPUT, true);

        try {

            mapeador.writeValue(new File(ruta), apli);
            System.out.println("El fichero " + ruta + " se ha creado correctamente");
        } catch (IOException ex) {
            System.out.println("No se ha creado el fichero");
        }
    }
    //HACE LO MMISMO QUE EL METODO DE ARRIBA PERO CON UN ARRAYLIST
    public static void generarFichero(ArrayList<App> apli, String ruta) throws IOException {
        ObjectMapper mapeador = new ObjectMapper();

        mapeador.configure(SerializationFeature.INDENT_OUTPUT, true);

        mapeador.writeValue(new File(ruta), apli);

        try {

            mapeador.writeValue(new File(ruta), apli);
            System.out.println("El fichero " + ruta + " se ha creado correctamente");
        } catch (IOException ex) {
            System.out.println("No se ha creado el fichero");
        }
    }
}
