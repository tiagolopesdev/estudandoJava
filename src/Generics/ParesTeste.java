/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Generics;

/**
 *
 * @author tiago
 */
public class ParesTeste {
    public static void main(String[] args) {
        Pares<Integer, String> resultConcurso = new Pares<>();
        
        resultConcurso.adicionar(1, "Maria");
        resultConcurso.adicionar(2, "Gui");
        resultConcurso.adicionar(3, "Lua");
        resultConcurso.adicionar(3, "Gabi");
        resultConcurso.adicionar(4, "Jô");
        resultConcurso.adicionar(5, "Ana");
        
        System.out.println(resultConcurso.getValor(1));
        System.out.println(resultConcurso.getValor(5));
        System.out.println(resultConcurso.getValor(3));
    }
}
