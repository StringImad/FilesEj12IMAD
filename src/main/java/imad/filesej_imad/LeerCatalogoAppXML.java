/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package imad.filesej_imad;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;

/**
 *
 * @author MSI
 */
public class LeerCatalogoAppXML {

    public static void leerFicheroCXML(String nombre) throws JAXBException,
            FileNotFoundException {

        // Crea el contexto JAXB 
        JAXBContext contexto = JAXBContext.newInstance(XmlCatalogoApp.class);
        // Crea el objeto Unmarshaller
        Unmarshaller um = contexto.createUnmarshaller();

        // Llama al método de unmarshalling
        XmlCatalogoApp catalogo = (XmlCatalogoApp) um.unmarshal(new File("catalogo.xml"));

        ArrayList<App> listaApps = catalogo.getListaApp();

        listaApps.forEach(System.out::println);
    }
}
