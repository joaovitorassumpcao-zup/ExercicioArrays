import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

enum Sexo {
    Masculino,
    Feminino,
}
public class Exer4 {
    public static void main(String[] args) {
        Map<Integer, Sexo> pessoas = new HashMap<>(Map.ofEntries(
                Map.entry(182, Sexo.Masculino),
                Map.entry(179, Sexo.Feminino),
                Map.entry(170, Sexo.Feminino),
                Map.entry(120, Sexo.Masculino),
                Map.entry(140, Sexo.Feminino),
                Map.entry(180, Sexo.Masculino),
                Map.entry(90, Sexo.Masculino),
                Map.entry(101, Sexo.Feminino),
                Map.entry(175, Sexo.Feminino),
                Map.entry(172, Sexo.Masculino)
                ));

        System.out.println("Maior altura: " + Collections.max(pessoas.keySet()));
        System.out.println("Menor altura: " + Collections.min(pessoas.keySet()));

        int sum = 0, size = 0, mulheres = 0;

        for (Map.Entry<Integer, Sexo> set : pessoas.entrySet()) {
            if (set.getValue().equals(Sexo.Masculino)) {
                size++;
                sum += set.getKey();
            } else {
                mulheres++;
            }
        }

        System.out.println("Média de altura dos homens: " + (sum / size));
        System.out.println("Número de mulheres: " + mulheres);

    }
}
