import java.util.Scanner;

public class Exer9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[][] matrix = new int[4][5];
        int sum = 0;

        System.out.println("Entre números na matriz: ");
        for(int i = 0; i < 4; i++){
            for(int y = 0; y < 5; y++){
                System.out.print(" -> ");
                matrix[i][y] = scanner.nextInt();
                sum += matrix[i][y];
            }
        }

        for(int i = 0; i < 4; i++){
            for(int y = 0; y < 5; y++){
                System.out.print(matrix[i][y] + " ");
            }
            System.out.println();
        }

        System.out.println("Soma: " + sum);
    }
}
