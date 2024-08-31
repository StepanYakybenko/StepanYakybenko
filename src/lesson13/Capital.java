package lesson13;

import java.util.*;

public class Capital {
    public static void main(String[] args) {
        List<String> capital = Arrays.asList("Minsk", "Moskow", "Vilnius", "Riga", "Warsaw", "Kiev",
                "Tbilisi", "Istanbul", "Yerevan", "Moskow", "Minsk", "Rome", "Bucharest", "Sophia");
        System.out.println("Перечень городов:");
        capital.forEach(System.out::println);
        System.out.println("\nСтолицы:");
        Map<String, Integer> wordsCount = new HashMap<>();
        for (String s : capital) {
            wordsCount.put(s, wordsCount.getOrDefault(s, 0) + 1);
        }
        wordsCount.entrySet().forEach(System.out::println);
        System.out.println("\nБез повторов: ");
        Set<String> unique = new HashSet<>(capital);
        unique.forEach(System.out::println);
    }
}

