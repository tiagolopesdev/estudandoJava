/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.BinaryOperator;
import java.util.function.Function;

/**
 *
 * @author tiago
 */
public class ReduceOne {

    public static void main(String[] args) {
        List<Integer> nums = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);

        BinaryOperator<Integer> soma = (ac, n) -> ac + n;

        Integer total = nums.stream().reduce(soma).get();
        System.out.println(total);

        nums.stream()
                .filter(a -> a % 2 == 0)
                .reduce(soma)
                .ifPresent(System.out::println);
    }
}
