package collection.operate;

import java.util.*;

public class CollectionOperation {
    public static void main(String[] args) {
        System.out.println("--- removeIf(...) ---");

        final List<String> list = new ArrayList<>();
        list.add("Hokkaido");
        list.add("Kanagawa");
        list.add("Saitama");
        list.add("Tokyo");
        list.add("Osaka");
        list.add("Kyoto");
        list.add("Yamagata");

        list.removeIf(s -> s.length() > 5);
        list.forEach(System.out::println);

        System.out.println("--- replaceAll(...) ---");
        list.replaceAll(s -> s.toUpperCase());
        list.forEach(System.out::println);

        System.out.println("--- computeIfAbsent ---");
        final List<String> strings1 = Arrays.asList("Hokkaido", "Kanagawa", "Saitama", "Tokyo", "Osaka", "Kyoto", "Yamagata");
        final Map<Integer, List<String>> map = new HashMap<>();
        strings1.forEach(s -> {
            final int length = s.length();
            final List<String> valueList = map.computeIfAbsent(length, key -> new ArrayList<String>());
            valueList.add(s);
        });
        System.out.println(map);
    }
}
