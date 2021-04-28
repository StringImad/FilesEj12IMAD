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

/**
 *
 * @author MSI
 */
public class ServicioFicheroJSON {

    public void generarFichero(ArrayList<App> apli, String ruta) throws IOException {
        ObjectMapper mapeador = new ObjectMapper();

        mapeador.configure(SerializationFeature.INDENT_OUTPUT, true);

        mapeador.writeValue(new File(ruta), apli);

        System.out.println("El fichero " + ruta + " se ha creado correctamente");
    }
}
