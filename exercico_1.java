import java.util.Scanner;

public class exercico_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // solicita os dois numeros inteiros
        System.out.print("Digite o primeiro número inteiro: ");
        int num1 = scanner.nextInt();

        System.out.print("Digite o segundo número inteiro: ");
        int num2 = scanner.nextInt();

        // operações
        int soma = num1 + num2;
        int subtracao = num1 - num2;
        int multiplicacao = num1 * num2;

        // resultados
        System.out.println("Soma: " + soma);
        System.out.println("Subtração: " + subtracao);
        System.out.println("Multiplicação: " + multiplicacao);

        if (num2 != 0) {
            double divisao = (double) num1 / num2;
            System.out.println("Divisão: " + divisao);
        } else {
            System.out.println("Divisão: Não é possível dividir por zero.");
        }

        scanner.close();
    }
}
