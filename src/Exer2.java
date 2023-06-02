import java.util.Arrays;
import java.util.Scanner;

public class Exer2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] nums = new int[10];

        System.out.println("Lista: " + Arrays.toString(nums));

        System.out.print("Valor a ser inserido: ");
        int valor = scanner.nextInt();

        System.out.print("Posição: ");
        int pos = scanner.nextInt();

        nums[pos - 1] = valor;

        System.out.println("Valor " + valor + " inserido na posição " + (pos - 1));
        System.out.println(Arrays.toString(nums));
    }
}
