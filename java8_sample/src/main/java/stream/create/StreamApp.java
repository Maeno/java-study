package stream.create;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamApp {
    public static void main(String[] args) {
        final List<People> list = Arrays.asList(new People("taro", 20), new People("hanako", 30), new People("ziro", 15));
        list.stream() // 作成
                .filter(people -> people.getAge() >= 20) // 中間操作
                .forEach(people -> System.out.println(people)); // 終端操作

        System.out.println("---");
        /*
         * method reference
         * 1. method of instance: {instance name}::{method name}
         * 2. method of own instance: this::{method name}
         * 3. static method: {class name}::{method name}
         */
        list.forEach(System.out::println);

        System.out.println("---");
        Collections.sort(list, (o1, o2) -> Integer.compare(o1.getAge(), o2.getAge()));
        System.out.println(list);

        System.out.println("---");
        final String[] strings = {"Tokyo", "Osaka", "Kanagawa", "Chiba"};
        final Stream<String> stream = Arrays.stream(strings);
        stream.forEach(System.out::println);

        System.out.println("---");
        final Stream<String> strs = Stream.of("Tachikawa", "Fussa", "Hamura", "Ome");
        strs.forEach(System.out::println);

        System.out.println("---");
        final HashMap<Integer, String> map = new HashMap<Integer, String>() {
            {
                put(1, "Foo");
                put(2, "Hoge");
                put(3, "Bar");
            }
        };
        map.entrySet().stream().forEach(entry -> System.out.println(entry));

        System.out.println("---");
        map.values().stream().forEach(System.out::println);

        System.out.println("---");
        final IntStream range = IntStream.range(1, 10);
        range.forEach(System.out::println);

        System.out.println("---");
        final IntStream range1 = IntStream.rangeClosed(1, 5);
        range1.forEach(System.out::println);

    }

    private static class People {
        private final int age;
        private final String name;

        public People(final String name, final int age) {
            this.name = name;
            this.age = age;
        }

        public int getAge() {
            return age;
        }

        public String getName() {
            return name;
        }

        @Override
        public String toString() {
            return "People{" +
                    "age=" + age +
                    ", name='" + name + '\'' +
                    '}';
        }
    }
}
