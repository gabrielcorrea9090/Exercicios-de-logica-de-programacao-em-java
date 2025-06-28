import java.util.Scanner;

public class exercicio_49 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um número inteiro não negativo: ");
        int numero = scanner.nextInt();

        if (numero < 0) {
            System.out.println("Número inválido para cálculo de fatorial.");
        } else {
            int i = 1;
            long fatorial = 1;

            while (i <= numero) {
                fatorial *= i;
                i++;
            }

            System.out.println("Fatorial de " + numero + " é: " + fatorial);
        }

        scanner.close();
    }
}
