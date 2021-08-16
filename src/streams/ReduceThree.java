/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.BiFunction;
import java.util.function.BinaryOperator;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

/**
 *
 * @author tiago
 */
public class ReduceThree {

    public static void main(String[] args) {

        Consumer<String> print = System.out::println;

        Aluno a1 = new Aluno("Tiago", 7.4);
        Aluno a2 = new Aluno("Geovana", 9.8);
        Aluno a3 = new Aluno("Ana", 8.9);
        Aluno a4 = new Aluno("Luna", 5.5);
        Aluno a5 = new Aluno("Bia", 4.2);

        List<Aluno> alunos = Arrays.asList(a1, a2, a3, a4, a5);

        Predicate<Aluno> filter = a -> a.nota >= 7;

        Function<Aluno, Double> somenteNota = a -> a.nota;

        BiFunction<Media, Double, Media> calcularMedia
                = (media, nota) -> media.adicionar(nota);

        BinaryOperator<Media> combinarMedia = (m1, m2)
                -> Media.combinar(m1, m2);

        Media media = alunos.parallelStream()
                .filter(filter)
                .map(somenteNota)
                .reduce(new Media(), calcularMedia, combinarMedia);

        System.out.println("A média da turma é: " + media.getValor());
    }
}
