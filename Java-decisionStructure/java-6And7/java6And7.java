import java.util.Scanner;

public class java6And7 {
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);

        System.out.print("Informe o 1º número:  ");
        double num1 = scan.nextDouble();
        System.out.print("Informe o 2º número:  ");
        double num2 = scan.nextDouble();
        System.out.print("Informe o 3º número:  ");
        double num3 = scan.nextDouble();

        String output = "";

        if (num1 > num2) {
            if (num1 > num3) {
                if (num2 > num3) {
                    output = String.format("O número %.2f é o maior, e %.2f é o menor", num1, num3);
                } else {
                    output = String.format("O número %.2f é o maior, e %.2f é o menor", num1, num2);
                }
            } else {
                output = String.format("O número %.2f é o maior, e %.2f é o menor", num3, num2);
            }
        } else {
            if (num2 > num3) {
                if (num1 > num3) {
                    output = String.format("O número %.2f é o maior, e %.2f é o menor", num2, num3);
                } else {
                    output = String.format("O número %.2f é o maior, e %.2f é o menor", num2, num1);
                }
            } else {
                output = String.format("O número %.2f é o maior, e %.2f é o menor", num3, num1);
            }
        }

        System.out.println(output);
        scan.close();
    }
}
