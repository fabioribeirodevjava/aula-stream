import java.util.stream.Stream;

public class AprendendoReduce {
    public static void main(String[] args) {
        Double[] notas = {5.1, 8.7, 7.8, 7.6};

        var aprovado_aprovada =
        Stream.of(notas)
                .reduce((acumulador, nota) -> acumulador + nota)
                .map( somadasnotas -> somadasnotas/4)
                .filter(nota -> nota > 7)
                .isPresent();

        System.out.println("Você foi Aprovado:" + (aprovado_aprovada ? "Sim" : "Não"));

    }
}
