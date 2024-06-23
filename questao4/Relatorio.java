import java.util.Arrays;
import java.util.Map;
import java.util.stream.Collectors;

public class Relatorio {
    static Map<Integer, Integer> intervalos(double[] numeros) {
        int[] limitesSuperiores = {25, 50, 75, 100};

        return Arrays.stream(numeros)
                .boxed()
                .collect(Collectors.groupingBy(
                        num -> {
                            for (int i = 0; i < limitesSuperiores.length; i++) {
                                if (num <= limitesSuperiores[i]) {
                                    return i;
                                }
                            }
                            return limitesSuperiores.length;
                        },
                        Collectors.summingInt(a -> 1)
                ));
    }
}
