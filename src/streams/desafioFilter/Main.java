/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package streams.desafioFilter;

import java.util.Arrays;
import java.util.List;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.UnaryOperator;
import java.util.stream.Stream;

/**
 *
 * @author tiago
 */
public class Main {

    public static void main(String[] args) {

        Contas c1 = new Contas("Cadeira Gamer", 10, 1200.00);
        Contas c2 = new Contas("Conserto cell", 3, 80.00);
        Contas c3 = new Contas("Alianças", 4, 250.00);
        Contas c4 = new Contas("Guitarra", 5, 650.00);

        List<Contas> contas = Arrays.asList(c1, c2, c3, c4);

        System.out.println("\nTotal de contas: " + contas.stream().count() + "\n");
        
        Predicate<Contas> filterValor = a 
                -> a.valor > 0;
        Function<Contas, Double> objectInDouble = a 
                -> a.valor;
        BinaryOperator<Double> reduceDouble = (a, b)
                -> a + b; 
        
        contas.stream()
                .filter(filterValor)
                .map(objectInDouble)
                .reduce(reduceDouble)
                .ifPresent(System.out::println);

        Function<Contas, String> frase = a
                -> "\n** Sua conta " + a.nomeConta + ""
                + "\n - Valor " + a.valor
                + "\n - Parcelas " + a.parcelas;

        contas.stream()
                .filter(a -> a.valor > 400)
                .map(frase)
                .forEach(System.out::println);

        Predicate<Contas> valorTotalContas = a
                -> a.valor > a.valor;

        contas.stream()
                .filter(a -> a.parcelas >= 5)
                .filter(a -> a.valor > 600)
                .map(a -> "Maior parcela => " + a.nomeConta)
                .forEach(System.out::println);
    }
}
