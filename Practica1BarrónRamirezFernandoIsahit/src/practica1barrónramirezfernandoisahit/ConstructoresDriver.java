/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica1barrónramirezfernandoisahit;

import java.awt.BorderLayout;

/**
 *
 * @author Alumno
 */
public class ConstructoresDriver {
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Constructores cons1 = new Constructores();
        Constructores cons2 = new Constructores("Nike","Air Force 1","1700","2007","7mx");
        System.out.println(cons1.toString());
        System.out.println(cons2.toString());
    }
    
}
