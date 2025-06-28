import java.util.Scanner;

public class exercicio_12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o peso da pessoa (em kg): ");
        double peso = scanner.nextDouble();

        System.out.print("Digite a altura da pessoa (em metros): ");
        double altura = scanner.nextDouble();

        // cálculo do IMC = peso / (altura * altura)
        double imc = peso / (altura * altura);

        System.out.printf("O Índice de Massa Corporal (IMC) é: %.2f%n", imc);

        scanner.close();
    }
}
