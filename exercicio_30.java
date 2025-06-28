import java.util.Scanner;

public class exercicio_30 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a quantidade de maçãs compradas: ");
        int quantidade = scanner.nextInt();

        double precoUnitario;

        if (quantidade < 12) {
            precoUnitario = 0.50;
        } else {
            precoUnitario = 0.40;
        }

        double valorTotal = quantidade * precoUnitario;

        System.out.printf("Valor total a pagar: R$ %.2f%n", valorTotal);

        scanner.close();
    }
}
