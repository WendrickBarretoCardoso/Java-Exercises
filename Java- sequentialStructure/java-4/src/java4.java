import java.util.Scanner;

public class java4 {
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);

        System.out.print("Escreva suas 4 notas do ano: \n1:");
        double num1 = scan.nextDouble();
        System.out.print("2:");
        double num2 = scan.nextDouble();
        System.out.print("3:");
        double num3 = scan.nextDouble();
        System.out.print("4:");
        double num4 = scan.nextDouble();
        scan.close();

        System.out.printf(String.format("Sua média final do semestre é: %.2f", ((num1 + num2 + num3 + num4)/4)));
    }
}
