import java.util.Scanner;

public class Exer10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] A = new int[10];
        int sum = 0, size = 0;

        System.out.println("Entre os números para a média do ímpares:");
        for (int i = 0; i < A.length; i++) {
            System.out.print(" -> ");
            A[i] = scanner.nextInt();
        }

        for (int i : A) {
            if (i % 2 != 0) {
                sum += i;
                size++;
            }
        }

        System.out.println("Média: " + (sum / size));
    }
}
