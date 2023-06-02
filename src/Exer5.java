import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Exer5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Map<String, Integer> funcionarios = new HashMap<>();

        String nome;
        int salario, soma = 0;

        System.out.println("Entre os dados dos funcionários.        PARA ENCERRAR DIGITE 'pare' NO NOME");

        while (true) {
            System.out.print("\nNome do funcionário -> ");
            nome = scanner.next();

            if (nome.equals("pare")) break;

            System.out.print("Salário do funcionário -> ");
            salario = scanner.nextInt();

            soma += salario;

            funcionarios.put(nome, salario);
        }

        if (funcionarios.size() == 0) return;

        System.out.println("\nFuncionários: " + funcionarios);
        System.out.println("Média: " + (soma / funcionarios.size()));
    }
}
