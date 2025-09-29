package concepts.java.advanced;

import java.util.*;
import java.util.stream.*;

public class StreamsAndLambdas {
    public static Map<String, Long> wordFrequencies(List<String> words){
        return words.stream()
            .map(w -> w.toLowerCase())
            .collect(Collectors.groupingBy(w -> w, Collectors.counting()));
    }

    public static int sumOfSquaresOfEvens(List<Integer> nums){
        return nums.stream().filter(n -> n%2==0).map(n -> n*n).reduce(0, Integer::sum);
    }

    public static void main(String[] args){
        System.out.println(wordFrequencies(Arrays.asList("Apple","Banana","apple","APPLE","orange")));
        System.out.println(sumOfSquaresOfEvens(Arrays.asList(1,2,3,4,5,6)));
    }
}
