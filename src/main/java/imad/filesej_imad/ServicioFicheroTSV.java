/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package imad.filesej_imad;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**
 *
 * @author imad
 */
public class ServicioFicheroTSV {

    public static void generarFichero(ArrayList<App> apli, String ruta) {
        // ArrayList<App> listaApps = new ArrayList<App>();

        try {
            BufferedWriter flujo = new BufferedWriter(new FileWriter(ruta));

            flujo.write("codigo:nombre:descripcion:KB:fecha");
            flujo.newLine();

            for (App lib : apli) {

                flujo.write(lib.toString());

                flujo.newLine();

            }

            // Metodo fluh() guarda cambios en disco 
            flujo.flush();
            System.out.println("Fichero " + ruta + " creado correctamente.");

        } catch (IOException e) {
            System.out.println(e.getMessage());
        }

    }

}
