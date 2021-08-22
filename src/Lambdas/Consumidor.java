/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lambdas;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

/**
 *
 * @author tiago
 */
public class Consumidor {
    public static void main(String[] args) {
        Consumer<Produto> imprimirNome = p 
                -> System.out.println(p.getNome() +"!!!");
        
        Produto p1 = new Produto("Caneta", 12.34, 0.09);
        //imprimirNome.accept(p1);
        
        Produto p2 = new Produto("Notebook", 1999.99, 0.25);
        Produto p3 = new Produto("Caderno", 20.99, 0.50);
        Produto p4 = new Produto("Borracha", 2.99, 0.07);
        Produto p5 = new Produto("Lapis", 4.60, 0.10);
        
        List<Produto> produtos = Arrays.asList(p1, p2, p3, p4, p5);
        
        produtos.forEach(imprimirNome);
        produtos.forEach(p -> System.out.println(p.preco));
        produtos.forEach(System.out::println);
    }
}
