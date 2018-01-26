package exception;

public class MultiCatch {
    public static void main(String[] args) {
        try {
            final Class<?> clazz = Class.forName("hoge");
            clazz.newInstance();
        } catch (ClassNotFoundException | IllegalAccessException | InstantiationException e) {
            e.printStackTrace();
        }
    }
}
