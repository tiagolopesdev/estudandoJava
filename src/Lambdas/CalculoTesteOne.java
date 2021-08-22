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
public class CalculoTesteOne {

    public static void main(String[] args) {
        
        Calculo cal = new Somar();
        System.out.println(cal.executar(4, 6));
        
        cal = new Multiplicar();
        System.out.println(cal.executar(4, 6));
    }
}
