/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lambdas;

import java.util.function.BiFunction;
import java.util.function.BinaryOperator;
import java.util.function.Function;

/**
 *
 * @author tiago
 */
public class OperadorBinario {

    public static void main(String[] args) {
        
        BinaryOperator<Double> media = (n1, n2) -> (n1 + n2) / 2;
        System.out.println(media.apply(9.8, 5.7));
        
        BiFunction<Double, Double, String> result = (n1, n2) ->
                (n1 + n2) / 2 >= 7 ? "Aprovado" : "Reprovado";
        //System.out.println(result.apply(9.8, 5.7));
        
        Function<Double, String> conceito = 
                m -> m >= 7 ? "Aprovado" : "Reprovado"; 
        
        System.out.println(media.andThen(conceito).apply(9.7, 5.7));
    }
}
