import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class InicializaLista {
    static void inicializador(List<Habitante> habitanteLista) {
        double input = 0;
        int i = 1;
        Scanner scanner = new Scanner(System.in);

        while (true) {
            Habitante habitante = new Habitante();

            System.out.println("digite o número de filhos do habitante " + i);
            input = scanner.nextDouble();
            if (input < 0)
            {
                break;
            }
            habitante.setNumeroFilhos((int) input);

            System.out.println("digite o salário do habitante " + i);
            input = scanner.nextDouble();
            habitante.setSalario(input);

            System.out.println("Habitante " + i + " adicionado com sucesso");
            habitanteLista.add(habitante);
            i++;
        }
    }
}