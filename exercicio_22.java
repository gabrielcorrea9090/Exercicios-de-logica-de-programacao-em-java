import java.util.Scanner;

public class exercicio_22 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o salário do funcionário: R$ ");
        double salario = scanner.nextDouble();

        double bonus;

        if (salario > 2000) {
            bonus = salario * 0.10;
        } else {
            bonus = salario * 0.05;
        }

        System.out.printf("Valor do bônus: R$ %.2f%n", bonus);

        scanner.close();
    }
}
