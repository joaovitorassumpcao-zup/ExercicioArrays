import java.util.Scanner;

public class Exer7 {
    public static void main(String[] args) {
        // Eu PODERIA colocar cada número do inteiro em ordem reversa
        // e um array e printar com um loop, mas desse jeito é mais bonito :)
        // (e eu estou sem tempo então perdão)

        Scanner scanner = new Scanner(System.in);
        int invertido = 0;

        System.out.print("Seu número inteiro: ");
        int num = scanner.nextInt();

        for (; num > 0; num /= 10) {
            int modulo = num % 10;
            invertido = invertido * 10 + modulo;
        }

        System.out.println("Invertido: " + invertido);
    }
}
