import java.util.Scanner;

public class exercicio_33 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o nome do aluno: ");
        String nome = scanner.nextLine();

        System.out.print("Digite o turno do aluno (M para matutino, V para vespertino): ");
        char turno = scanner.next().toUpperCase().charAt(0);

        if (turno == 'M') {
            System.out.println("Bom dia, " + nome + "!");
        } else if (turno == 'V') {
            System.out.println("Boa tarde, " + nome + "!");
        } else {
            System.out.println("Turno inválido.");
        }

        scanner.close();
    }
}
