/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Exercicio4;

import java.util.Vector;
import javax.swing.JOptionPane;

/**
 *
 * @author Caetano Sabino
 */
public class CompVectr {
    public static void main(String[] args) {
        
    
   Vector<Boolean> vect1= new Vector(Integer.parseInt(JOptionPane.showInputDialog("introduz o tamanho")));
   Vector<Boolean> vect2= new Vector(Integer.parseInt(JOptionPane.showInputDialog("introduz o tamanho")));
   
   for (int i= 0; i< vect1.capacity(); i++){
   boolean grav= Boolean.parseBoolean(JOptionPane.showInputDialog("introduz o elemento " +i+ " do vector 1 "));
   vect1.addElement(grav);
   }
   
   for (int j= 0; j< vect1.capacity(); j++){
   boolean grav2= Boolean.parseBoolean(JOptionPane.showInputDialog("introduz o elemento " +j+ " do vector 2 "));
   vect2.addElement(grav2);
   }
   
   
   for (int i= 0; i< vect1.capacity(); i++){
    for (int j= 0; j< vect2.capacity(); j++){
   if(vect1.capacity() == vect2.capacity() && vect1.elementAt(i)== vect2.elementAt(j)){
       System.err.println("sao Identicos");
   } 
   else{
       System.err.println("nao sao Identicos");
   }
}
}
    }  
}
