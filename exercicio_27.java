import java.util.Scanner;

public class exercicio_27 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a idade da pessoa: ");
        int idade = scanner.nextInt();

        System.out.print("Digite o sexo da pessoa (M/F): ");
        char sexo = scanner.next().toUpperCase().charAt(0);

        if (sexo == 'M') {
            if (idade >= 65) {
                System.out.println("Homem pode se aposentar.");
            } else {
                System.out.println("Homem não pode se aposentar.");
            }
        } else if (sexo == 'F') {
            if (idade >= 60) {
                System.out.println("Mulher pode se aposentar.");
            } else {
                System.out.println("Mulher não pode se aposentar.");
            }
        } else {
            System.out.println("Sexo inválido.");
        }

        scanner.close();
    }
}
