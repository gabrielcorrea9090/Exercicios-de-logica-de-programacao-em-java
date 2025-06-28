import java.util.Scanner;

public class exercicio_25 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o número de faltas do aluno: ");
        int faltas = scanner.nextInt();

        if (faltas > 15) {
            System.out.println("Aluno reprovado por falta.");
        } else {
            System.out.println("Aluno não reprovado por falta.");
        }

        scanner.close();
    }
}
