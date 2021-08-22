/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lambdas;

import java.util.function.Function;

/**
 *
 * @author tiago
 */
public class Funcao {

    public static void main(String[] args) {
        Function<Integer, String> parOuImpar
                = numero -> numero % 2 == 0 ? "Par" : "Impar";

        System.out.println(parOuImpar.apply(3));
        
        Function<String, String> resultado = 
                valor -> "O resultado é "+valor;
        
        String resultadoFinal = parOuImpar.andThen(resultado).apply(10);
        
        System.out.println(resultadoFinal);
    }
}
