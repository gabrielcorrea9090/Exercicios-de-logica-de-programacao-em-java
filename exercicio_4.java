import java.util.Scanner;

public class exercicio_4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicita as três notas
        System.out.print("Digite a primeira nota (peso 2): ");
        double nota1 = scanner.nextDouble();

        System.out.print("Digite a segunda nota (peso 3): ");
        double nota2 = scanner.nextDouble();

        System.out.print("Digite a terceira nota (peso 5): ");
        double nota3 = scanner.nextDouble();

        // verifica se as notas estão no intervalo 0 a 10
        if ((nota1 < 0 || nota1 > 10) || (nota2 < 0 || nota2 > 10) || (nota3 < 0 || nota3 > 10)) {
            System.out.println("Erro: As notas devem estar entre 0 e 10.");
        } else {
            // calcula a média ponderada
            double mediaPonderada = (nota1 * 2 + nota2 * 3 + nota3 * 5) / (2 + 3 + 5);
            System.out.println("Média ponderada: " + mediaPonderada);
        }

        scanner.close();
    }
}
