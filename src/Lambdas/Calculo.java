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
@FunctionalInterface
public interface Calculo {

    double executar(double a, double b);
    
    default String legal(){
        return "Legal!!";
    }
    static String muitoLegal(){
        return "Muito legal!!";
    }
}
