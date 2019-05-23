package basics;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.function.Consumer;

public class ForEachClient {

    public static void main(String[] args) {
        ArrayList<Integer> numberList = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 19));

        Consumer<Integer> action = System.out::println;

        numberList.stream().filter(n -> n % 2 == 0).forEach(action);

        System.out.println("-------------------------------------- ");
        HashMap<String, Integer> map = new HashMap<>();

        map.put("A", 1);
        map.put("B", 2);
        map.put("C", 3);

//1. Map entries
        Consumer<Map.Entry<String, Integer>> actionT = System.out::println;
        map.entrySet().forEach(actionT);

//2. Map keys
        Consumer<String> actionOnKeys = System.out::println;
        map.keySet().forEach(actionOnKeys);

//3. Map values
        Consumer<Integer> actionOnValues = System.out::println;
        map.values().forEach(actionOnValues);

        System.out.println("---------------custom----------------------- ");
        HashMap<String, Integer> mapVal = new HashMap<>();

        mapVal.put("A", 1);
        mapVal.put("B", 2);
        mapVal.put("C", 3);

        Consumer<Map.Entry<String, Integer>> actionVal = entry ->
        {
            System.out.println("Key is : " + entry.getKey());
            System.out.println("Value is : " + entry.getValue());
        };

        mapVal.entrySet().forEach(actionVal);
    }

}
