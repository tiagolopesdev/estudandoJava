package streams;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Stream;

public class imprimindoObjetos {
    public static void main(String[] args) {
        
        List<String> aprovados = Arrays.asList("Lucas", "Bia", 
                "Dudu", "Gabi", "Ana");
        
        System.out.println("Usando o foreach...");
        for (String aprovado : aprovados) {
            System.out.println(aprovado);
        }
        
        System.out.println("\nUsando Iterator...");
        Iterator<String> iterator = aprovados.iterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }
        
        System.out.println("\nUsando Stream");
        Stream<String> stream = aprovados.stream();
        stream.forEach(System.out::println);

        
    }
}
