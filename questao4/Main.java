import java.util.Map;

public class Main {
    public static void main (String[] args)
    {
        double[] numeros = new double[10];
        InsereNumeros.insere(numeros);
        Map<Integer, Integer> resultado = Relatorio.intervalos(numeros);
        resultado.forEach((intervalo, quantidade) -> {
            switch (intervalo) {
                case 0:
                    System.out.println("no intervalo 0-25 há: " + quantidade + " números");
                    break;
                case 1:
                    System.out.println("no intervalo 26-50 há: " + quantidade + " números");
                    break;
                case 2:
                    System.out.println("no intervalo 51-75 há: " + quantidade + " números");
                    break;
                case 3:
                    System.out.println("no intervalo 76-100 há: " + quantidade + " números");
                    break;
            }
        });
    }
}
