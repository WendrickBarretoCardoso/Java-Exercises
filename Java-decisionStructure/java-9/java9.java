import java.util.Scanner;

public class java9 {
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);

        System.out.print("Informe o 1º número:  ");
        double num1 = scan.nextDouble();
        System.out.print("Informe o 2º número:  ");
        double num2 = scan.nextDouble();
        System.out.print("Informe o 3º número:  ");
        double num3 = scan.nextDouble();
        String output = "A ordem decrescente dos números informados são: ";

        if (num1 > num2) {
            if (num1 > num3) {
                if (num2 > num3) {
                    output += num1 + ", " + num2 + ", " + num3;
                } else {
                    output += num1 + ", " + num3 + ", " + num2;
                }
            } else {
                output += num3 + ", " + num1 + ", " + num2;
            }
        } else {
            if (num2 > num3) {
                if (num1 > num3) {
                    output += num2 + ", " + num1 + ", " + num3;;
                } else {
                    output += num2 + ", " + num3 + ", " + num1;
                }
            } else {
                output += num3 + ", " + num2 + ", " + num1;
            }
        }
        System.out.println(output);
        scan.close();
    }
}
