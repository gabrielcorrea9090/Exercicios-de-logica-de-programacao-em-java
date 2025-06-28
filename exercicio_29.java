import java.util.Scanner;

public class exercicio_29 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o nome do aluno: ");
        String nome = scanner.nextLine();

        System.out.print("Digite a nota do aluno: ");
        double nota = scanner.nextDouble();

        if (nota >= 7) {
            System.out.println(nome + " está aprovado(a).");
        } else {
            System.out.println(nome + " está em recuperação.");
        }

        scanner.close();
    }
}
