import java.util.Scanner;

public class java21 {
    public static void main(String[] args) throws Exception {
        double moneyV = getValue();
        System.out.println(calMoney(moneyV));
    }

    public static double getValue() {
        Scanner scan = new Scanner(System.in);
        System.out.print("Qual o valor a ser retirado: R$ ");
        double value = scan.nextDouble();
        scan.close();
        return value;
    }

    public static String calMoney(double money) {
        String output = "Você receberá: ";
        int[] cedulas = {0, 0, 0, 0, 0};
        String[] notas = {" notas de R$100, ", " notas de R$50, ", " notas de R$10, ", " notas de R$5, ", " notas de R$1."};
        String[] nota = {" nota de R$100, ", " nota de R$50, ", " nota de R$10, ", " nota de R$5, ", " nota de R$1."};
        
        while (money > 0) {
            if (money >= 100) {
                money -= 100;
                cedulas[0] += 1;
            } else if (money >= 50) {
                money -= 50;
                cedulas[1] += 1;
            } else if (money >= 10) {
                money -= 10;
                cedulas[2] += 1;
            } else if (money >= 5) {
                money -= 5;
                cedulas[3] += 1;
            } else {
                money -= 1;
                cedulas[4] += 1;
            }
        }

        for (int i = 0; i < cedulas.length; i++) {
            if (cedulas[i] != 0) {
                if (cedulas[i] == 1) {
                    output += cedulas[i] + nota[i];
                } else {
                    output += cedulas[i] + notas[i];
                }
            }            
        }
        return output;
    }
}
