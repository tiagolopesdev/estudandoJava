/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lambdas;

import java.util.function.Function;
import java.util.function.Predicate;

/**
 *
 * @author tiago
 */
public class PredicadoComposicao {
    int a;
    public static void main(String[] args) {
        Predicate<Double> isPar = num -> num % 2 == 0;
        Predicate<Double> intervalo = num -> num >= 18 && num <=30;
        
        Function<Double, String> resultado = 
                valor -> valor % 2 == 0 ? "Valido" : "Invalido";
        
        System.out.println(isPar.or(intervalo).test(17.0));
    }
}
