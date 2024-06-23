import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<Habitante> habitanteLista = new ArrayList<>();
        InicializaLista.inicializador(habitanteLista);

        double mediaSalarios = Relatorios.mediaSalario(habitanteLista);
        System.out.println("a média salárial foi de: " + mediaSalarios);

        int mediaFilhos = Relatorios.mediaFilhos(habitanteLista);
        System.out.println("a média de filhos foi de: " + mediaFilhos);

        double maiorSalario = Relatorios.maiorSalario(habitanteLista);
        System.out.println("o maior salário foi de: " + maiorSalario);

        double percentualMil = 100 * Relatorios.quantidadePessoasSalarioMil(habitanteLista);
        System.out.println("o percentual de pessoas com salário de até mil reais é de: " + percentualMil + "%");
    }
}

