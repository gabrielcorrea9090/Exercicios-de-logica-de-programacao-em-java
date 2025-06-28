import java.util.Scanner;

public class exercicio_43 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um número inteiro para gerar a sequência de Fibonacci até esse número: ");
        int limite = scanner.nextInt();

        int a = 0, b = 1;

        System.out.print("Sequência de Fibonacci: ");

        while (a <= limite) {
            System.out.print(a + " ");

            int proximo = a + b;
            a = b;
            b = proximo;
        }

        System.out.println();

        scanner.close();
    }
}
