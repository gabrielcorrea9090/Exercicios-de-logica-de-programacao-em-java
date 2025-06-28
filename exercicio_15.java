import java.util.Scanner;

public class exercicio_15 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o salário do funcionário: R$ ");
        double salario = scanner.nextDouble();

        double novoSalario = salario * 1.15; // aumento de 15%

        System.out.printf("Novo salário com aumento de 15%%: R$ %.2f%n", novoSalario);

        scanner.close();
    }
}
