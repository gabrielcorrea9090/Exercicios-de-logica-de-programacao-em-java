import java.util.Scanner;

public class exercicio_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o raio do círculo: ");
        double raio = scanner.nextDouble();

        // cálculo da área: π * r²
        double area = Math.PI * raio * raio;

        // cálculo do perímetro (circunferência): 2 * π * r
        double perimetro = 2 * Math.PI * raio;

        System.out.println("Área do círculo: " + area);
        System.out.println("Perímetro do círculo: " + perimetro);

        scanner.close();
    }
}
