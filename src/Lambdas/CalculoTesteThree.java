/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lambdas;

import java.util.function.BinaryOperator;

/**
 *
 * @author tiago
 */
public class CalculoTesteThree {

    public static void main(String[] args) {

        BinaryOperator<Double> cal = (x, y) -> {
            return x + y;
        };
        System.out.println("BinaryOperator"
                + "\nCOMPLETO => "+cal.apply(2.0, 5.0));

        cal = (x, y) -> x * y;
        System.out.println("Lambdas"
                + "\nSIMPLES => "+cal.apply(2.0, 5.0));
        
        BinaryOperator<Integer> calc2 = (x, y) -> x * y;
        System.out.println("BinaryOperator"
                + "\nSIMPLES => "+cal.apply(2.0, 5.0));
        
        
    }
}
