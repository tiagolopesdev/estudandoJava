/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Generics;

import java.util.Arrays;
import java.util.List;

/**
 *
 * @author tiago
 */
public class ListUtilTeste {
    
    public static void main(String[] args) {
        
        List<String> world = Arrays.asList("Java", "Dart", "PHP", "C#");
        List<Integer> numbers = Arrays.asList(1, 12, 34, 12345);
        
        //Forma estatica de pegar o ultimo valor
        String getValue1 = (String)ListUtil.getUltimoStatic(world);
        System.out.println(getValue1);
        
        System.out.println(ListUtil.getUltimoStatic(numbers));
        
        System.out.println("\n");
        
        //Forma generica de pegar o ultimo valor
        String getValue2 = ListUtil.getUltimoGeneric(world);
        System.out.println(getValue2);
        System.out.println(ListUtil.getUltimoGeneric(numbers));
    }
}
