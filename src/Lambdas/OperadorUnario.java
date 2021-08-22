/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lambdas;

import java.util.function.UnaryOperator;

/**
 *
 * @author tiago
 */
public class OperadorUnario {

    public static void main(String[] args) {
        
        UnaryOperator<Integer> soma = n -> n+2;
        UnaryOperator<Integer> multiplica = n -> n*2;
        UnaryOperator<Integer> quadrado = n -> n*n;
        
        System.out.println(soma
                .andThen(multiplica)
                .andThen(quadrado)
                .apply(0));
        System.out.println(quadrado
                .compose(multiplica)
                .compose(soma)
                .apply(0));
    }
}
