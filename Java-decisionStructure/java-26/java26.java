import java.util.Scanner;

public class java26 {
    public static void main(String[] args) throws Exception {
        posto();
    }

    public static void posto() {
        Scanner scan = new Scanner(System.in);
        String output = "";
        System.out.print("1 - Gasolina  |   2 - Álcool\nInforme qual o combustível que você gostaria? R: ");
        int comb = scan.nextInt();
        while (comb != 1 && comb != 2) {
            System.out.print("Escolha incorreta, insira novamente: ");
            comb = scan.nextInt();
        }
        System.out.print("Informe a quantidade de combustível que você deseja: ");
        double quant = scan.nextDouble();
        output = String.format("O valor do reabastecimento foi de: R$%.2f ",descount(comb, quant));
        System.out.println(output);
        scan.close();
    }

    public static double descount(int comb, double quant) {
        double value = 0;
        if (comb == 1) {
            if (quant <= 20.0) {
                value = (2.50*quant) - ((2.50*quant)*0.03);
            } else {
                value = (2.50*quant) - ((2.50*quant)*0.05);
            }
        } else {
            if (quant <= 20.0) {
                value = (1.9*quant) - ((1.9*quant)*0.04);
            } else {
                value = (1.9*quant) - ((1.9*quant)*0.06);
            }
        }
        return value;
    }
}
