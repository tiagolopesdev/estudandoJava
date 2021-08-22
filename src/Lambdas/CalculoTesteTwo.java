/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lambdas;

/**
 *
 * @author tiago
 */
public class CalculoTesteTwo {

    public static void main(String[] args) {

        Calculo cal = (x, y) -> {
            return x + y;
        };
        System.out.println(cal.executar(2, 5));

        cal = (x, y) -> x * y;
        System.out.println(cal.executar(2, 5));
    }
}
