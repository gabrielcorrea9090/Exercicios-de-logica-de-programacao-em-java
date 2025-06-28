import java.util.Scanner;

public class exercicio_31 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o valor do salário-mínimo: R$ ");
        double salarioMinimo = scanner.nextDouble();

        System.out.print("Digite o salário do funcionário: R$ ");
        double salarioFuncionario = scanner.nextDouble();

        if (salarioMinimo <= 0) {
            System.out.println("Valor do salário-mínimo inválido.");
        } else {
            double qtdSalariosMinimos = salarioFuncionario / salarioMinimo;
            System.out.printf("O funcionário recebe %.2f salários-mínimos.%n", qtdSalariosMinimos);
        }

        scanner.close();
    }
}
