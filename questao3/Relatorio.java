import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Relatorio {
    static Map<Integer, Double> resultados(List<Aluno> alunoLista) {
        return alunoLista
                .stream()
                .collect(Collectors.toMap(
                        alunoLista::indexOf,
                        aluno -> {
                            double[] notas =
                                    {
                                            aluno.getNotaUm(),
                                            aluno.getNotaDois(),
                                            aluno.getNotaTres()
                                    };
                            Arrays.sort(notas);
                            double maior = notas[2] * 4;
                            double menor1 = notas[1] * 3;
                            double menor2 = notas[0] * 3;

                            return (maior + menor1 + menor2) / 10;
                        }
                ));
    }
}
