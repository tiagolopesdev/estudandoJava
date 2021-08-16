/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package streams;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.UnaryOperator;

/**
 *
 * @author tiago
 */
public class Match {

    public static void main(String[] args) {

        Aluno a1 = new Aluno("Bia", 10.8);
        Aluno a2 = new Aluno("Ana", 6.0);
        Aluno a3 = new Aluno("Geovana", 8.5);
        Aluno a4 = new Aluno("Lua", 8.3);
        Aluno a5 = new Aluno("Gui", 6.8);
        Aluno a6 = new Aluno("Gabi", 8.8);

        List<Aluno> alunos = Arrays.asList(a1, a2, a3, a4, a5, a6);

        Predicate<Aluno> aprovados = a -> a.nota >= 7;
        Predicate<Aluno> reprovados = aprovados.negate();

        System.out.println("\nVerifica as notas USANDO MATCH");
        System.out.println(alunos.stream().allMatch(aprovados));
        System.out.println(alunos.stream().anyMatch(aprovados));
        System.out.println(alunos.stream().noneMatch(reprovados));

        //Usando  min e max
        System.out.println("\nUSANDO MIN e MAX");

        Comparator<Aluno> melhornota = (aluno1, aluno2) -> {
            if (aluno1.nota > aluno2.nota) {
                return 1;
            }
            if (aluno1.nota < aluno2.nota) {
                return -1;
            }
            return 0;
        };

        System.out.println(alunos.stream().max(melhornota).get());
        System.out.println(alunos.stream().min(melhornota).get());

        Predicate<Aluno> totalAluno = a -> a.nome != "";
        Function<Aluno, String> nomes = a -> "\n"+a.nome;
        
        alunos.stream()
                .filter(totalAluno)
                .map(nomes)
                .forEach(System.out::println);
    }
}
