/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package imad.filesej_imad;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import javax.xml.bind.JAXBException;

/**
 *
 * @author MSI
 */
public class Prueba {

    public static void main(String[] args) throws IOException, JAXBException {
        ArrayList<App> listaApps = new ArrayList<>();
        for (int i = 0; i < 50; i++) {
            listaApps.add(App.generarObjetoAleatorio());

        }
        for (App listaApp : listaApps) {
            System.out.println(listaApp);
        }

        //CREACION DIRECTORIOS SOLICITADOS
        crearDirectorio("appstsv");
        crearDirectorio("appsjson");
        crearDirectorio("appsxml");

        crearDirectorio("aplicaciones");

        crearDirectorio("copias");

        ServicioFicheroTSV ficheroTSV1 = new ServicioFicheroTSV();
        ficheroTSV1.generarFichero(listaApps, "./appstsv/ficheroTSV.tsv");

        ServicioFicheroJSON ficheroJSON1 = new ServicioFicheroJSON();
        ficheroJSON1.generarFichero(listaApps, "./appsjson/ficheroJSON.JSON");

        XmlCatalogoApp catalogo = new XmlCatalogoApp();
        catalogo.setLista(listaApps);
        catalogo.setDescripcion("Mi catalogo");

        ServicioFicheroXML ficheroXML1 = new ServicioFicheroXML();
        ficheroXML1.generarFichero(listaApps, "./appsxml/ficheroXML.xml");

        for (int i = 0; i < listaApps.size(); i++) {

            ServicioFicheroJSON.generarFichero(
                    listaApps.get(i), "./aplicaciones/" + listaApps.get(i).getNombre() + ".json");
        }

    }

    private static void crearDirectorio(String ruta) {

        Path directory = Paths.get(ruta);
        try {
            Files.createDirectory(directory);
        } catch (IOException e) {
            System.out.println(e.toString());
        }
    }
}
