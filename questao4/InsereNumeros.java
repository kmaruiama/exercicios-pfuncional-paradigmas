import java.util.Scanner;

public class InsereNumeros {
    static void insere (double [] numeros)
    {
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i<10; i++)
        {
            System.out.println("Digite o número " + (i+1));
            numeros[i] = scanner.nextDouble();
        }
    }
}
