package stream.operate;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class StreamOperation {
    public static void main(String[] args) {
        final List<People> list = Arrays.asList(new People("taro", 20), new People("hanako", 30), new People("ziro", 15));
        list.stream().map(People::getName).forEach(System.out::println);

        System.out.println("--- combile ---");
        final List<Group> groups = new ArrayList<>();

        final Group group = new Group();
        group.setPeople(Arrays.asList(new People("scott", 15), new People("adam", 20), new People("mike", 25)));
        groups.add(group);

        final Group group1 = new Group();
        group1.setPeople(Arrays.asList(new People("太郎", 20), new People("花子", 30), new People("次郎", 30)));
        groups.add(group1);

        final List<People> people = new ArrayList<>();
        groups.stream().forEach(g -> people.addAll(g.getPeople()));
        people.stream()
                .sorted((o1, o2) -> Integer.compare(o1.getAge(), o2.getAge()))
                .forEach(System.out::println);

        System.out.println("--- flatMap(...) ---");
        groups.stream()
                .flatMap(g -> g.getPeople().stream())
                .sorted((o1, o2) -> Integer.compare(o2.getAge(), o1.getAge()))
                .forEach(System.out::println);

        System.out.println("--- filter(...) ---");
        list.stream()
                .filter(p -> p.getAge() <= 20)
                .forEach(System.out::println);

        System.out.println("--- limit(...) ---");
        list.stream()
                .limit(2)
                .forEach(System.out::println);

        System.out.println("--- distinct() ---");
        final List<String> strings = new ArrayList<>();
        strings.add("foo");
        strings.add("bar");
        strings.add("meta");
        strings.add("Hoge");
        strings.add("foo");
        strings.add("barbar");
        strings.add("bar");

        strings.stream().distinct().forEach(System.out::println);

        System.out.println("--- Collectors#toList() ---");
        final List<People> collect = list.stream().filter(p -> p.getAge() > 20).collect(Collectors.toList());
        collect.forEach(System.out::println);

        System.out.println("--- Collectors#joining(...) ---");
        final String collect1 = strings.stream().collect(Collectors.joining(",", "[", "]"));
        System.out.println(collect1);

        System.out.println("--- Collectors#groupingBy(...) ---");
        final Map<Integer, List<People>> collect2 = list.stream()
                .collect(Collectors.groupingBy(People::getAge));
        System.out.println(collect2.get(20));

        System.out.println("--- findFirst() ---");
        final Optional<People> first = list.stream().findFirst();
        System.out.println(first.get());

        System.out.println("--- average() ---");
        final IntStream intStream = IntStream.rangeClosed(1, 100);
        final OptionalDouble average = intStream.average();
        System.out.println(average.getAsDouble());

        System.out.println("--- practice ---");
        final List<String> strings1 = Arrays.asList("Hokkaido", "Kanagawa", "Saitama", "Tokyo", "Osaka", "Kyoto", "Yamagata");
        strings1.stream()
                .filter(s -> s.length() > 5)
                .map(s -> "[" + s + "]")
                .forEach(System.out::println);
    }

    private static class Group {
        private List<People> people;

        public List<People> getPeople() {
            return people;
        }

        public void setPeople(List<People> people) {
            this.people = people;
        }
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

