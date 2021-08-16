/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package streams;

import java.util.Arrays;
import java.util.List;

/**
 *
 * @author tiago
 */
public class Filter {
    public static void main(String[] args) {
        Aluno a1 = new Aluno("Tiago", 7.8);
        Aluno a2 = new Aluno("Geovana", 8.9);
        Aluno a3 = new Aluno("Ana", 6.9);
        Aluno a4 = new Aluno("Bia", 9.4);
        Aluno a5 = new Aluno("Lucas", 7.5);
        Aluno a6 = new Aluno("Gabi", 10.0);
        
        List<Aluno> alunos = Arrays.asList(a1, a2, a3, a4, a5, a6);
        
        alunos.stream()
                .filter(a -> a.nota >= 7.0)
                .map(a -> "Parabéns, "+a.nome+" aprovado(a)!"
                        + "\n Sua nota => "+a.nota)
                .forEach(System.out::println);
    }
}
