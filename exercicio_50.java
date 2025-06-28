import java.util.Scanner;

public class exercicio_50 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int somaIdades = 0;
        int contador = 0;

        while (true) {
            System.out.print("Digite o nome da pessoa (ou 'fim' para encerrar): ");
            String nome = scanner.nextLine().trim();

            if (nome.equalsIgnoreCase("fim")) {
                break;
            }

            System.out.print("Digite a idade de " + nome + ": ");
            int idade = scanner.nextInt();

            somaIdades += idade;
            contador++;

            scanner.nextLine(); // limpar o buffer após nextInt
        }

        if (contador > 0) {
            double media = somaIdades / (double) contador;
            System.out.printf("Média das idades: %.2f%n", media);
        } else {
            System.out.println("Nenhuma idade foi informada.");
        }

        scanner.close();
    }
}

