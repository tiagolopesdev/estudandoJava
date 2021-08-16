/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package streams;

import java.util.Arrays;
import java.util.function.Consumer;
import java.util.stream.Stream;

/**
 *
 * @author tiago
 */
public class CriandoStreams {

    public static void main(String[] args) {

        Consumer<String> print = System.out::print;

        Stream<String> langs = Stream.of("Java ", "Lua ", "JS\n");
        langs.forEach(print);
        
        String[] maisLangs = {"Python ","C# ","PHP ","JavaScript\n"};
        
        Stream.of(maisLangs).forEach(print);
        Arrays.stream(maisLangs, 0, 3).forEach(print);
    }
}
