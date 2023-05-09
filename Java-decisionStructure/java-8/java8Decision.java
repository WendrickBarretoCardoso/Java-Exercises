import java.util.Scanner;

public class java8Decision {
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);

        System.out.print("Informe o preço do 1º produto:  ");
        double prodV1 = scan.nextDouble();
        System.out.print("Informe o preço do 2º produto:  ");
        double prodV2 = scan.nextDouble();
        System.out.print("Informe o preço do 3º produto:  ");
        double prodV3 = scan.nextDouble();

        String output = "";

        if (prodV1 < prodV2) {
            if (prodV1 < prodV3) {
                output = String.format("O produto mais barato é o de R$ %.2f ", prodV1);
            } else {
                output = String.format("O produto mais barato é o de R$ %.2f ", prodV3);
            }
        } else {
            if (prodV2 < prodV3) {
                output = String.format("O produto mais barato é o de R$ %.2f ", prodV2);
            } else {
                output = String.format("O produto mais barato é o de R$ %.2f ", prodV3);
            }
        }
        System.out.println(output);
        scan.close();
    }
}
