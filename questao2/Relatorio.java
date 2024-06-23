import java.util.ArrayList;
import java.util.Map;
import java.util.stream.Collectors;

public class Relatorio {
    static Map <Integer, Integer> relatorio (ArrayList<Integer> urna)
    {
        return urna
                .stream()
                .filter (numero -> numero >= 1 && numero <= 6)
                .collect(Collectors.groupingBy(
                        numero -> numero,
                        Collectors.summingInt(numero -> 1)));
    }
}
