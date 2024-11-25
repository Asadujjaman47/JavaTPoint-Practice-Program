package array_programs.p47.count_occurance;


import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

// Java Program to Count the Occurrences of Each Character
// Using Java 8 (Java Pattern class)
public class CountOccuranceOfChar5 {

    public static void main(String[] args) {
        String str = "Monopoly";
        Pattern.compile(".").matcher(str).results().map(m ->
                m.group().toLowerCase()).collect(Collectors.groupingBy(s ->
                    s, LinkedHashMap::new, Collectors.counting())).forEach((k, v) ->
                System.out.println(k + " = " + v + " times"));
    }
}
