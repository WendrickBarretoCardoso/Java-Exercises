import java.util.Scanner;

public class java6 {
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);

        System.out.print("Insira o raio do círculo: ");
        double raio = scan.nextDouble();
        scan.close();

        System.out.printf("A área do círculo é: %.2f m", (3.14 * (raio*raio)));
    }
}
