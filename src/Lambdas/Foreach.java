/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lambdas;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 *
 * @author tiago
 */
public class Foreach {

    public static void main(String[] args) {
        List<String> aprovados = Arrays.
                asList("Ana", "Tiago", "Geovana", "Gabriela");

        System.out.println("Forma tradicional...");
        for (String nome : aprovados) {
            System.out.println(nome);
        }

        System.out.println("\nLambdas #01");
        aprovados.forEach((nome) -> {
            System.out.println(nome);
        });

        System.out.println("\nMethod Reference #01");
        aprovados.forEach(System.out::println);

        System.out.println("\nLambdas #02");
        aprovados.forEach(nome -> meuImprimir(nome));

        System.out.println("\nMethod Reference #02");
        aprovados.forEach(Foreach::meuImprimir);
    }

    static void meuImprimir(String nome) {
        System.out.println("Hi, my name is " + nome);
    }
}
