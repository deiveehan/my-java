package streams;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamClient {

    public static void main(String[] args) {
        // Integer definition
        Stream<Integer> streamIntegers = Stream.of(1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20);
        streamIntegers.forEach(p -> System.out.println(p));

        // Integer array definition
        //
        Stream<Integer> streamArray = Stream.of( new Integer[]{1,2,3,4,5,6,7,8,9} );
        streamArray.forEach(p -> System.out.println(p));

        printStreamFromList();
        
       // printStreamGenerate();

        printStreamTokens();
        
        convertStreamToArray();
        convertStreamToList();

        filterStreams();
    }

    private static void filterStreams() {
        System.out.println("------filterStreams--------");

        List<String> memberNames = new ArrayList<>();
        memberNames.add("Amitabh");
        memberNames.add("Shekhar");
        memberNames.add("Aman");
        memberNames.add("Rahul");
        memberNames.add("Shahrukh");
        memberNames.add("Salman");
        memberNames.add("Yana");
        memberNames.add("Lokesh");

        memberNames.stream().filter((s) -> s.startsWith("A"))
                .forEach(System.out::println);
    }

    private static void convertStreamToList() {
        System.out.println("------convertStreamToList--------");

        List<Integer> list = new ArrayList<Integer>();
        for(int i = 1; i< 10; i++){
            list.add(i);
        }
        Stream<Integer> stream = list.stream();
        List<Integer> evenNumbersList = stream.filter(i -> i%2 == 0).collect(Collectors.toList());
        System.out.print(evenNumbersList);
    }

    private static void convertStreamToArray() {
        System.out.println("------convertStreamToArray--------");

        List<Integer> list = new ArrayList<Integer>();
        for(int i = 1; i< 10; i++){
            list.add(i);
        }
        Stream<Integer> stream = list.stream();
        Integer[] evenNumbersArr = stream.filter(i -> i%2 == 0).toArray(Integer[]::new);
        System.out.print(evenNumbersArr);
    }

    private static void printStreamTokens() {
        System.out.println("------printStreamTokens--------");

        IntStream stream1 = "12345_abcdefg".chars();
        stream1.forEach(p -> System.out.println(p));

        //OR

        Stream<String> stream2 = Stream.of("A$B$C".split("\\$"));
        stream2.forEach(p -> System.out.println(p));
    }

    private static void printStreamGenerate() {
        System.out.println("------printStreamGenerate--------");

        Stream<Date> stream = Stream.generate(() -> { return new Date(); });
        stream.forEach(p -> System.out.println(p));
    }
    private static void printStreamFromList() {
        System.out.println("------printStreamFromList--------");
        List<Integer> list = new ArrayList<Integer>();

        for(int i = 1; i< 10; i++){
            list.add(i);
        }

        Stream<Integer> stream = list.stream();
        stream.forEach(p -> System.out.println(p));
    }
}
