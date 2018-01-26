package optional;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class OptionalSample {
    public static void main(String[] args) {
        final OptionalStack<String> stack = new OptionalStack<>();
        final Optional<String> pop = stack.pop();
        final String elem = pop.orElse("empty");
        System.out.println(elem);

        stack.push("Osaka");
        stack.push("Tokyo");
        stack.push("Kyoto");

        Optional<String> pop1 = stack.pop();

        pop1.ifPresent(System.out::println);

        pop1 = stack.pop();

        pop1.ifPresent(System.out::println);
    }


    private static class OptionalStack<E> {
        private List<E> list;

        public OptionalStack() {
            this.list = new ArrayList<>();
        }

        public boolean push(E e) {
            return this.list.add(e);
        }

        public Optional<E> pop() {
            if (this.list.isEmpty()) {
                return Optional.empty();
            }
            return Optional.of(this.list.remove(this.list.size() - 1));
        }
    }
}
