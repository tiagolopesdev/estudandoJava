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
import java.util.function.UnaryOperator;

/**
 *
 * @author tiago
 */
public class DesafioMap {
    public static void main(String[] args) {
        /*
        1. numero para string binaria ok 
        2. inverter a string (de trás para frente) ok
        3. COnverter de volta para inteiro;
        */
        
        //Consumer<Integer> printInteiro = System.out::println;
        
        List<Integer> nums = Arrays.asList(1, 2, 3, 4, 5, 6, 7);
        
        UnaryOperator<String> inverter = 
                n -> new StringBuilder(n).reverse().toString();
        Function<String, Integer> binaryForInt = 
                n -> Integer.parseInt(n, 2);
        
        nums.stream()
                .map(Integer::toBinaryString)
                .map(inverter)
                .map(binaryForInt)
                .forEach(System.out::println);
    };
}
