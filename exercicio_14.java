import java.util.Scanner;

public class exercicio_14 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a idade em anos: ");
        int anos = scanner.nextInt();

        System.out.print("Digite os meses: ");
        int meses = scanner.nextInt();

        System.out.print("Digite os dias: ");
        int dias = scanner.nextInt();

        // calcula total de dias (considerando 1 ano = 365 dias e 1 mês = 30 dias)
        int totalDias = anos * 365 + meses * 30 + dias;

        System.out.println("A pessoa tem aproximadamente " + totalDias + " dias de vida.");

        scanner.close();
    }
}
