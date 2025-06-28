public class exercicio_45 {
    public static void main(String[] args) {
        int count = 0;
        int a = 0;
        int b = 1;

        System.out.print("Primeiros 20 números da sequência de Fibonacci: ");

        while (count < 20) {
            System.out.print(a + " ");

            int proximo = a + b;
            a = b;
            b = proximo;
            count++;
        }

        System.out.println();
    }
}
