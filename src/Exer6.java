import java.util.Scanner;

public class Exer6 {
    public static void main(String[] args) {

        // Onde colocar um Array ou Lista...?

        Scanner scanner = new Scanner(System.in);

        System.out.print("Seu número: ");
        int num = scanner.nextInt();

        if (num % 5 == 0){
            System.out.println("Seu número é múltiplo de 5.");
        } else if (num % 7 == 0) {
            System.out.println("Seu número é múltiplo de 7.");
        } else {
            System.out.println("Seu número não é múltiplo de 5 ou 7.");
        }
    }
}
