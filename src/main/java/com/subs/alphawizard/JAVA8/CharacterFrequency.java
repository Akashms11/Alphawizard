package com.subs.alphawizard.JAVA8;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class CharacterFrequency {

    public static void main(String[] args) {
        String input = "Hello World";
        Map<Character, Long> frequencyMap1= input.chars().mapToObj(c->(char)c).collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
        frequencyMap1.forEach((character, count) -> System.out.println(character + " -> " + count));
        // Remove spaces and convert the string to lowercase (if needed)
        input = input.replaceAll(" ", "").toLowerCase();

        // Use Java 8 streams to count character frequency
        Map<Character, Long> frequencyMap = input.chars()
                .mapToObj(c -> (char) c)
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

        // Print the character frequency map
        frequencyMap.forEach((character, count) -> System.out.println(character + " -> " + count));
    }
}
