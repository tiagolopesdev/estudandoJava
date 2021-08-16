/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package streams;

import java.util.function.Function;
import java.util.function.UnaryOperator;

/**
 *
 * @author tiago
 */
public class Utilitarios {

    public final static UnaryOperator<String> maiusculo = n 
            -> n.toUpperCase();
    public final static UnaryOperator<String> primeiraLetra = n 
            -> n.charAt(0) + "";
    public final static UnaryOperator<String> pontuacao = n 
            -> n + "!!! ";
    
    public final static Function<Integer, String> verificaIdade = i 
                -> i >= 18 ? i+" é maior de idade" 
                        : i+" é menor de idade";  
    
    public final static UnaryOperator<String> separacao = s 
            -> s + "\n"; 
    
}
