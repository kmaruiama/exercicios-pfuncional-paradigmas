import java.util.List;
import java.util.Scanner;

public class Avalia {
    static void avalia(List<Aluno> alunoLista) {
        Scanner scanner = new Scanner(System.in);
        for (int i = 1; i <= 5; i++) {
            Aluno aluno = new Aluno();
            System.out.println("Digite a nota um do aluno " + i);
            aluno.setNotaUm(scanner.nextDouble());
            System.out.println("Digite a nota dois do aluno " + i);
            aluno.setNotaDois(scanner.nextDouble());
            System.out.println("Digite a nota três do aluno " + i);
            aluno.setNotaTres(scanner.nextDouble());

            alunoLista.add(aluno);
        }
    }
}
