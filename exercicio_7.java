import java.util.Scanner;

public class exercicio_7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o salário base do funcionário: R$ ");
        double salarioBase = scanner.nextDouble();

        // calcula comissão de 5%
        double comissao = salarioBase * 0.05;

        // salário líquido = salário base + comissão
        double salarioLiquido = salarioBase + comissao;

        System.out.printf("Salário líquido: R$ %.2f%n", salarioLiquido);

        scanner.close();
    }
}
