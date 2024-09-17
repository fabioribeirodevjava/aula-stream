import java.util.stream.Stream;

public class AprendendoFilter {
    public static void main(String[] args) {
        Double[] notas = {5.1, 8.7, 7.8, 8.3, 7.6};

        Stream.of(notas)
                .filter(nota -> nota >= 7)
                .map(nota -> "Você foi aprovado com a nota: " + nota)
                .forEach(System.out::println);

    }
}
