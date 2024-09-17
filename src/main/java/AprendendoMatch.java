import java.util.stream.Stream;

public class AprendendoMatch {
    public static void main(String[] args) {
        Double[] notas = {5.1, 8.7, 7.8, 7.6};

        var aprovado_aprovada =
                Stream.of(notas).anyMatch( nota -> nota >= 7);

        System.out.println("Teve Aprovação: " + (aprovado_aprovada ? "Sim" : "Não"));
    }
}
