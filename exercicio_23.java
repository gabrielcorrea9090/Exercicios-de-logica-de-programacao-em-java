import java.util.Scanner;

public class exercicio_23 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o nome do mês (ex: janeiro): ");
        String mes = scanner.nextLine().toLowerCase().trim();

        int dias;

        switch (mes) {
            case "janeiro":
            case "março":
            case "maio":
            case "julho":
            case "agosto":
            case "outubro":
            case "dezembro":
                dias = 31;
                break;
            case "abril":
            case "junho":
            case "setembro":
            case "novembro":
                dias = 30;
                break;
            case "fevereiro":
                dias = 28; // sem considerar ano bissexto
                break;
            default:
                dias = -1;
        }

        if (dias == -1) {
            System.out.println("Mês inválido.");
        } else {
            System.out.println("O mês de " + mes + " possui " + dias + " dias.");
        }

        scanner.close();
    }
}
