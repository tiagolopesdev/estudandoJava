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
public class CaixaIntTeste {
    
    public static void main(String[] args) {
        
        CaixaInt ci = new CaixaInt();
        ci.guardar(123);
        
        System.out.println(ci.abrir());
       
    }
}
