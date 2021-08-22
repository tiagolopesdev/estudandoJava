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
public class CaixaNumeoTeste {
    
    public static void main(String[] args) {
        
        CaixaNumero<Number> ca = new CaixaNumero<>();
        ca.guardar(2.3);
        System.out.println(ca.abrir());
        
        System.out.println(" -- --- -- ");
        
        CaixaNumero<Number> cb = new CaixaNumero<>();
        cb.guardar(142);
        System.out.println(cb.abrir());
    }
}
