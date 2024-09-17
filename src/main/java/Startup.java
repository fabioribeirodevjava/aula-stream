import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Startup {

   public static void main(String[] args) {
        List<String> estudantes = Arrays.asList("teste1","teste2","teste3","teste4");

        for (String nome: estudantes ) {
            System.out.println("Nome: " + nome);

        }

       System.out.println("********Stream*********");

        Stream<String> stream = estudantes.stream();
        stream.forEach(System.out::println);

   }

}

