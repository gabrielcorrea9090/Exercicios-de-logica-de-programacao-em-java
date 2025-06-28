import java.util.Scanner;

public class exercicio_26 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Produtos e seus preços
        // 1 - Arroz: R$ 5,00
        // 2 - Feijão: R$ 7,50
        // 3 - Macarrão: R$ 4,00
        // 4 - Óleo: R$ 6,00

        System.out.print("Digite o código do produto (1-Arroz, 2-Feijão, 3-Macarrão, 4-Óleo): ");
        int codigo = scanner.nextInt();

        System.out.print("Digite a quantidade comprada: ");
        int quantidade = scanner.nextInt();

        double preco = 0;
        boolean codigoValido = true;

        switch (codigo) {
            case 1:
                preco = 5.00;
                break;
            case 2:
                preco = 7.50;
                break;
            case 3:
                preco = 4.00;
                break;
            case 4:
                preco = 6.00;
                break;
            default:
                codigoValido = false;
                System.out.println("Código de produto inválido.");
                break;
        }

        if (codigoValido) {
            double total = preco * quantidade;
            System.out.printf("Valor total a pagar: R$ %.2f%n", total);
        }

        scanner.close();
    }
}
