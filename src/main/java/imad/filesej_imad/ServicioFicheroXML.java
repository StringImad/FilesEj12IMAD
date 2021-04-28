/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package imad.filesej_imad;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;

/**
 *
 * @author MSI
 */
public class ServicioFicheroXML {

    public void generarFichero(ArrayList<App> apli, String ruta)throws JAXBException {
        // ArrayList<App> listaApps = new ArrayList<App>();
   //    ArrayList<App> listaApp = generarListaApps();
       XmlCatalogoApp catalogo = new XmlCatalogoApp();
       catalogo.setLista(apli);
       
       // Crea el contexto JAXB. Se encarga de definir los objetos 
        // que vamos a guardar. En nuestro caso sólo el tipo CatalogoMuebles
        JAXBContext contexto = JAXBContext.newInstance(XmlCatalogoApp.class);
        
        // El contexto JAXB permite crear un objeto Marshaller, que sirve para
        // generar la estructura del fichero XML 
        // El proceso de pasar objetos Java (CatalogoMuebles) a ficheros XML 
        // se conoce como "marshalling" o "serialización"
        Marshaller serializador = contexto.createMarshaller();
         // Especificamos que la propiedad del formato de salida
        // del serializador sea true, lo que implica que el formato se 
        // realiza con indentación y saltos de línea
        serializador.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
        // Llamando al método de serialización marshal (sobrecargado) se pueden
        // serializar objetos java en formato XML y volcarlos donde necesitemos:
        // consola, ficheros. El proceso consiste en que el contexto es el 
        // encargo de leer los objetos java, pasarlos al serializador y éste 
        // crear la salida de serialización
        
        // Serialización y salida por consola
        serializador.marshal(catalogo, System.out);
        
        serializador.marshal(catalogo, new File(ruta));

    }

//    // Genera una lista de numMuebles muebles
//    public static ArrayList<App> generarListaApps() {
//
//        ArrayList<App> listaTodaApp = new ArrayList<>();
//
//        for (int i = 10; i < 50; i++) {
//            listaTodaApp.add(new App());
//        }
//
//        return listaTodaApp;
//    }
}
