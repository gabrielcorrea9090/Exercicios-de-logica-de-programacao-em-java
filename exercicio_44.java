import java.util.Scanner;

public class exercicio_44 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int contador = 0;
        int somaIdades = 0;

        while (contador < 5) {
            System.out.print("Digite o nome da pessoa " + (contador + 1) + ": ");
            String nome = scanner.nextLine();

            System.out.print("Digite a idade da pessoa " + (contador + 1) + ": ");
            int idade = scanner.nextInt();

            somaIdades += idade;
            contador++;

            scanner.nextLine(); // limpar o buffer do scanner após ler o número
        }

        double mediaIdades = somaIdades / 5.0;

        System.out.printf("Média das idades: %.2f%n", mediaIdades);

        scanner.close();
    }
}
