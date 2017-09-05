/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Exercicio2;

import java.util.Random;
import java.util.Vector;
import javax.swing.JOptionPane;

/**
 *
 * @author edy
 */
public class JogoDoGalo {
    public static void main(String[] args) {
        
      
        Vector<Integer> numeros = new Vector<>(Integer.parseInt(JOptionPane.showInputDialog("Introduza a quantidade do vector")));
        for(int i = 0; i<numeros.capacity(); i++){
           int elementos = Integer.parseInt(JOptionPane.showInputDialog("Introduza o elemento"));
            numeros.add(elementos);
        }
        
        Random r = new Random();
        int indice = r.nextInt(numeros.size());
        boolean acerto;
        int numero;
        int erros = 0;
        
            do{
            numero = Integer.parseInt(JOptionPane.showInputDialog("Introduza o numero \n" + numeros.toString()));
            if(numero == numeros.get(indice)){
                JOptionPane.showMessageDialog(null, "Acertou \n" + "Numero de erros: " + erros);
            }else{
                erros = erros + 1;
                JOptionPane.showMessageDialog(null, "Errou \n" + " Numero de erros: " + erros);
            }
        }while(numero!= numeros.get(indice));
        
    }
    
    
}
