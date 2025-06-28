import java.util.Scanner;

public class exercicio_19 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a primeira nota: ");
        double nota1 = scanner.nextDouble();

        System.out.print("Digite a segunda nota: ");
        double nota2 = scanner.nextDouble();

        System.out.print("Digite a terceira nota: ");
        double nota3 = scanner.nextDouble();

        double media = (nota1 + nota2 + nota3) / 3;

        if (media >= 7) {
            System.out.printf("Aluno aprovado com média %.2f%n", media);
        } else {
            System.out.printf("Aluno reprovado com média %.2f%n", media);
        }

        scanner.close();
    }
}
