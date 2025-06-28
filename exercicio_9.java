import java.util.Scanner;

public class exercicio_9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o valor do depósito mensal: R$ ");
        double depositoMensal = scanner.nextDouble();

        System.out.print("Digite a taxa de juros mensal (em %): ");
        double taxaJurosPercentual = scanner.nextDouble();

        double taxaJuros = taxaJurosPercentual / 100;

        double montante = 0;

        // Calcula o montante após 12 meses com depósitos mensais e juros compostos
        for (int mes = 1; mes <= 12; mes++) {
            montante = (montante + depositoMensal) * (1 + taxaJuros);
        }

        System.out.printf("Montante após 12 meses: R$ %.2f%n", montante);

        scanner.close();
    }
}
