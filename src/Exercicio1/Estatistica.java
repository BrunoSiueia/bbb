/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Exercicio1;
import java.util.*;
import javax.swing.JOptionPane;
import org.omg.CORBA.Object;
/**
 *
 * @author bruno
 */
public class Estatistica {
    
   static  Vector <Integer> vector ;
   
        public static void introduzir(){
            vector = new Vector<>(Integer.parseInt(JOptionPane.showInputDialog("intoduza a capacidade do vecttor")));
    // Vector <Integer> vector = new Vector(Integer.parseInt(JOptionPane.showInputDialog("intoduza a capacidade do vecttor")));
     
       for(int i=0;i< vector.capacity(); i++){
           int dados=Integer.parseInt(JOptionPane.showInputDialog("intoduza o "+i+"o numero"));
       vector.addElement(dados);
       }
       
  }
        
  public static void moda(){
   
       int moda1=0;
       int repeticao=0;
        for(int i=0;i< vector.capacity(); i++){
           int  numrepeticoes=0;
           for(int j=0;j<vector.capacity();j++){
               if(vector.elementAt(i)==vector.elementAt(j)){
                numrepeticoes++;   
               }
               if(numrepeticoes > repeticao){
                   moda1=vector.elementAt(i);
                   repeticao=numrepeticoes;
               }
           }
          
        }
        
            JOptionPane.showMessageDialog(null, "A moda e: "+moda1+"\n Numero de repeticoes: "
                    +repeticao+"\nCapacidade do vector: "
                    +vector.capacity()+"\nElementos do vector: "+vector);    
         
       }

  
   public static void mediana(){

       
      double mediana,ned2;
       // for(int i=0;i< vector.capacity(); i++){
             Collections.sort(vector);
            if(vector.capacity() % 2 ==1){
               mediana=(vector.capacity()+1)/2;
                JOptionPane.showMessageDialog(null,"Capacidade do vector: "+vector.capacity()+"\nElementos do vector: "+vector+"\nA mediana e: "+mediana);    
            } else if(vector.capacity() % 2 ==0){
                mediana=(vector.capacity()+1)/2;
                 ned2=((vector.capacity()+1)/2)+1;
                 JOptionPane.showMessageDialog(null,"Capacidade do vector: "+vector.capacity()+"\nElementos do vector: "+vector+"\nA mediana e: "+mediana+" , "+ ned2);    
        }
           
        
   }
  

    public static void media(){
      
          int soma = 0;
     
        for(int i=0;i< vector.capacity(); i++){  
     soma =soma+vector.elementAt(i);
        }
        
       double media=soma/vector.capacity();
          JOptionPane.showMessageDialog(null,"Capacidade do vector: "+vector.capacity()+
                  "\nElementos do vector: "+vector+"\nA media e: "+media+"\n a soma e: "+soma);
     
    }
   
    
     public static void main(String[] args) {
         boolean continua=true;
         while(continua==true){
             
         
      int opcao=Integer.parseInt(JOptionPane.showInputDialog("  [1]-Preencher Vector\n [2]-Calcular moda\n[3]-calcularmediana"
              + "\n[4]-Calcular media\n[5]-Sair\nescolha uma opcao"));
      
      switch(opcao){
          
          case 1: introduzir(); break;
          case 2: moda(); break;
          case 3:mediana() ; break;
          case 4:media(); break;
          case 5: System.exit(0); break;
          default: JOptionPane.showMessageDialog(null,"Escolha uma opcao");
              
      }
      
        
    }
     }
    
}
