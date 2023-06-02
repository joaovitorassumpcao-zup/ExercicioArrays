import java.util.*;

public class Exer3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> nums = new ArrayList<>();

        System.out.print("1º valor: ");
        nums.add(scanner.nextInt());

        System.out.print("2º valor: ");
        nums.add(scanner.nextInt());

        nums.sort(Collections.reverseOrder());

        System.out.println("Em ordem reversa: " + nums);
    }
}
