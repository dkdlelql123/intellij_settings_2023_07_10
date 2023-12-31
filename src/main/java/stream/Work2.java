package stream;

import java.util.Arrays;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Work2 {
    public static void main(String[] args) {
        // 복습  :반복문

        System.out.println("\nStream");
        // Stream
        IntStream.rangeClosed(0, 10).forEach(e-> System.out.println(e));
        IntStream.rangeClosed(100,107).forEach(System.out::println);

        // 곱하기
        int[] arr = new int[]{1,2,3,4,5};
        for(int a : arr) System.out.println(a * 2);

        int[] newArr = Arrays.stream(arr).map(
                e -> {return e*3;}
        ).toArray();
         //int [] newArr = Arrays.stream(arr).map(e-> e*3).toArray();

        System.out.println("\nStream 곱하기 ");
        System.out.println(Arrays.toString(newArr));

        // 홀수제외시키기
        int[] newArr2 = Arrays.stream(arr).filter(e->e%2==0).toArray();

        System.out.println("\nStream 홀수제외");
        System.out.println(Arrays.toString(newArr2));



        // 홀수제외시키기
        int[] newArr3 = Arrays.stream(arr).filter(e->e%2==0).map(e->e+10).toArray();

        System.out.println("\nStream 홀수제외 후 +10 ");
        System.out.println(Arrays.toString(newArr3));

    }
}
