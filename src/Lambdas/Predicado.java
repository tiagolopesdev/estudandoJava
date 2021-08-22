/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lambdas;
import java.util.function.Predicate;
/**
 *
 * @author tiago
 */
public class Predicado {

    public static void main(String[] args) {
        Predicate<Produto> isCaro = 
                prod -> prod.preco * 
                        (1 - prod.desconto) >= 750;
        
        Produto produto = new Produto("Notebook", 3893.89, 0.15);
    }
}
