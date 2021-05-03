/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package imad.filesej_imad;

import java.io.FileNotFoundException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.xml.bind.JAXBException;

/**
 *
 * @author MSI
 */
public class PruebaEj12 {
    public static void main(String[] args) throws JAXBException{
        
        //TRY CATCH GENERADO POR eL eNTorno
        try {
            ServicioFicheroXML.leerFicheroXML("./appsxml/ficheroXML.xml");
        } catch (FileNotFoundException ex) {
            Logger.getLogger(PruebaEj12.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
    }
}
