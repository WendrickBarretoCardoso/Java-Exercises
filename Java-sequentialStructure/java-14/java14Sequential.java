import java.util.Scanner;

public class java14Sequential {
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);

        System.out.print("Insira o peso da qunatidade de peixe trazidos: ");
        double pesoP = scan.nextDouble();
        double valorAd = 0;
        scan.close();

        if (pesoP > 50) {
            valorAd = (pesoP-50)*4;
        }

        String output  = String.format("A quantida de multa a pagar será de R$ %.2f", valorAd);
        System.out.println(output);
    }
}
