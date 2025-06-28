import java.util.Scanner;

public class exercicio_5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o preço do produto: ");
        double preco = scanner.nextDouble();

        System.out.print("Digite a quantidade comprada: ");
        int quantidade = scanner.nextInt();

        double valorTotal = preco * quantidade;

        // Aplica desconto de 10% se quantidade > 10
        if (quantidade > 10) {
            valorTotal = valorTotal * 0.9; // desconto de 10%
        }

        System.out.printf("Valor total a pagar: R$ %.2f%n", valorTotal);

        scanner.close();
    }
}
