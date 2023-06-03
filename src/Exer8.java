public class Exer8 {
    public static void main(String[] args) {
        int soma = 0;

        for (int i = 100; i <= 150; i++) {
            System.out.println(i);
            if (i % 2 == 0) soma += i;
        }

        System.out.println("Soma: " + soma);
    }
}
