import java.util.stream.Stream;

public class ConstrucaoStream {
    public static void main(String[] args) {
        Stream<Number> numeros = Stream.of(10, 20, 30, 34.5,40);
        numeros.forEach(System.out::println);

        System.out.println("********** mais notas");

        Number[] maisNumeros = {10, 20, 450, 12.5};

        Stream.of(maisNumeros).forEach(System.out::println);

    }
}
