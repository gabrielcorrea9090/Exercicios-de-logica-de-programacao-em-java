import java.util.Scanner;

public class exercicio_3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a base do triângulo: ");
        double base = scanner.nextDouble();

        System.out.print("Digite a altura do triângulo: ");
        double altura = scanner.nextDouble();

        // cálculo da área do triângulo: (base * altura) / 2
        double area = (base * altura) / 2;

        System.out.println("Área do triângulo: " + area);

        scanner.close();
    }
}
