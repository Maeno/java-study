package collection.operate;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class CollectionInit {
    public static void main(String[] args) {
        System.out.println("--- IntStream#of(...) ---");
        final List<Integer> collect = IntStream.of(1, 10, 9, 8, 7, 99).boxed().collect(Collectors.toList());
        System.out.println(collect);

        System.out.println("--- IntStream#range(...) ---");
        final List<Integer> collect1 = IntStream.range(1, 100).boxed().collect(Collectors.toList());
        System.out.println(collect1);
    }
}
