import java.util.stream.Stream;

public class AprendendoMap {
    public static void main(String[] args) {
        Double[] notas = {5.1, 8.7, 7.8, 8.3, 7.6};

        Stream.of(notas)
                .map(nota -> nota + 2)
                .map(nota -> nota - 1)
                .forEach(System.out::println);
    }
}
