import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<Aluno> alunoLista = new ArrayList<>();
        Avalia.avalia(alunoLista);

        Map<Integer, Double> resultado = Relatorio.resultados(alunoLista);

        resultado.forEach((indice, media) -> {
                    int i = indice + 1;
                    if (media >= 5.0) {
                        System.out.println("O aluno " + i + " foi aprovado com média " + media);
                    } else {
                        System.out.println("O aluno " + i + " foi reprovado com média " + media);
                    }
                }
        );

    }
}
