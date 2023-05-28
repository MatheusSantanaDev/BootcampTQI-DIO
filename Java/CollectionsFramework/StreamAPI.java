package CollectionsFramework;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;


public class StreamAPI {
    public static void main(String[] args) {
        List<String> randomNumbers = Arrays.asList("1", "0", "4", "1", "2", "3", "9", "9", "6", "5");

        System.out.println("\nPrint all elements from this list: ");
        randomNumbers.stream().forEach(s -> System.out.println(s));

        System.out.println("\nTake the first 5 numbers and put them inside a set:");
        randomNumbers.stream().limit(5).collect(Collectors.toSet()).forEach(System.out::println);

        System.out.println("\nTurn this list into a list of numerbs int");
        randomNumbers.stream().map(Integer::parseInt).collect(Collectors.toList()).forEach(System.out::println);
        
        System.out.println("\nTake the even numbers and greater than 2:");

        List<Integer> pairList= randomNumbers.stream()
        .map(Integer::parseInt)
        .filter(i -> ((i % 2) == 0 && (i > 2))).collect(Collectors.toList());
        System.out.println(pairList);
        
        System.out.println("\nDisplay average of numbers: ");
        randomNumbers.stream().mapToInt(Integer::parseInt).average().ifPresent(System.out::println);
    }
}
