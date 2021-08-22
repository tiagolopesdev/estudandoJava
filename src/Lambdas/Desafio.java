/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lambdas;

import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.function.UnaryOperator;
import javax.swing.text.Position;

/**
 *
 * @author tiago
 */
public class Desafio {

    public static void main(String[] args) {

        Function<Produto, Double> precoFinal = 
                produto -> produto.preco * (1 - produto.desconto);
        UnaryOperator<Double> impostoMunicipal =
                preco -> preco >= 2500 ? preco * 1.085 : preco;
        UnaryOperator<Double> frete = 
                preco -> preco >= 3000 ? preco + 100 : preco + 50;
        UnaryOperator<Double> arredondar = 
                preco -> Double.parseDouble(String.format("%.2f", preco));
        Function<Double, String> formatar = 
                preco -> ("R$ "+preco).replace(".", ",");
        
        Produto p = new Produto("Acer", 2500, 0.13);
        
        String preco = precoFinal
                .andThen(impostoMunicipal)
                .andThen(frete)
                .andThen(arredondar)
                .andThen(formatar)
                .apply(p);
        System.out.println("O preço final é "+preco);

    }
}
