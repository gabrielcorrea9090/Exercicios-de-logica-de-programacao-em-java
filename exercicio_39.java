import java.util.Scanner;

public class exercicio_39 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int contador = 0;
        int soma = 0;

        while (contador < 5) {
            System.out.print("Digite o número " + (contador + 1) + ": ");
            int numero = scanner.nextInt();
            soma += numero;
            contador++;
        }

        double media = soma / 5.0;

        System.out.printf("A média aritmética dos valores lidos é: %.2f%n", media);

        scanner.close();
    }
}

