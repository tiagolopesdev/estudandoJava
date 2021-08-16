/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.BinaryOperator;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

/**
 *
 * @author tiago
 */
public class ReduceTwo {

    public static void main(String[] args) {
        
        Consumer<String> print = System.out::println;
        
        Aluno a1 = new Aluno("Tiago", 7.4);
        Aluno a2 = new Aluno("Geovana", 9.8);
        Aluno a3 = new Aluno("Ana", 8.9);
        Aluno a4 = new Aluno("Luna", 5.5);
        Aluno a5 = new Aluno("Bia", 4.2);
        
        List<Aluno> aprovados = Arrays.asList(a1, a2, a3, a4, a5);
        
        Predicate<Aluno> filter = a -> a.nota >= 7;
        Function<Aluno, Double> notas = a -> a.nota;
        BinaryOperator<Double> addNote = (ac, result) -> ac + result;
        Function<Double, String> converteString = a -> "Total das notas: "+a;
        
               
        aprovados.stream()
                .filter(filter)
                .map(notas)
                .reduce(addNote)
                .map(converteString)
                .ifPresent(print);
     
        
    }
}
