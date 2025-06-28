import java.util.Scanner;

public class exercicio_48 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um número inteiro: ");
        int numero = scanner.nextInt();

        System.out.println("Dígitos do número:");

        // Converter para string para facilitar a exibição dos dígitos
        String numStr = Integer.toString(numero);

        int i = 0;
        while (i < numStr.length()) {
            System.out.println(numStr.charAt(i));
            i++;
        }

        scanner.close();
    }
}
