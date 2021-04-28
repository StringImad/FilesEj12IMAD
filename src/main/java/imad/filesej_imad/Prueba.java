/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package imad.filesej_imad;

import java.io.IOException;
import java.util.ArrayList;
import javax.xml.bind.JAXBException;

/**
 *
 * @author MSI
 */
public class Prueba {

    public static void main(String[] args) throws IOException, JAXBException {
        ArrayList <App> listaApps = new ArrayList<>();
        for (int i = 0; i < 50; i++) {
            listaApps.add(new App());

        }
        for (App listaApp : listaApps) {
            System.out.println(listaApp);
        }
        ServicioFicheroTSV prueba = new ServicioFicheroTSV();
        prueba.generarFichero(listaApps, "ficheroTSV.tsv");
        
         ServicioFicheroJSON prueba2 = new ServicioFicheroJSON();
        prueba2.generarFichero(listaApps, "ficheroJSON.JSON");
        
             ServicioFicheroXML prueba3 = new ServicioFicheroXML();
        prueba3.generarFichero(listaApps, "ficheroXML.xml");
        
        
    }
}
