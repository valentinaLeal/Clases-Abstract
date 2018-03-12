/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package abstracta;

/**
 *
 * @author Estudiantes
 */
public class Abstracta {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Perro miPerro= new Perro ();
        System.out.println(miPerro.emitirsonido());
        
        
        Gato miGato=new Gato();
        System.out.println(miGato.emitirsonido());
        
        
        System.out.println(miGato.emitirsonido("rabia"));
    }
    
}
