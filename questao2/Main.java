import java.util.*;

public class Main {
    public static void main (String[] args)
    {
        ArrayList<Integer> urna = new ArrayList<>();
        Vota.vota(urna);
        if (urna.isEmpty())
        {
            System.exit(0);
        }

        Map <Integer, Integer> resultadosUrna = Relatorio.relatorio(urna);

        int candidatoUm = resultadosUrna.getOrDefault(1, 0);
        int candidatoDois = resultadosUrna.getOrDefault(2, 0);
        int candidatoTres = resultadosUrna.getOrDefault(3, 0);
        int candidatoQuatro = resultadosUrna.getOrDefault(4, 0);
        int votoNulo = resultadosUrna.getOrDefault(5, 0);
        int votoBranco = resultadosUrna.getOrDefault(6, 0);

        System.out.println("O candidato 1 recebeu " + candidatoUm + " votos");
        System.out.println("O candidato 2 recebeu " + candidatoDois + " votos");
        System.out.println("O candidato 3 recebeu " + candidatoTres + " votos");
        System.out.println("O candidato 4 recebeu " + candidatoQuatro + " votos");
        System.out.println(votoNulo + " votaram nulo");
        System.out.println(votoBranco + " votaram branco");
    }
}
