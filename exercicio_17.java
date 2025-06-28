import java.util.Scanner;

public class exercicio_17 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a idade da pessoa: ");
        int idade = scanner.nextInt();

        if (idade < 0) {
            System.out.println("Idade inválida.");
        } else if (idade <= 12) {
            System.out.println("A pessoa é criança.");
        } else if (idade <= 17) {
            System.out.println("A pessoa é adolescente.");
        } else if (idade <= 59) {
            System.out.println("A pessoa é adulta.");
        } else {
            System.out.println("A pessoa é idosa.");
        }

        scanner.close();
    }
}
