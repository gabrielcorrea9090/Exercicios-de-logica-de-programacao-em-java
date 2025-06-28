import java.util.Scanner;

public class exercicio_46 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um número inteiro: ");
        int numero = scanner.nextInt();

        int i = 1;
        int soma = 0;

        while (i <= numero) {
            if (i % 2 == 0) {
                soma += i;
            }
            i++;
        }

        System.out.println("Soma dos números pares entre 1 e " + numero + ": " + soma);

        scanner.close();
    }
}
