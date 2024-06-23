import java.util.List;
import java.util.Scanner;

public class Vota {
    static void vota (List<Integer> urna)
    {
        Scanner scanner = new Scanner(System.in);
        int i = 1;
        int input;
        while (true)
        {
            System.out.println("Olá eleitor " + i);
            System.out.println("Digite 1,2,3,4 para votar em seu candidato de preferência");
            System.out.println("Digite 5 para nulo");
            System.out.println("Digite 6 para branco");
            input = scanner.nextInt();
            if (input == 0)
            {
                break;
            }
            urna.add(input);
            i++;
        }
    }

}
