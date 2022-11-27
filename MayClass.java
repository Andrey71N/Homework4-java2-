package lesson4;

import java.util.*;

public class MayClass {
    public static void main(String[] args){
        List<String> words = Arrays.asList(
                "LADA", "HOVER", "MOSKVICH", "VOLGA", "Vokswagen",
                "Opel", "VOLGA", "Range Rover", "Toyota", "Vokswagen",
                "BMW", "Audi", "VOLGA", "MOSKVICH", "Subaru",
                "Audi", "Toyota", "Subaru", "Subaru", "Toyota"
        );

        Set<String> unique = new HashSet<String>(words);

        System.out.println("Первоначальный массив");
        System.out.println(words.toString());
        System.out.println("Уникальные слова");
        System.out.println(unique.toString());
        System.out.println("Частота встречаемости слов");
        for (String key : unique) {
            System.out.println(key + ": " + Collections.frequency(words, key));
        }
    }
}
