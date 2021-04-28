/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package imad.filesej_imad;

import java.util.ArrayList;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author MSI
 */
@XmlRootElement(namespace = "ejemploJAXB")


public class XmlCatalogoApp {
        // XmLElementWrapper define un contenedor para la lista 
    // de muebles
    @XmlElementWrapper(name = "catalogo")

    // XmlElement establece el nombre de los elementos
    // Cada elemento de la lista llevará esta etiqueta en el fichero xml
    @XmlElement(name = "mueble")
    private ArrayList<App> listaAppCreada;

    private String descripcion;

    public ArrayList<App> getListaApp() {
        return listaAppCreada;
    }

    public void setLista(ArrayList<App> lista) {
        this.listaAppCreada = lista;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

}
