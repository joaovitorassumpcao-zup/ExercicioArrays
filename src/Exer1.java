import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Exer1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> nomes = new ArrayList<>(List.of(new String[]{
                "Joao", "Beatriz", "Pedro", "Guilherme", "Cthulhu"
        }));

        System.out.println("Informe o número do nome que você quer remover: " + nomes);
        int escolha = scanner.nextInt();

        if (escolha < 0 || escolha > (nomes.size() - 1)) {
            System.out.println("Inválido!");
            return;
        }

        System.out.println(nomes.get(escolha - 1 ) + " removido.");

        nomes.remove(escolha - 1 );

        System.out.println(nomes);
    }
}
