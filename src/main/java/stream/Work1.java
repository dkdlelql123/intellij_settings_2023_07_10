package stream;

import java.util.stream.IntStream;

public class Work1 {
    public static void main(String[] args) {
        // 반복문
        // 일반 for
        for (int i = 1; i <= 10; i++) {
            System.out.printf(i + "," );
        }


        System.out.println("\nStream");
        // Stream
        IntStream.range(0, 10).forEach(e -> { System.out.printf(e + "," );});

        System.out.println("\nStream - 2");
        IntStream.rangeClosed(0, 10).forEach(e ->  System.out.printf(e + "," ));

        System.out.println("\nStream - 3");
        IntStream.rangeClosed(0, 10).forEach(System.out::print);


    }
}
