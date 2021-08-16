/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.UnaryOperator;
import java.util.stream.Stream;

/**
 *
 * @author tiago
 */
public class Map {

    public static void main(String[] args) {
        Consumer<String> printMarca = System.out::print;

        List<String> marcas = Arrays.asList("BMW ", "Audi ", "Honda ");
        marcas.stream().map(m -> m.toUpperCase()).forEach(printMarca);

        //UnaryOperator<String> maiusculo = n -> n.toUpperCase();
        //UnaryOperator<String> primeiraLetra = n -> n.charAt(0) + " ";
        //UnaryOperator<String> pontuacao = n -> n + "!!!";

        System.out.println("\n\nUsando composicao");
        
        marcas.stream().map(Utilitarios.maiusculo)
                .map(Utilitarios.primeiraLetra)
                .map(Utilitarios.pontuacao)
                .forEach(printMarca);
        
        
        //      **  Verificar idade  **
        
        
        Consumer<Integer> printIdade = System.out::print;
        
        List<Integer> idade = Arrays.asList(18 , 16 , 22);
        
//        Function<Integer, String> verificaIdade = i 
//                -> i >=18 ? "Maior de idade" : "Menor de idade";
//                
//        UnaryOperator<String> separacao = s -> s + " - "; 
                
        System.out.println("\n");
        
        idade.stream().map(Utilitarios.verificaIdade)
                .map(Utilitarios.separacao)
                .forEach(printMarca);
    }
}
