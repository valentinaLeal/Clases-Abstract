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
public class Gato extends Animal{

    @Override
    String emitirsonido() {
       return "MIAUUU";   
    }
    
    String emitirsonido(String rabia) {
        
       return "GRRR MIAUU";   
    }
}
