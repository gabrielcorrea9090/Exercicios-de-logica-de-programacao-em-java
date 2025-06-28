import java.util.Scanner;

public class exercicio_13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o primeiro número inteiro: ");
        int num1 = scanner.nextInt();

        System.out.print("Digite o segundo número inteiro: ");
        int num2 = scanner.nextInt();

        if (num2 == 0) {
            System.out.println("Não é possível verificar múltiplo com divisor zero.");
        } else {
            if (num1 % num2 == 0) {
                System.out.println(num1 + " é múltiplo de " + num2 + ".");
            } else {
                System.out.println(num1 + " não é múltiplo de " + num2 + ".");
            }
        }

        scanner.close();
    }
}
