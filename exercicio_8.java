import java.util.Scanner;

public class exercicio_8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o primeiro número inteiro: ");
        int num1 = scanner.nextInt();

        System.out.print("Digite o segundo número inteiro: ");
        int num2 = scanner.nextInt();

        System.out.println("Antes da troca:");
        System.out.println("Número 1 = " + num1);
        System.out.println("Número 2 = " + num2);

        // Troca dos valores usando variável temporária
        int temp = num1;
        num1 = num2;
        num2 = temp;

        System.out.println("Após a troca:");
        System.out.println("Número 1 = " + num1);
        System.out.println("Número 2 = " + num2);

        scanner.close();
    }
}
