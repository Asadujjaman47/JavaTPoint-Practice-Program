package array_programs.p47.count_occurance;


import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.stream.Collector;
import java.util.stream.Collectors;

// Java Program to Count the Occurrences of Each Character
// Using Java 8
public class CountOccuranceOfChar4 {

    public static void main(String[] args) {
        String str = "Communication";
        Map<String, Long> result = Arrays.stream(str.split(""))
                .map(String::toLowerCase)
                .collect(Collectors.groupingBy(s -> s, LinkedHashMap::new, Collectors.counting()));
        System.out.println(result);

    }
}
