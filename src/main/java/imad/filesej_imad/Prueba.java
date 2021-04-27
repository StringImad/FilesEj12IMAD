/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package imad.filesej_imad;

import java.util.ArrayList;

/**
 *
 * @author MSI
 */
public class Prueba {

    public static void main(String[] args) {
        ArrayList <App> listaApps = new ArrayList<>();
        for (int i = 0; i < 50; i++) {
            listaApps.add(new App());

        }
        for (App listaApp : listaApps) {
            System.out.println(listaApp);
        }
    }
}
