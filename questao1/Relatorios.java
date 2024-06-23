import java.util.List;

public class Relatorios {
    static double mediaSalario(List<Habitante> habitanteLista) {
        return habitanteLista
                .stream()
                .mapToDouble(Habitante::getSalario)
                .average()
                .orElse(0.0);
    }

    static int mediaFilhos(List<Habitante> habitanteLista) {
        return (int) habitanteLista
                .stream()
                .mapToInt(Habitante::getNumeroFilhos)
                .average()
                .orElse(0);
    }

    static double maiorSalario(List<Habitante> habitanteLista) {
        return habitanteLista
                .stream()
                .mapToDouble(Habitante::getSalario)
                .max()
                .orElse(0);
    }

    static double quantidadePessoasSalarioMil (List<Habitante> habitanteLista)
    {
        double maiorQueMil = habitanteLista
                .stream()
                .filter(habitante -> habitante.getSalario() <= 1000)
                .count();
        return maiorQueMil/habitanteLista.size();
    }
}
