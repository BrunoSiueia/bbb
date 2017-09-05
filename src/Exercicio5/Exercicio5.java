/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Exercicio5;

import java.util.Arrays;
import java.util.Stack;
import java.util.Vector;
import javax.swing.JOptionPane;


public class Exercicio5 {
    /**
     * a variavel valor serve pra quebrar o ciclo que se encontra dentro do
     * metodo adicionar
     */
    int valor;
    /**
     * Esta vector serve para guardar todos elementos adicionados
     *
     * @since
     */
    private static Vector<Integer> inteiros = new Vector<>();
    Vector<Integer> auxivector = new Vector<>();

    /**
     * Este metodo serve para adicionar elementos no vector, retorna true caso o
     * metodos seja executado com perfeicao e false caso aja um erro
     *
     * @return boolean true or false
     */
    public boolean Adicionar() {
        do {
            this.inteiros.add(Integer.parseInt(JOptionPane.showInputDialog("Escreva o valor")));
            valor = JOptionPane.showConfirmDialog(null, "Deseja terminar?");
        } while (!(valor == 0));
        return true;
    }

    public Vector<Integer> AntesDaOrdenacao() {
        return inteiros;
    }

    /**
     * este metodo serve para ordenar os elementos do vector princimpal e
     * retorna um vector de elementos ordenados
     *
     * @return vector<Integer>
     */
    public Vector<Integer> Ordenar() {
        int au;
        this.auxivector.addAll(inteiros);
        for (int i = 0; i < this.auxivector.size(); i++) {
            for (int j = i + 1; j < this.auxivector.size(); j++) {
                if (auxivector.get(i) > auxivector.get(j)) {
                    au = auxivector.get(i);
                    auxivector.set(i, auxivector.elementAt(j));
                    auxivector.set(j, au);
                }
            }
        }
        return auxivector;
    }

    public boolean Remover() {
        Ordenar().clear();
        Stack<Integer> stack = new Stack();
        stack.addAll(Ordenar());
        for (int r : this.Ordenar()) {
            System.out.println(stack.pop());
        }
        return true;
    }

    public static void main(String[] args) {
        try{
        Exercicio5 exercicio5 = new Exercicio5();
        exercicio5.Adicionar();
        System.out.println("Antes da Ordenacao \n" + exercicio5.AntesDaOrdenacao());
        System.out.println("Elementos Ordenados \n" + exercicio5.Ordenar());
        exercicio5.Remover();
    }catch(Exception erro){
        
    }
    }
    
}
