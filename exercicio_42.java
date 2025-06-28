import java.util.Scanner;

public class exercicio_42 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um número inteiro: ");
        int numero = scanner.nextInt();

        if (numero <= 1) {
            System.out.println("O número não é primo.");
        } else {
            int i = 2;
            boolean ehPrimo = true;

            while (i <= numero / 2) {
                if (numero % i == 0) {
                    ehPrimo = false;
                    break;
                }
                i++;
            }

            if (ehPrimo) {
                System.out.println(numero + " é primo.");
            } else {
                System.out.println(numero + " não é primo.");
            }
        }

        scanner.close();
    }
}
